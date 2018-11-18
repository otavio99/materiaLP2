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

public class JanelaOpcoesView extends JFrame{
	private JButton cadastrarAluno= new JButton("Cadastrar Aluno");
	private JButton cadastrarProfessor= new JButton("Cadastrar Professor");
	private JButton cadastrarCurso= new JButton("Cadastrar Curso");
	


	public JanelaOpcoesView(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(440, 300);
		this.setResizable(false);
		this.setLocationRelativeTo(null);

		cadastrarAluno.setPreferredSize(new Dimension(170, 25));
		cadastrarProfessor.setPreferredSize(new Dimension(170, 25));
		cadastrarCurso.setPreferredSize(new Dimension(170, 25));

		JPanel painelGeral = new JPanel();
		JPanel space = new JPanel();
		space.setPreferredSize(new Dimension(0, 45));
		JPanel painelOp= new JPanel(new GridBagLayout());
		GridBagConstraints c= new GridBagConstraints();
		c.gridy= 0;
		painelOp.add(cadastrarAluno, c);
		c.gridy++;
		painelOp.add(cadastrarProfessor, c);
		c.gridy++;
		painelOp.add(cadastrarCurso, c);

		painelGeral.add(painelOp);

		this.add(space, BorderLayout.NORTH);
		this.add(painelGeral, BorderLayout.CENTER);


		cadastrarAluno.setActionCommand("cadastrarAluno");
		cadastrarProfessor.setActionCommand("cadastrarProfessor");
		cadastrarCurso.setActionCommand("cadastrarCurso");
	}

	public void addOpcoesListener(ActionListener listener){
        cadastrarAluno.addActionListener(listener);
        cadastrarProfessor.addActionListener(listener);
        cadastrarCurso.addActionListener(listener);
     
    }

}