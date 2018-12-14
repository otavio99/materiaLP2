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

public class AlunoDisciplinaView extends JFrame{
	private JLabel codAluno= new JLabel("Codigo do Aluno:");
	private JLabel codDisciplina= new JLabel("Codigo da Disciplina:");
	private JLabel n1= new JLabel("N1:");
	private JLabel n2= new JLabel("N2:");
	private JLabel anoSemestre= new JLabel("Semestre:");

	private JTextField codAlunoArea= new JTextField(20);
	private JTextField codDisciplinaArea= new JTextField(20);
	private JTextField n1Area= new JTextField(20);
	private JTextField n2Area= new JTextField(20);
	private JTextField anoSemestreArea= new JTextField(20);

	private JButton cadastrar= new JButton("Cadastrar");
	private JButton atualizar= new JButton("Atualizar");
	private JButton excluir= new JButton("Excluir");
	private JButton voltar= new JButton("Voltar");

	public AlunoDisciplinaView(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(440, 250);
		this.setResizable(false);
		this.setLocationRelativeTo(null);

		cadastrar.setPreferredSize(new Dimension(100, 25));
		voltar.setPreferredSize(new Dimension(100, 25));

		JPanel painelGeral = new JPanel(new GridBagLayout());
		JPanel painelForm= new JPanel(new GridBagLayout());
		JPanel painelBotoes= new JPanel();
		JPanel painelBotaoCadastrar= new JPanel();
		JPanel painelBotaoVoltar= new JPanel();
                JPanel espaco= new JPanel();
		GridBagConstraints c= new GridBagConstraints();

		c.gridx= 0;
		c.gridy= 0;
		c.anchor= GridBagConstraints.LINE_END;
                c.insets= new Insets(4,4,4,4);
		painelForm.add(codAluno, c);
		c.gridy++;
		painelForm.add(codDisciplina, c);
		c.gridy++;
		painelForm.add(n1, c);
		c.gridy++;
		painelForm.add(n2, c);
		c.gridy++;
		painelForm.add(anoSemestre, c);


		c.gridx= 1;
		c.gridy= 0;
		c.anchor= GridBagConstraints.LINE_START;
		painelForm.add(codAlunoArea, c);
		c.gridy++;
		painelForm.add(codDisciplinaArea, c);
		c.gridy++;
		painelForm.add(n1Area, c);
		c.gridy++;
		painelForm.add(n2Area, c);
		c.gridy++;
		painelForm.add(anoSemestreArea, c);

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

	public int getCodAlunoArea(){
		return Integer.parseInt(this.codAlunoArea.getText());
	}
	public int getCodDisciplinaArea(){
		return Integer.parseInt(this.codDisciplinaArea.getText());
	}
	public float getN1Area(){
		return Float.parseFloat(this.n1Area.getText());
	}
	public float getN2Area(){
		return Float.parseFloat(this.n2Area.getText());
	}
	public int getAnoSemestreArea(){
		return Integer.parseInt(this.anoSemestre.getText());
	}

	public void addAlunoDisciplinaListener(ActionListener listener){
            cadastrar.addActionListener(listener);
            voltar.addActionListener(listener);
            this.setFocusable(true);
        }

    public void mostrarMensagem(String mensagem){
        JOptionPane.showMessageDialog(this, mensagem);
    }

}
