package view;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ListarContato extends JFrame{
	private JPanel painelFundo= new JPanel(new BorderLayout());
	private JPanel painelBotoes= new JPanel();
	private JTable tabela= new JTable();
	private JScrollPane barraRolagem= new JScrollPane();
	private JButton btInserir= new JButton("Inserir");
	private JButton btExcluir= new JButton("Excluir");
	private JButton btEditar= new JButton("Editar");	

	public ListarContato(){
	}

	public void criaJanela(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500, 300);
		this.setResizable(false);
		this.setLocationRelativeTo(null);

		painelBotoes.add(btInserir);
		painelBotoes.add(btExcluir);
		painelBotoes.add(btEditar);

		barraRolagem.add(tabela);
		painelFundo.add(barraRolagem, BorderLayout.CENTER);
		painelFundo.add(painelBotoes, BorderLayout.SOUTH);

		this.getContentPane().add(painelFundo);

		this.setVisible(true);
	}

	private void criaJTable(){ 
		//mater vazio 
	}

	public static void pesquisar(DefaultTableModel modelo){ 
		//manter vazio 
	}

}