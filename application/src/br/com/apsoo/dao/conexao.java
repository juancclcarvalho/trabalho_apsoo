package br.com.apsoo.dao;

import java.sql.*;
import javax.swing.JOptionPane;

public class conexao {

    //vamos criar uma constante para fazer referência ao conector
    final private String Driver = "org.postgresql.Driver";

    //Vamos criar uma instância da classe Connection
    private Connection con;
    final private String url = "jdbc:postgresql://localhost:5432/postgres";

    //vamos criar um objeto referente a classe Statement
    public Statement stat;
    //camos criar um objeto referente à classe ResultSet, que controla resultados de pesquisas SQL: "select"
    public ResultSet rs;

    //abaixo vamos impementar o método que vamos dar o nome de conectar() para estabelecer conexão mcom um BD
    public boolean conectar() {
        boolean result = true;
        try {
            //vamos carregar o driver
            Class.forName(Driver);
            //String senha;
            //senha = JOptionPane.showInputDialog("Digite a senha de acesso");
            //vamos criar o código que vai estabelecer a conexão
            String usuario = "postgres";
            String senha = "";
            con = DriverManager.getConnection(url, usuario, senha); //123
            //se funcionar, irá aparecer a mensagem:
            //JOptionPane.showMessageDialog(null, "Conectou!");
            result = true;
        } catch (ClassNotFoundException erroDriver) {
            System.out.println("Erro Driver: " + erroDriver);
            result = false;
        } catch (SQLException erroSQL) {
            System.out.println("Erro SQL: " + erroSQL);
            result = false;
        }
        //retorno do método
        return result;
    }

    //Vamos criar um método capaz de buscar informação no banco de dados específico

    public void pesquisar(String sql) {
        try {
            stat = con.createStatement(
                    rs.TYPE_SCROLL_INSENSITIVE, rs.CONCUR_READ_ONLY);

            //o objeto rs irá armazenar os resultados de uma pesquisa: "select * from nometabela
            rs = stat.executeQuery(sql);
        } catch (SQLException erroSQL) {
            System.out.println("Erro SQL: " + erroSQL);
        }
    }

    public void atualizar(String sql) {
        try {
            stat = con.createStatement();
            //o método executeUpdate executa o código SQL relacionado a
            // atualização de dados
            stat.executeUpdate(sql);
            System.out.println("Operação realizada com sucesso");
        } catch (SQLException erroSQL) {
            System.out.println("Erro SQL: " + erroSQL);
        }
    }
}