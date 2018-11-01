package model;

public class Aluno extends Pessoa{
	private double desconto;


	public Aluno(String nome, String endereco, String telefone, String cpf, String tipo, float desconto){
		super(nome, endereco, telefone, cpf, tipo);
		this.desconto= desconto;
	}

	public Aluno(){}

	public double getDesconto(){
		return this.desconto;
	}

	public void setDesconto(double desconto){
		this.desconto= desconto;
	}
}