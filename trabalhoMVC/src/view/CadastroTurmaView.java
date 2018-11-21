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

public class CadastroTurmaView extends JFrame{
	private JLabel horario= new JLabel("Horario:");
	private JLabel professor= new JLabel("Professor:");
	private JLabel numVagas= new JLabel("Numero de vagas:");
        private JLabel descricaoCurso= new JLabel("Curso:");

	private JTextField horarioArea= new JTextField(20);
	private JTextField professorArea= new JTextField(20);
	private JTextField numVagasArea= new JTextField(20);
        private JTextField descricaoCursoArea= new JTextField(20);
        
	private JButton cadastrar= new JButton("Cadastrar");
	private JButton voltar= new JButton("Voltar");

	public CadastroTurmaView(){
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
		painelForm.add(horario, c);
		c.gridy++;
		painelForm.add(professor, c);
		c.gridy++;
		painelForm.add(numVagas, c);
		c.gridy++;
		painelForm.add(descricaoCurso, c);

		c.gridx= 1;
		c.gridy= 0;
		c.anchor= GridBagConstraints.LINE_START;
		painelForm.add(horarioArea, c);
		c.gridy++;
		painelForm.add(professorArea, c);
		c.gridy++;
		painelForm.add(numVagasArea, c);
		c.gridy++;
		painelForm.add(descricaoCursoArea, c);

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

	public String getHorarioArea(){
		return this.horarioArea.getText();
	}
	public String getProfessorArea(){
		return this.professorArea.getText();
	}
	public String getNumVagasArea(){
		return this.numVagasArea.getText();
	}
	public String getDescricaoCursoArea(){
		return this.descricaoCursoArea.getText();
	}
	

	public void addCadastroAlunoListener(ActionListener listener){
            cadastrar.addActionListener(listener);
            voltar.addActionListener(listener);
            this.setFocusable(true);
        }
	//OI!!!

    public void mostrarMensagem(String mensagem){
        JOptionPane.showMessageDialog(this, mensagem);
    }

}
