package view;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JOptionPane;

public class JanelaRespostaView extends JFrame{
	private JLabel mensagem= new JLabel("Cadastro Finalizado!");
	private JButton voltar= new JButton("Realizar outra Operacao");

	public JanelaRespostaView(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500, 300);
		this.setResizable(false);
		this.setLocationRelativeTo(null);

		JPanel painelGeral = new JPanel(new BorderLayout());
		JPanel painelBotoes= new JPanel();
		JPanel painelMensagem= new JPanel();
		GridBagConstraints c= new GridBagConstraints();

		painelMensagem.add(mensagem);
		painelBotoes.add(voltar);
		painelGeral.add(painelMensagem, BorderLayout.CENTER);
		painelGeral.add(painelBotoes, BorderLayout.SOUTH);

		this.add(painelGeral);
		this.pack();
	}

	public void addRespostaListener(ActionListener listener){
        voltar.addActionListener(listener);
    }

    public void mostrarMensagemErro(String mensagem){
        JOptionPane.showMessageDialog(this, mensagem);
    }
}