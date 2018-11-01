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
					janela.mostrarMensagemErro("Login ou senha incorreta!");
				}
			}
			catch(Exception ex){
				janela.mostrarMensagemErro("Erro");
				System.out.println(ex);
			}

		}
	}
}

/*
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// The Controller coordinates interactions
// between the View and Model

public class CalculatorController {
	
	private CalculatorView theView;
	private CalculatorModel theModel;
	
	public CalculatorController(CalculatorView theView, CalculatorModel theModel) {
		this.theView = theView;
		this.theModel = theModel;
		
		// Tell the View that when ever the calculate button
		// is clicked to execute the actionPerformed method
		// in the CalculateListener inner class
		
		this.theView.addCalculateListener(new CalculateListener());
	}
	
	class CalculateListener implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			
			int firstNumber, secondNumber = 0;
			
			// Surround interactions with the view with
			// a try block in case numbers weren't
			// properly entered
			
			try{
			
				firstNumber = theView.getFirstNumber();
				secondNumber = theView.getSecondNumber();
				
				theModel.addTwoNumbers(firstNumber, secondNumber);
				
				theView.setCalcSolution(theModel.getCalculationValue());
			
			}

			catch(NumberFormatException ex){
				
				System.out.println(ex);
				
				theView.displayErrorMessage("You Need to Enter 2 Integers");
				
			}
			
		}
		
	}
	
}
*/