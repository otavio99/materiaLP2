package view;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;


public class InserirContato extends JFrame{
	private DefaultTableModel modelo = new DefaultTableModel();
	private JPanel painelFundo= new JPanel(new GridBagLayout());
	private JPanel painelBotoes= new JPanel();
	private JButton btSalvar= new JButton("Salvar");
	private JButton btLimpar= new JButton("Limpar");
	private JLabel lbNome= new JLabel("Nome: ");
	private JLabel lbTelefone= new JLabel("Telefone: ");
	private JLabel lbEmail= new JLabel("Email: ");
	private JTextField txNome= new JTextField(15);
	private JTextField txTelefone= new JTextField(15);
	private JTextField txEmail= new JTextField(15);
	//private ContatoController cc; Voce não mandou criar ;)

	public InserirContato(DefaultTableModel md) { }

	public void criaJanela(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(350, 200);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		
		GridBagConstraints cons= new GridBagConstraints();
		cons.gridx= 0;
		cons.gridy= 0;
		cons.anchor= GridBagConstraints.LINE_END;
		painelFundo.add(lbNome, cons);
		cons.gridy++;
		painelFundo.add(lbTelefone, cons);
		cons.gridy++;
		painelFundo.add(lbEmail, cons);

		cons.gridx= 1;
		cons.gridy= 0;
		cons.anchor= GridBagConstraints.LINE_START;
		painelFundo.add(txNome, cons);
		cons.gridy++;
		painelFundo.add(txTelefone, cons);
		cons.gridy++;
		painelFundo.add(txEmail, cons);

		painelBotoes.add(btLimpar);
		painelBotoes.add(btSalvar);
		
		this.add(painelFundo, BorderLayout.CENTER);
		this.add(painelBotoes, BorderLayout.SOUTH);

		this.pack();

		this.setVisible(true);
	}
}