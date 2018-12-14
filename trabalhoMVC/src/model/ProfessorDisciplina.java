package model;

public class ProfessorDisciplina{
	private int codProfessor;
	private int codDisciplina;
	private int anoSemestre;
	private int codTurma;

	public ProfessorDisciplina(){};

	public int getCodProfessor(){
		return this.codProfessor;
	}
	public int getCodDisciplina(){
		return this.codDisciplina;
	}
	public int getAnoSemestre(){
		return this.anoSemestre;
	}
	public int getCodTurma(){
		return this.codTurma;
	}

	public void setCodProfessor(int codProfessor){
		this.codProfessor= codProfessor;
	}
	public void setCodDisciplina(int codDisciplina){
		this.codDisciplina= codDisciplina;
	}
	public void setAnoSemestre(int anoSemestre){
		this.anoSemestre= anoSemestre;
	}
	public void setCodTurma(int codTurma){
		this.codTurma= codTurma;
	}

}