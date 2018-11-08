package br.com.ifms.outros;

import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 * @author andreqbs
 */
public class ListarContatos extends JFrame {

    JPanel painelFundo;
    JTable tabela;
    JScrollPane barraRolagem;
    
    String[] colunas = {"Nome", "Telefone", "Email"};

    Object[][] dados = {
        {"Toto", "67 9953-7890", "otavio@gmail.com"},
        {"Lulu", "67 8290-3456", "luis@hotmail.com"},
        {"Soso", "67 9170-1234", "soso@gmail.com"},
        {"Cricri", "67 9170-1234", "soso@gmail.com"},
        {"Tata", "67 9170-1234", "soso@gmail.com"}
    };

    public ListarContatos() {
        super("Contatos");
    }

    public void criaJanela() {

        painelFundo = new JPanel();
        painelFundo.setLayout(new GridLayout(1, 1));
        
        tabela = new JTable(dados, colunas);
        barraRolagem = new JScrollPane(tabela);
        painelFundo.add(barraRolagem);

        getContentPane().add(painelFundo);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 120);
        setVisible(true);
    }

    public static void main(String[] args) {
        ListarContatos lc = new ListarContatos();
        lc.criaJanela();
    }
}
