package model;

import controller.UsuarioController;
import view.UsuarioView;
//import model.Usuario;

public class Aplicacao{
	public static void main(String[] args){
		UsuarioView janela= new UsuarioView();
		Usuario usuario= new Usuario();
		UsuarioController usuarioControlador= new UsuarioController(janela, usuario);

		janela.setVisible(true);

	}
	
}
