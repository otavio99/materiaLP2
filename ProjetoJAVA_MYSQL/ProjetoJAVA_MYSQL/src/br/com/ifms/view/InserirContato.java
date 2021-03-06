/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifms.view;

import br.com.ifms.controller.ContatoController;
import br.com.ifms.model.Contato;
import br.com.ifms.model.ContatoTableModel;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.util.List;

/**
 *
 * @author andreqbs
 */
public class InserirContato extends JFrame {

    private ContatoTableModel modelo;
    private JPanel painelFundo;
    private JButton btSalvar;
    private JButton btLimpar;
    private JLabel lbNome;
    private JLabel lbTelefone;
    private JLabel lbEmail;
    private JTextField txNome;
    private JTextField txTelefone;
    private JTextField txEmail;
    private ContatoController cc;

    public InserirContato(ContatoTableModel md) {
        super("Contatos");
        criaJanela();
        modelo = md;
    }

    public void criaJanela() {
        btSalvar = new JButton("Salvar");
        btLimpar = new JButton("Limpar");
        lbNome = new JLabel("         Nome.:   ");
        lbTelefone = new JLabel("         Telefone.:   ");
        lbEmail = new JLabel("         Email.:   ");
        txNome = new JTextField(10);
        txTelefone = new JTextField();
        txEmail = new JTextField();
        cc = new ContatoController();

        painelFundo = new JPanel();
        painelFundo.setLayout(new GridLayout(4, 2, 2, 4));
        painelFundo.add(lbNome);
        painelFundo.add(txNome);
        painelFundo.add(lbTelefone);
        painelFundo.add(txTelefone);
        painelFundo.add(lbEmail);
        painelFundo.add(txEmail);
        painelFundo.add(btLimpar);
        painelFundo.add(btSalvar);

        getContentPane().add(painelFundo);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(300, 150);
        setVisible(true);

        btSalvar.addActionListener(new BtSalvarListener());
        btLimpar.addActionListener(new BtLimparListener());
    }

    private class BtSalvarListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            cc.adicionar(txNome.getText(), txTelefone.getText(), txEmail.getText());

            Contato c = new Contato();
            c.setNome(txNome.getText());
            c.setTelefone(txTelefone.getText());
            c.setEmail(txEmail.getText());
            modelo.addContato(pesquisar(c));
 
            setVisible(false);
        }
    }

    private class BtLimparListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            txNome.setText("");
            txTelefone.setText("");
            txEmail.setText("");
        }
    }

    public Contato pesquisar(Contato co) {
        Contato contato = cc.listarContato(co);
        return contato;
    }

    public static void main(String[] args) {
        ContatoTableModel model= new ContatoTableModel();
        InserirContato lc = new InserirContato(model);
        lc.setVisible(true);
    }

}
