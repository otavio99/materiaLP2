package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.LinkedList;
import model.*;
import view.*;

public class CadastroAlunoController{
	private CadastroAlunoView jAluno= new CadastroAlunoView();
	private Aluno aluno= new Aluno();

	public CadastroAlunoController(CadastroAlunoView jAluno){
		this.jAluno= jAluno;
		this.jAluno.addCadastroAlunoListener(new AlunoListener());
	}

	public CadastroAlunoController(){}
        
	class AlunoListener implements ActionListener{
                @Override
		public void actionPerformed(ActionEvent e){
			String nome= " ";
			String endereco= " ";
			String telefone= " ";
			String cpf= " ";
			String tipo= " ";
			double desconto= 0.0;
			

			String acao= e.getActionCommand();
			JanelaOpcoesView jOpcoes= new JanelaOpcoesView();
			JanelaOpcoesController cOpecoes= new JanelaOpcoesController(jOpcoes);

			try{
				if(acao.equals("cadastrar")){
					nome= jAluno.getNomeArea();
					endereco= jAluno.getEnderecoArea();
					telefone= jAluno.getTelefoneArea();
					cpf= jAluno.getCpfArea();
					tipo= jAluno.getTipoArea();
					desconto= jAluno.getDescontoArea();

					aluno.setNome(nome);
					aluno.setEndereco(endereco);
					aluno.setTelefone(telefone);
					aluno.setCpf(cpf);
					aluno.setTipo(tipo);
					aluno.setDesconto(desconto);
                                        
					jAluno.setVisible(false);
					jAluno.mostrarMensagem("Cadastro realizado com sucesso");
                                        jOpcoes.setVisible(true);
				}
				else if(acao.equals("voltar")){
					jAluno.setVisible(false);
					jOpcoes.setVisible(true);
				}

			}
			catch(Exception ex){
				jAluno.mostrarMensagem("Valor inserido invalido");
				System.out.println(ex);
			}

		}

	}


}