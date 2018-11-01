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

public class CadastroCursoView extends JFrame{
	private JLabel cod= new JLabel("Cod:");
	private JLabel mensalidade= new JLabel("Mensalidade:");
	private JLabel idioma= new JLabel("Idioma:");

	private JTextField codArea= new JTextField(20);
	private JTextField mensalidadeArea= new JTextField(20);
	private JTextField idiomaArea= new JTextField(20);

	private JButton cadastrar= new JButton("Cadastrar");
	private JButton voltar= new JButton("voltar");


	public CadastroCursoView(){

		JPanel cadastroPanel = new JPanel();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500, 300);
		this.getContentPane().setLayout(new FlowLayout());
		this.setLocationRelativeTo(null);

		JPanel painelGeral = new JPanel(new GridLayout(5, 1));
		JPanel painelCod= new JPanel();
		JPanel painelMensalidade= new JPanel();
		JPanel painelIdioma= new JPanel();

		cadastrar.setActionCommand("cadastrar");
		voltar.setActionCommand("voltar");

		painelCod.add(cod);
		painelCod.add(codArea);
		painelMensalidade.add(mensalidade);
		painelMensalidade.add(mensalidadeArea);
		painelIdioma.add(idioma);
		painelIdioma.add(idiomaArea);

		painelGeral.add(painelCod);
		painelGeral.add(painelMensalidade);
		painelGeral.add(painelIdioma);

		painelGeral.add(cadastrar);
		painelGeral.add(voltar);
		this.add(painelGeral);
	}

	public int getCodArea(){
		return Integer.parseInt(codArea.getText());
	}
	public Double getMensalidadeArea(){
		return Double.parseDouble(mensalidadeArea.getText());
	}
	public String getIdiomaArea(){
		return this.idiomaArea.getText();
	}

	public void addCadastroCursoListener(ActionListener listener){
        cadastrar.addActionListener(listener);
        voltar.addActionListener(listener);
        this.setFocusable(true);
    }

    public void mostrarMensagemErro(String mensagem){
        JOptionPane.showMessageDialog(this, mensagem);
    }

}