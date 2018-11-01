package model;

public class Turma{
	private String horario;
	private Professor professor;
	private int cod;
	private int numVagas;

	public Turma(){}
	
	public Turma(String horario, Professor professor, int cod, int numVagas){
		this.horario= horario;
		this.professor= professor;
		this.cod= cod;
		this.numVagas= numVagas;
	}

	public String getHorario(){
		return this.horario;
	}
	public Professor getProfessor(){
		return this.professor;
	}
	public int getCod(){
		return this.cod;
	}
	public int getNumVagas(){
		return this.numVagas;
	}

	public void setHorario(String horario){
		this.horario= horario;
	}
	public void setProfessor(Professor professor){
		this.professor= professor;
	}
	public void setCod(int cod){
		this.cod= cod;
	}
	public void setNumVagas(int numVagas){
		this.numVagas= numVagas;
	}
}
