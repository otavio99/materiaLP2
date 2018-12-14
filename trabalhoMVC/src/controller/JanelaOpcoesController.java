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
			AlunoView jAluno= new AlunoView();
			AlunoController cAluno= new AlunoController(jAluno);
			ProfessorView jProfessor= new ProfessorView();
			ProfessorController cProfessor= new ProfessorController(jProfessor);
			CursoView jCurso= new CursoView();
			CursoController cCurso= new CursoController(jCurso);
			TurmaView jTurma= new TurmaView();
			TurmaController cTurma= new TurmaController(jTurma);
			DisciplinaView jDisciplina= new DisciplinaView();
			DisciplinaController cDisciplina= new DisciplinaController(jDisciplina);
			AlunoDisciplinaView jAlunoDisciplina= new AlunoDisciplinaView();
			AlunoDisciplinaController cAlunoDisciplina= new AlunoDisciplinaController(jAlunoDisciplina);
			ProfessorDisciplinaView jProfessorDisciplina= new ProfessorDisciplinaView();
			ProfessorDisciplinaController cProfessorDisciplina= new ProfessorDisciplinaController(jProfessorDisciplina);

			try{
				switch(acao) {
		            case "cadastrarAluno":
		                jAluno.setVisible(true);
		            break;
		            case "cadastrarProfessor":
		                jProfessor.setVisible(true);
		            break;
		            case "cadastrarCurso":
		                jCurso.setVisible(true);
		            break;
                            case "cadastrarTurma":
		                jTurma.setVisible(true);
		            break;
		            case "cadastrarDisciplina":
		                jDisciplina.setVisible(true);
		            break;
		            case "cadastrarAlunoDisciplina":
		                jAlunoDisciplina.setVisible(true);
		            break;
		            case "cadastrarProfessorDisciplina":
		                jProfessorDisciplina.setVisible(true);
		            break;
		        
		        
		        } 
			}
			catch(Exception ex){
				System.out.println(ex);
			}

		}
	}
}