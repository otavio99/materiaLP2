package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.*;

public class UsuarioView extends JFrame{
	private JLabel login= new JLabel("Login");
	private JTextField loginArea= new JTextField(10);
	private JLabel senha= new JLabel("Senha");
	private JTextField senhaArea= new JPasswordField(10);
	private JButton entrarBotao= new JButton("Entrar");

	public UsuarioView(){
		JPanel usuPanel = new JPanel();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500, 200);
        this.setLocationRelativeTo(null);
		usuPanel.add(login);
		usuPanel.add(loginArea);
		usuPanel.add(senha);
		usuPanel.add(senhaArea);
		usuPanel.add(entrarBotao);
		this.add(usuPanel);

	}

	public String getLoginArea(){
		return this.loginArea.getText();
	}

	public String getSenhaArea(){
		return this.senhaArea.getText();
	}

	public void addUsuarioListener(ActionListener listener){
        entrarBotao.addActionListener(listener);
    }

    public void mostrarMensagemErro(String mensagem){
        JOptionPane.showMessageDialog(this, mensagem);
    }
}


/*

07
import java.awt.event.ActionListener;
import javax.swing.*;

public class CalculatorView extends JFrame{

    private JTextField firstNumber  = new JTextField(10);
    private JLabel additionLabel = new JLabel("+");
    private JTextField secondNumber = new JTextField(10);
    private JButton calculateButton = new JButton("Calculate");
    private JTextField calcSolution = new JTextField(10);

    CalculatorView(){

        JPanel calcPanel = new JPanel();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 200);
        calcPanel.add(firstNumber);
        calcPanel.add(additionLabel);
        calcPanel.add(secondNumber);
        calcPanel.add(calculateButton);
        calcPanel.add(calcSolution);
        this.add(calcPanel);
    }
    public int getFirstNumber(){
        return Integer.parseInt(firstNumber.getText());
    }
    public int getSecondNumber(){
        return Integer.parseInt(secondNumber.getText());
    }
    public int getCalcSolution(){
        return Integer.parseInt(calcSolution.getText());
    }
    public void setCalcSolution(int solution){
        calcSolution.setText(Integer.toString(solution));
    }
    void addCalculateListener(ActionListener listenForCalcButton){
        calculateButton.addActionListener(listenForCalcButton);
    }
    void displayErrorMessage(String errorMessage){
        JOptionPane.showMessageDialog(this, errorMessage);
    }
}
*/