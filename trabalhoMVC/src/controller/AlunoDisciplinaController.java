package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.LinkedList;
import model.*;
import view.*;

public class AlunoDisciplinaController{
	private AlunoDisciplinaView jAlunoDisciplina= new AlunoDisciplinaView();
	private AlunoDisciplina alunoDisciplina= new AlunoDisciplina();

	public AlunoDisciplinaController(AlunoDisciplinaView jAlunoDisciplina){
		this.jAlunoDisciplina= jAlunoDisciplina;
		this.jAlunoDisciplina.addAlunoDisciplinaListener(new AlunoDisciplinaListener());
	}

	public AlunoDisciplinaController(){}
        
	class AlunoDisciplinaListener implements ActionListener{
                @Override
		public void actionPerformed(ActionEvent e){
			int codAluno= 0;
			int codDisciplina= 0;
			float n1= 0;
			float n2= 0;
			int anoSemestre= 0;
			

			String acao= e.getActionCommand();
			JanelaOpcoesView jOpcoes= new JanelaOpcoesView();
			JanelaOpcoesController cOpecoes= new JanelaOpcoesController(jOpcoes);

			try{
				if(acao.equals("cadastrar")){
					codAluno= jAlunoDisciplina.getCodAlunoArea();
					codDisciplina= jAlunoDisciplina.getCodDisciplinaArea();
					n1= jAlunoDisciplina.getN1Area();
					n2= jAlunoDisciplina.getN2Area();
					anoSemestre= jAlunoDisciplina.getAnoSemestreArea();
					
					alunoDisciplina.setCodAluno(codAluno);
					alunoDisciplina.setCodDisciplina(codDisciplina);
					alunoDisciplina.setN1(n1);
					alunoDisciplina.setN2(n2);
					alunoDisciplina.setAnoSemestre(anoSemestre);
                                    
					jAlunoDisciplina.setVisible(false);
					jAlunoDisciplina.mostrarMensagem("Cadastro realizado com sucesso");
				}
				else if(acao.equals("voltar")){
					jAlunoDisciplina.setVisible(false);
				}

			}
			catch(Exception ex){
				jAlunoDisciplina.mostrarMensagem("Valor inserido invalido");
			}

		}

	}


}