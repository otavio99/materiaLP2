package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.LinkedList;
import model.*;
import view.*;

public class ProfessorDisciplinaController{
	private ProfessorDisciplinaView jProfessorDisciplina= new ProfessorDisciplinaView();
	private ProfessorDisciplina ProfessorDisciplina= new ProfessorDisciplina();

	public ProfessorDisciplinaController(ProfessorDisciplinaView jProfessorDisciplina){
		this.jProfessorDisciplina= jProfessorDisciplina;
		this.jProfessorDisciplina.addProfessorDisciplinaListener(new ProfessorDisciplinaListener());
	}

	public ProfessorDisciplinaController(){}
        
	class ProfessorDisciplinaListener implements ActionListener{
                @Override
		public void actionPerformed(ActionEvent e){
			int codProfessor= 0;
			int codDisciplina= 0;
			int anoSemestre= 0;
			int codTurma= 0;
			
			

			String acao= e.getActionCommand();
			JanelaOpcoesView jOpcoes= new JanelaOpcoesView();
			JanelaOpcoesController cOpecoes= new JanelaOpcoesController(jOpcoes);

			try{
				if(acao.equals("cadastrar")){
					codProfessor= jProfessorDisciplina.getCodProfessorArea();
					codDisciplina= jProfessorDisciplina.getCodDisciplinaArea();
					anoSemestre= jProfessorDisciplina.getAnoSemestreArea();
					codTurma= jProfessorDisciplina.getCodTurmaArea();
					
					ProfessorDisciplina.setCodProfessor(codProfessor);
					ProfessorDisciplina.setCodDisciplina(codDisciplina);
					ProfessorDisciplina.setAnoSemestre(anoSemestre);
					ProfessorDisciplina.setCodTurma(codTurma);
                                    
					jProfessorDisciplina.setVisible(false);
					jProfessorDisciplina.mostrarMensagem("Cadastro realizado com sucesso");
				}
				else if(acao.equals("voltar")){
					jProfessorDisciplina.setVisible(false);
				}

			}
			catch(Exception ex){
				jProfessorDisciplina.mostrarMensagem("Valor inserido invalido");
			}

		}

	}


}