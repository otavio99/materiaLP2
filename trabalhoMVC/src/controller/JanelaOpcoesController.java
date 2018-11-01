package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import view.*;

public class JanelaOpcoesController{
	private JanelaOpcoesView jOpcoes;

	public JanelaOpcoesController(JanelaOpcoesView jOpcoes){
		this.jOpcoes= jOpcoes;

		this.jOpcoes.addOpcoesListener(new JOpcoesListener());
	}

	class JOpcoesListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			String acao= e.getActionCommand();
			CadastroAlunoView jAluno= new CadastroAlunoView();
			CadastroAlunoController cAluno= new CadastroAlunoController(jAluno);
			CadastroProfessorView jProfessor= new CadastroProfessorView();
			CadastroProfessorController cProfessor= new CadastroProfessorController(jProfessor);
			CadastroCursoView jCurso= new CadastroCursoView();
			CadastroCursoController cCurso= new CadastroCursoController(jCurso);
	

			try{
				switch(acao) {
		            case "cadastrarAluno":
		                jOpcoes.setVisible(false);
		                jAluno.setVisible(true);
		            break;
		            case "cadastrarProfessor":
		                jOpcoes.setVisible(false);
		                jProfessor.setVisible(true);
		            break;
		            case "cadastrarCurso":
		                jOpcoes.setVisible(false);
		                jCurso.setVisible(true);
		            break;
		        
		        } 
			}
			catch(Exception ex){
				System.out.println(ex);
			}

		}
	}
}