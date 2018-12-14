package model;

public class Aluno extends Pessoa{
	private float desconto;


	public Aluno(String nome, String endereco, String telefone, String cpf, String tipo, float desconto){
		super(nome, endereco, telefone, cpf, tipo);
		this.desconto= desconto;
	}

	public Aluno(){}

	public float getDesconto(){
		return this.desconto;
	}

	public void setDesconto(float desconto){
		this.desconto= desconto;
	}
}