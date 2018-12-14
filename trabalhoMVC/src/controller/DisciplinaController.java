package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.LinkedList;
import model.*;
import view.*;

public class DisciplinaController{
	private DisciplinaView jDisciplina= new DisciplinaView();
	private Disciplina disciplina= new Disciplina();

	public DisciplinaController(DisciplinaView jDisciplina){
		this.jDisciplina= jDisciplina;
		this.jDisciplina.addDisciplinaListener(new DisciplinaListener());
	}

	public DisciplinaController(){}
        
	class DisciplinaListener implements ActionListener{
                @Override
		public void actionPerformed(ActionEvent e){
			String nome= " ";
			int cargaHoraria= 0;
			
			

			String acao= e.getActionCommand();
			JanelaOpcoesView jOpcoes= new JanelaOpcoesView();
			JanelaOpcoesController cOpecoes= new JanelaOpcoesController(jOpcoes);

			try{
				if(acao.equals("cadastrar")){
					nome= jDisciplina.getNomeArea();
					cargaHoraria= jDisciplina.getCargaHorariaArea();
					
					disciplina.setNome(nome);
					disciplina.setCargaHoraria(cargaHoraria);
                                    
					jDisciplina.setVisible(false);
					jDisciplina.mostrarMensagem("Cadastro realizado com sucesso");
				}
				else if(acao.equals("voltar")){
					jDisciplina.setVisible(false);
				}

			}
			catch(Exception ex){
				jDisciplina.mostrarMensagem("Valor inserido invalido");
			}

		}

	}


}