package model;

import controller.UsuarioController;
import view.UsuarioView;

public class Aplicacao{
	public static void main(String args[]) {
		UsuarioView janela= new UsuarioView();
		Usuario usuario= new Usuario();
		UsuarioController usuarioControlador= new UsuarioController(janela, usuario);

		janela.setVisible(true);

	}
}

/*public class MVCCalculator {
    
    public static void main(String[] args) {
    	
    	CalculatorView theView = new CalculatorView();
        
    	CalculatorModel theModel = new CalculatorModel();
        
        CalculatorController theController = new CalculatorController(theView,theModel);
        
        theView.setVisible(true);
        
    }
}*/