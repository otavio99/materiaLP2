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

public class JanelaOpcoesView extends JFrame{
    private JButton jAluno= new JButton("Aluno");
    private JButton jProfessor= new JButton("Professor");
    private JButton jCurso= new JButton("Curso");
    private JButton jTurma= new JButton("Turma");
    private JButton jDisciplina= new JButton("Disciplina");
    private JButton jAlunoDisciplina= new JButton("Aluno-Disciplina");
    private JButton jProfessorDisciplina= new JButton("Professor-Disciplina");
	


	public JanelaOpcoesView(){
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setSize(440, 400);
            this.setResizable(false);
            this.setLocationRelativeTo(null);

            jAluno.setPreferredSize(new Dimension(170, 25));
            jProfessor.setPreferredSize(new Dimension(170, 25));
            jCurso.setPreferredSize(new Dimension(170, 25));
            jTurma.setPreferredSize(new Dimension(170, 25));
            jDisciplina.setPreferredSize(new Dimension(170, 25));
            jAlunoDisciplina.setPreferredSize(new Dimension(170, 25));
            jProfessorDisciplina.setPreferredSize(new Dimension(170, 25));

		JPanel painelGeral = new JPanel();
		JPanel space = new JPanel();
		space.setPreferredSize(new Dimension(0, 45));
		JPanel painelOp= new JPanel(new GridBagLayout());
		GridBagConstraints c= new GridBagConstraints();
		c.gridy= 0;
                c.insets= new Insets(4,4,4,4);
		painelOp.add(jAluno, c);
		c.gridy++;
		painelOp.add(jProfessor, c);
		c.gridy++;
		painelOp.add(jCurso, c);
            c.gridy++;
		painelOp.add(jTurma, c);
			c.gridy++;
		painelOp.add(jDisciplina, c);
		c.gridy++;
		painelOp.add(jAlunoDisciplina, c);
		c.gridy++;
		painelOp.add(jProfessorDisciplina, c);

		painelGeral.add(painelOp);

		this.add(space, BorderLayout.NORTH);
		this.add(painelGeral, BorderLayout.CENTER);


		jAluno.setActionCommand("cadastrarAluno");
		jProfessor.setActionCommand("cadastrarProfessor");
		jCurso.setActionCommand("cadastrarCurso");
        jTurma.setActionCommand("cadastrarTurma");
        jDisciplina.setActionCommand("cadastrarDisciplina");
        jAlunoDisciplina.setActionCommand("cadastrarAlunoDisciplina");
        jProfessorDisciplina.setActionCommand("cadastrarProfessorDisciplina");
	}

	public void addOpcoesListener(ActionListener listener){
        jAluno.addActionListener(listener);
        jProfessor.addActionListener(listener);
        jCurso.addActionListener(listener);
        jTurma.addActionListener(listener);
        jDisciplina.addActionListener(listener);
        jAlunoDisciplina.addActionListener(listener);
        jProfessorDisciplina.addActionListener(listener);
     
    }

}