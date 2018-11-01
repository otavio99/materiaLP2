package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import view.*;

public class JanelaRespostaController{
	private JanelaRespostaView janela= new JanelaRespostaView();

	public JanelaRespostaController(JanelaRespostaView janela){
		this.janela= janela;

		this.janela.addRespostaListener(new RespostaListener());
	}

	class RespostaListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			JanelaOpcoesView jOpcoes= new JanelaOpcoesView();
			JanelaOpcoesController cOpecoes= new JanelaOpcoesController(jOpcoes);
			try{
				janela.setVisible(false);
				jOpcoes.setVisible(true);
			}
			catch(Exception ex){
				janela.mostrarMensagemErro("Erro");
				System.out.println(ex);
			}
		}
	}

}