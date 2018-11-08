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
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author andreqbs
 */
public class AtualizarContato extends JFrame {
    
     private ContatoTableModel modelo;
    private JPanel painelFundo;
    private JButton btSalvar;
    private JButton btLimpar;
    private JLabel lbNome;
    private JLabel lbTelefone;
    private JLabel lbEmail;
    private JLabel lbId;
    private JTextField txfNome;
    private JTextField txfId;
    private JTextField txfTelefone;
    private JTextField txfEmail;
    private int linhaSelecionada;
 
    private ContatoController cc;
    
    public AtualizarContato(ContatoTableModel md, int id, int linha) {
        super("Contatos");
        criaJanela();
        modelo = md;
        Contato contato = cc.listarContato(id);
        txfId.setText(Integer.toString(contato.getId()));
        txfNome.setText(contato.getNome());
        txfTelefone.setText(contato.getTelefone());
        txfEmail.setText(contato.getEmail());
        linhaSelecionada = linha;  
        
    }
 
    public void criaJanela() {
        btSalvar = new JButton("Salvar");
        btLimpar = new JButton("Limpar");
        lbNome = new JLabel("         Nome.:   ");
        lbTelefone = new JLabel("         Telefone.:   ");
        lbEmail = new JLabel("         Email.:   ");
        lbId = new JLabel("         Id.:   ");
        txfNome = new JTextField();
        txfTelefone = new JTextField();
        txfEmail = new JTextField();
        txfId = new JTextField();
        txfId.setEditable(false);
        
        cc = new ContatoController();
 
        painelFundo = new JPanel();
        painelFundo.setLayout(new GridLayout(5, 2, 2, 4));
        painelFundo.add(lbId);
        painelFundo.add(txfId);
        painelFundo.add(lbNome);
        painelFundo.add(txfNome);
        painelFundo.add(lbTelefone);
        painelFundo.add(txfTelefone);
        painelFundo.add(lbEmail);
        painelFundo.add(txfEmail);
        painelFundo.add(btLimpar);
        painelFundo.add(btSalvar);
 
        getContentPane().add(painelFundo);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(300, 150);
        setVisible(true);
 
        btSalvar.addActionListener(new AtualizarContato.BtSalvarListener());
        btLimpar.addActionListener(new AtualizarContato.BtLimparListener());
    }
 
    private class BtSalvarListener implements ActionListener {
 
        public void actionPerformed(ActionEvent e) {
           
            cc.atualizar(Integer.parseInt(txfId.getText()), txfNome.getText(), txfTelefone.getText(), txfEmail.getText());
            Contato c = cc.listarContato(Integer.parseInt(txfId.getText()));
            modelo.updateContato(linhaSelecionada, c);
            setVisible(false);
        }
    }
 
    private class BtLimparListener implements ActionListener {
 
        public void actionPerformed(ActionEvent e) {
            txfNome.setText("");
            txfTelefone.setText("");
            txfEmail.setText("");
        }
    }
    
}
