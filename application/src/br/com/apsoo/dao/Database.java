package br.com.apsoo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Database {
    private String url = "jdbc:postgresql://localhost/APSOO?user=gerenciador_banco&password=#leitor963@";
    private Connection conn;
    private Statement smt;
    private ResultSet rs;
    
    public Database() {
        try {
            this.conn = DriverManager.getConnection(this.url);
            this.smt = this.conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            System.out.println("DB Connected");
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public List buscaTabela(String campos, String tabela, String joins, String filtro) {
        String query = "SELECT " + campos + " FROM public." + tabela + " " + joins + " " + filtro;
        List<String> resultado = new ArrayList<>();
        String registro  = "";
        try {
            this.rs = this.smt.executeQuery(query);
            
            if(this.rs != null){
                while(this.rs.next()){
                    for(int i=1; i <= this.rs.getMetaData().getColumnCount(); i++){
                        if(i>1 || i==this.rs.getMetaData().getColumnCount()-1){
                            registro = registro.concat(",");
                        }
                        registro = registro.concat(this.rs.getString(i));
                    }
                    resultado.add(registro);
                    registro = "";
                }    
            }
            else throw new SQLException();
            this.rs = null;
            return resultado;
            
        } catch (SQLException e) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, e);
        }
        return resultado;
    }
    
    public void insereTabela(String tabela, String campos, String valores) {
        String query = "INSERT INTO " + tabela +"("+campos+") VALUES ("+valores+")";
        try {
            this.smt.executeUpdate(query);
        } catch (SQLException e) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, e);
        }      
    }
    
    public void atualizaTabela(String tabela, String campo, String valor, String filtro) {
        String query = "UPDATE " + tabela +" SET "+ campo + " = "+valor + " " + filtro;
        try {
            this.smt.executeUpdate(query);
        } catch (SQLException e) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, e);
        }      
    }
    
    public void deletaTabela(String tabela, String filtro) {
        String query = "DELETE FROM " + tabela + " " + filtro;
        try {
            this.smt.executeUpdate(query);
        } catch (SQLException e) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, e);
        }      
    }
    
    //public static void main(String[] args) {Database db = new Database();}
}
