package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.*;

public class JanelaRespostaView extends JFrame{
	private JLabel mensagem= new JLabel("Cadastro Finalizado!");
	private JButton voltar= new JButton("Realizar outra Operação");

	public JanelaRespostaView(){
		JPanel cadastroPanel = new JPanel();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500, 300);
		this.getContentPane().setLayout(new FlowLayout());
		this.setLocationRelativeTo(null);

		JPanel painelGeral = new JPanel(new GridLayout(2, 1));
		JPanel painelMensagem= new JPanel();
		JPanel painelBotao= new JPanel();

		painelMensagem.add(mensagem);
		painelBotao.add(voltar);

		painelGeral.add(painelMensagem);
		painelGeral.add(painelBotao);

		this.add(painelGeral);
	}

	public void addRespostaListener(ActionListener listener){
        voltar.addActionListener(listener);
    }

    public void mostrarMensagemErro(String mensagem){
        JOptionPane.showMessageDialog(this, mensagem);
    }
}