package view;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JOptionPane;

public class CadastroCursoView extends JFrame{
	private JLabel cod= new JLabel("Cod:   ");
	private JLabel mensalidade= new JLabel("Mensalidade:   ");
	private JLabel idioma= new JLabel("Idioma:   ");

	private JTextField codArea= new JTextField(20);
	private JTextField mensalidadeArea= new JTextField(20);
	private JTextField idiomaArea= new JTextField(20);

	private JButton cadastrar= new JButton("Cadastrar");
	private JButton voltar= new JButton("Voltar");


	public CadastroCursoView(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(440, 250);
		this.setResizable(false);
		this.setLocationRelativeTo(null);

		cadastrar.setPreferredSize(new Dimension(100, 25));
		voltar.setPreferredSize(new Dimension(100, 25));

		JPanel painelGeral = new JPanel(new GridBagLayout());
		JPanel painelForm= new JPanel(new GridBagLayout());
		JPanel painelBotoes= new JPanel();
		GridBagConstraints c= new GridBagConstraints();

		c.gridx= 0;
		c.gridy= 0;
		c.anchor= GridBagConstraints.LINE_END;
		painelForm.add(cod, c);
		c.gridy++;
		painelForm.add(mensalidade, c);
		c.gridy++;
		painelForm.add(idioma, c);

		c.gridx= 1;
		c.gridy= 0;
		c.anchor= GridBagConstraints.LINE_START;
		painelForm.add(codArea, c);
		c.gridy++;
		painelForm.add(mensalidadeArea, c);
		c.gridy++;
		painelForm.add(idiomaArea, c);

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