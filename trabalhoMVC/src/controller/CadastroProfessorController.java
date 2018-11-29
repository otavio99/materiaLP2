package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.LinkedList;
import model.*;
import view.*;

public class CadastroProfessorController{
	private CadastroProfessorView jProfessor= new CadastroProfessorView();
	private Professor professor= new Professor();
	public static LinkedList<Professor> listaProfessor= new LinkedList<Professor>();

	public CadastroProfessorController(CadastroProfessorView jProfessor){
		this.jProfessor= jProfessor;
		this.jProfessor.addCadastroProfessorListener(new ProfessorListener());
	}

	class ProfessorListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			String nome= " ";
			String endereco= " ";
			String telefone= " ";
			String cpf= " ";
			String tipo= " ";
			double salario= 0.0;
			String titulacao= " ";

			String acao= e.getActionCommand();
			JanelaOpcoesView jOpcoes= new JanelaOpcoesView();
			JanelaOpcoesController cOpecoes= new JanelaOpcoesController(jOpcoes);

			try{
				if(acao.equals("cadastrar")){
					nome= jProfessor.getNomeArea();
					endereco= jProfessor.getEnderecoArea();
					telefone= jProfessor.getTelefoneArea();
					cpf= jProfessor.getCpfArea();
					tipo= jProfessor.getTipoArea();
					salario= jProfessor.getSalarioArea();
                                        titulacao= jProfessor.getTitulacaoArea();

					professor.setNome(nome);
					professor.setEndereco(endereco);
					professor.setTelefone(telefone);
					professor.setCpf(cpf);
					professor.setTipo(tipo);
					professor.setSalario(salario);
                                        professor.setTitulacao(titulacao);

					listaProfessor.add(professor);

					jProfessor.setVisible(false);
					jProfessor.mostrarMensagem("Cadastro realizado com sucesso");
                                        jOpcoes.setVisible(true);
				}
				else if(acao.equals("voltar")){
					jProfessor.setVisible(false);
					jOpcoes.setVisible(true);
				}

			}
			catch(Exception ex){
				jProfessor.mostrarMensagem("Valor inserido invalido");
				System.out.println(ex);
			}

		}

	}


}