package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import model.*;
import view.*;

public class UsuarioController{
	private UsuarioView janela;
	private Usuario usuario;

	public UsuarioController(UsuarioView janela, Usuario usuario){
		this.janela= janela;
		this.usuario= usuario;

		this.janela.addUsuarioListener(new UsuarioListener());
	}

	class UsuarioListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			String login= " ";
			String senha= " ";
			JanelaOpcoesView jOpcoesView= new JanelaOpcoesView();
			JanelaOpcoesController jOpcoesController= new JanelaOpcoesController(jOpcoesView);

			try{
				login= janela.getLoginArea();
				senha= janela.getSenhaArea();

//login.equals("nome@gmail.com") && senha.equals("sistema123")
				if(true){
					janela.setVisible(false);
					jOpcoesView.setVisible(true);
				}
				else{
					janela.mostrarMensagem("Login ou senha incorreta!");
				}
			}
			catch(Exception ex){
				janela.mostrarMensagem("Erro");
				System.out.println(ex);
			}

		}
	}
}