package view;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JOptionPane;


public class ProfessorView extends JFrame{
	private JLabel nome= new JLabel("Nome:");
	private JLabel endereco= new JLabel("Endereco:");
	private JLabel telefone= new JLabel("Telefone:");
	private JLabel cpf= new JLabel("Cpf:");
	private JLabel tipo= new JLabel("Tipo:");
	private JLabel salario= new JLabel("Salario:");
        private JLabel titulacao= new JLabel("Titulo:");

	private JTextField nomeArea= new JTextField(20);
	private JTextField enderecoArea= new JTextField(20);
	private JTextField telefoneArea= new JTextField(20);
	private JTextField cpfArea= new JTextField(20);
	private JTextField tipoArea= new JTextField(20);
	private JTextField salarioArea= new JTextField(20);
        private JTextField titulacaoArea= new JTextField(20);

	private JButton cadastrar= new JButton("Cadastrar");
	private JButton voltar= new JButton("Voltar");


	public ProfessorView(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(440, 300);
		this.setResizable(false);
		this.setLocationRelativeTo(null);

		cadastrar.setPreferredSize(new Dimension(100, 25));
		voltar.setPreferredSize(new Dimension(100, 25));

		JPanel painelGeral = new JPanel(new GridBagLayout());
		JPanel painelForm= new JPanel(new GridBagLayout());
		JPanel painelBotoes= new JPanel();
		JPanel painelBotaoCadastrar= new JPanel();
		JPanel painelBotaoVoltar= new JPanel();
		GridBagConstraints c= new GridBagConstraints();

		c.gridx= 0;
		c.gridy= 0;
		c.anchor= GridBagConstraints.LINE_END;
		painelForm.add(nome, c);
                c.insets= new Insets(4,4,4,4);
		c.gridy++;
		painelForm.add(endereco, c);
		c.gridy++;
		painelForm.add(telefone, c);
		c.gridy++;
		painelForm.add(cpf, c);
		c.gridy++;
		painelForm.add(tipo, c);
		c.gridy++;
		painelForm.add(salario, c);
                c.gridy++;
		painelForm.add(titulacao, c);

		c.gridx= 1;
		c.gridy= 0;
		c.anchor= GridBagConstraints.LINE_START;
		painelForm.add(nomeArea, c);
		c.gridy++;
		painelForm.add(enderecoArea, c);
		c.gridy++;
		painelForm.add(telefoneArea, c);
		c.gridy++;
		painelForm.add(cpfArea, c);
		c.gridy++;
		painelForm.add(tipoArea, c);
		c.gridy++;
		painelForm.add(salarioArea, c);
                c.gridy++;
		painelForm.add(titulacaoArea, c);

		painelBotoes.add(cadastrar);
		painelBotoes.add(voltar);

		GridBagConstraints c2= new GridBagConstraints();
		c2.gridx= 0;
		c2.gridy= 0;
		c2.weighty=5;
		painelGeral.add(painelForm, c2);
		c2.gridy++;
		painelGeral.add(painelBotoes, c2);

		this.add(painelGeral);
	
		
		cadastrar.setActionCommand("cadastrar");
		voltar.setActionCommand("voltar");
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
        public String getTitulacaoArea(){
		return titulacaoArea.getText();
	}

	public void addProfessorListener(ActionListener listener){
        cadastrar.addActionListener(listener);
        voltar.addActionListener(listener);
        this.setFocusable(true);
    }

    public void mostrarMensagem(String mensagem){
        JOptionPane.showMessageDialog(this, mensagem);
    }

}