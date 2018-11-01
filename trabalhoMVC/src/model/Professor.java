package model;

public class Professor extends Pessoa{
	private double salario;


	public Professor(String nome, String endereco, String telefone, String cpf, String tipo, double salario){
		super(nome, endereco, telefone, cpf, tipo);
		this.salario= salario;
	}

	public Professor(){}

	public double getSalario(){
		return this.salario;
	}
	public void setSalario(double salario){
		this.salario= salario;
	}
}