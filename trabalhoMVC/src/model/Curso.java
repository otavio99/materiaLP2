package model;

public class Curso{
	private int cod;
	private double mensalidade;
	private String idioma;

	public Curso(){}
	
	public Curso(int cod, double mensalidade, String idioma){
		this.cod= cod;
		this.mensalidade= mensalidade;
		this.idioma= idioma;
	}

	public int getCod(){
		return this.cod;
	}
	public double getMensalidade(){
		return this.mensalidade;
	}
	public String getIdioma(){
		return this.idioma;
	}

	public void setCod(int cod){
		this.cod= cod;
	}
	public void setMensalidade(double mensalidade){
		this.mensalidade= mensalidade;
	}
	public void setIdioma(String idioma){
		this.idioma= idioma;
	}
}