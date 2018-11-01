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

public class CadastroProfessorView extends JFrame{
	private JLabel nome= new JLabel("Nome:");
	private JLabel endereco= new JLabel("Endereco:");
	private JLabel telefone= new JLabel("Telefone:");
	private JLabel cpf= new JLabel("Cpf:");
	private JLabel tipo= new JLabel("Tipo:");
	private JLabel salario= new JLabel("Salario");

	private JTextField nomeArea= new JTextField(20);
	private JTextField enderecoArea= new JTextField(20);
	private JTextField telefoneArea= new JTextField(20);
	private JTextField cpfArea= new JTextField(20);
	private JTextField tipoArea= new JTextField(20);
	private JTextField salarioArea= new JTextField(20);

	private JButton cadastrar= new JButton("Cadastrar");
	private JButton voltar= new JButton("Voltar");


	public CadastroProfessorView(){

		JPanel cadastroPanel = new JPanel();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500, 300);
		this.getContentPane().setLayout(new FlowLayout());
		this.setLocationRelativeTo(null);

		JPanel painelGeral = new JPanel(new GridLayout(8, 1));
		JPanel painelNome= new JPanel();
		JPanel painelEndereco= new JPanel();
		JPanel painelTelefone= new JPanel();
		JPanel painelCpf= new JPanel();
		JPanel painelTipo= new JPanel();
		JPanel painelSalario= new JPanel();

		cadastrar.setActionCommand("cadastrar");
		voltar.setActionCommand("voltar");

		painelNome.add(nome);
		painelNome.add(nomeArea);
		painelEndereco.add(endereco);
		painelEndereco.add(enderecoArea);
		painelTelefone.add(telefone);
		painelTelefone.add(telefoneArea);
		painelCpf.add(cpf);
		painelCpf.add(cpfArea);
		painelTipo.add(tipo);
		painelTipo.add(tipoArea);
		painelSalario.add(salario);
		painelSalario.add(salarioArea);

		painelGeral.add(painelNome);
		painelGeral.add(painelEndereco);
		painelGeral.add(painelTelefone);
		painelGeral.add(painelCpf);
		painelGeral.add(painelTipo);
		painelGeral.add(painelSalario);

		painelGeral.add(cadastrar);
		painelGeral.add(voltar);
		this.add(painelGeral);
	}

	public String getNomeArea(){
		return this.nomeArea.getText();
	}
	public String getEnderecoArea(){
		return this.enderecoArea.getText();
	}
	public String getTelefoneArea(){
		return this.telefoneArea.getText();
	}
	public String getCpfArea(){
		return this.cpfArea.getText();
	}
	public String getTipoArea(){
		return this.tipoArea.getText();
	}
	public double getSalarioArea(){
		return Double.parseDouble(salarioArea.getText());
	}

	public void addCadastroProfessorListener(ActionListener listener){
        cadastrar.addActionListener(listener);
        voltar.addActionListener(listener);
        this.setFocusable(true);
    }

    public void mostrarMensagemErro(String mensagem){
        JOptionPane.showMessageDialog(this, mensagem);
    }

}