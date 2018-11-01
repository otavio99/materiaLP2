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

public class JanelaOpcoesView extends JFrame{
	private JButton cadastrarAluno= new JButton("Cadastrar Aluno");
	private JButton cadastrarProfessor= new JButton("Cadastrar Professor");
	private JButton cadastrarCurso= new JButton("Cadastrar Curso");
	


	public JanelaOpcoesView(){
		JPanel opPanel = new JPanel();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500, 400);
		this.setLocationRelativeTo(null);

		cadastrarAluno.setActionCommand("cadastrarAluno");
		cadastrarProfessor.setActionCommand("cadastrarProfessor");
		cadastrarCurso.setActionCommand("cadastrarCurso");


		opPanel.add(cadastrarAluno);
		opPanel.add(cadastrarProfessor);
		opPanel.add(cadastrarCurso);
	

		this.add(opPanel);
	}

	public void addOpcoesListener(ActionListener listener){
        cadastrarAluno.addActionListener(listener);
        cadastrarProfessor.addActionListener(listener);
        cadastrarCurso.addActionListener(listener);
     
    }

}