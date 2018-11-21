package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.LinkedList;
import model.*;
import view.*;

public class CadastroTurmaController{
	private CadastroTurmaView jTurma= new CadastroTurmaView();
	private Turma turma= new Turma();


	public CadastroTurmaController(CadastroTurmaView jTurma){
		this.jTurma= jTurma;
		this.jTurma.addCadastroAlunoListener(new TurmaListener());
	}

	public CadastroTurmaController(){}

	class TurmaListener implements ActionListener{
                @Override
		public void actionPerformed(ActionEvent e){
			String horario= " ";
			String professor= " ";
			String numVagas= " ";
			String descricaoCurso= " ";
			

			String acao= e.getActionCommand();
			JanelaOpcoesView jOpcoes= new JanelaOpcoesView();
			JanelaOpcoesController cOpecoes= new JanelaOpcoesController(jOpcoes);

			try{
				if(acao.equals("cadastrar")){
					horario= jTurma.getHorarioArea();
					professor= jTurma.getProfessorArea();
					numVagas= jTurma.getNumVagasArea();
                                        descricaoCurso= jTurma.getDescricaoCursoArea();
					

					turma.setHorario(horario);
					turma.setProfessor(professor);
					turma.setNumVagas(Integer.parseInt(numVagas));
					turma.setDescricaoCurso(descricaoCurso);

					jTurma.setVisible(false);
					jTurma.mostrarMensagem("Cadastro realizado com sucesso");
                                        jOpcoes.setVisible(true);
				}
				else if(acao.equals("voltar")){
					jTurma.setVisible(false);
					jOpcoes.setVisible(true);
				}

			}
			catch(Exception ex){
				jTurma.mostrarMensagem("Valor inserido invalido");
				System.out.println(ex);
			}

		}

	}


}