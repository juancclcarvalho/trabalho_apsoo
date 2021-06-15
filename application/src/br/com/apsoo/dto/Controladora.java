
package br.com.apsoo.dto;

import br.com.apsoo.dao.Database;
import br.com.apsoo.util.Router;
import javax.swing.JFrame;

/*
    Ideia de implementação da controladora: um router das opções da interface.
    Cada rota deste router da inicio a uma operação no sistema e troca uma tela
    na interface.
    Cada operação iniciada terá que ser finalizada.
    O router está dentro de um loop infinito, que só quem termina é a interface fechar.

    Router -> Chama Venda() -> chama IniciarVenda() -> chama FinalizarVenda()
    Venda - da a opcao entre venda e orcamento
    Iniciar venda - troca para a tela de venda em branco
    --- USUARIO ESCOLHE OS PRODUTOS --- OU PREENCHEMOS HARDCODED ---
    Finalizar venda - Troca para tela/menu de pagamento
    Pagamento Confirmado - Escreve tudo em branco e volta para tela inicial / switch do router

    Router -> Chama Venda() -> chama IniciarOrcamento() -> chama FinalizarOrcamento()
    
    Alguns dos botoes da interface devem ser os responsáveis por escolher as operações.


    Pode se criar um enum com as operações do router.
    
*/
public class Controladora {
    
    private Database bd;
    private JFrame grafica;
    
    
    public static void main(String[] args) {
        
    }
}


