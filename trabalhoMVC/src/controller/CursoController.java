package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.LinkedList;
import model.*;
import view.*;

public class CursoController{
	private CursoView jCurso= new CursoView();
	private Curso curso= new Curso();
	public static LinkedList<Curso> listaCurso= new LinkedList<Curso>();

	public CursoController(CursoView jCurso){
		this.jCurso= jCurso;
		this.jCurso.addCursoListener(new CursoListener());
	}

	class CursoListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			int cod= 0;
			double mensalidade= 0.0;
			String idioma= " ";
		

			String acao= e.getActionCommand();
			JanelaOpcoesView jOpcoes= new JanelaOpcoesView();
			JanelaOpcoesController cOpecoes= new JanelaOpcoesController(jOpcoes);


			try{
				if(acao.equals("cadastrar")){
					cod= jCurso.getCodArea();
					mensalidade= jCurso.getMensalidadeArea();
					idioma= jCurso.getIdiomaArea();

					curso.setCod(cod);
					curso.setMensalidade(mensalidade);
					curso.setIdioma(idioma);
					
					listaCurso.add(curso);

					jCurso.setVisible(false);
					jCurso.mostrarMensagem("Cadastro realizado com sucesso");
				}
				else if(acao.equals("voltar")){
					jCurso.setVisible(false);
				}

			}
			catch(Exception ex){
				jCurso.mostrarMensagem("Valor inserido invalido");
				System.out.println(ex);
			}

		}

	}


}