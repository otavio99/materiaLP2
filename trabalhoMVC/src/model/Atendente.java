package model;

public class Atendente extends Pessoa{
	private float salario; 
	private String horarios;


	public Atendente(String nome, String endereco, String telefone, String cpf, String tipo, float salario, String horarios){
		super(nome, endereco, telefone, cpf, tipo);
		this.salario= salario;
		this.horarios= horarios;
	}

	public Atendente(){}

	public float getSalario(){
		return this.salario;
	}
	public String getHorarios(){
		return this.horarios;
	}

	public void setSalario(float salario){
		this.salario= salario;
	}
	public void setHorarios(String horarios){
		this.horarios= horarios;
	}



}