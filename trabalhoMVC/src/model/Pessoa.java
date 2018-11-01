package model;

abstract class Pessoa{
	protected String nome;
	protected static int cod;
	protected String endereco;
	protected String telefone;
	protected String cpf;
	protected String tipo;

	public Pessoa(){}
	
	public Pessoa(String nome, String endereco, String telefone, String cpf, String tipo){
		this.nome= nome;
		this.cod+= 1;
		this.endereco= endereco;
		this.telefone= telefone;
		this.cpf= cpf;
		this.tipo= tipo;
	}

	public String getNome(){
		return this.nome;
	}
	public int getCod(){
		return this.cod;
	}
	public String getEndereco(){
		return this.endereco;
	}
	public String getTelefone(){
		return this.telefone;
	}
	public String getCpf(){
		return this.cpf;
	}
	public String getTipo(){
		return this.tipo;
	}



	public void setNome(String nome){
		this.nome= nome;
	}
	public void setCod(int cod){
		this.cod= cod;
	}
	public void setEndereco(String endereco){
		this.endereco= endereco;
	}
	public void setTelefone(String telefone){
		this.telefone= telefone;
	}
	public void setCpf(String cpf){
		this.cpf= cpf;
	}
	public void setTipo(String tipo){
		this.tipo= tipo;
	}

}