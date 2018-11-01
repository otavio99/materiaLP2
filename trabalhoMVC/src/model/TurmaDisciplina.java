package model;

public class TurmaDisciplina{
	private Turma turma;
	private Disciplina disciplina;

	public TurmaDisciplina(){}
	
	public TurmaDisciplina(Turma turma, Disciplina disciplina){
		this.turma= turma;
		this.disciplina= disciplina;
	}

	public Turma getTurma(){
		return this.turma;
	}
	public Disciplina getDisciplina(){
		return this.disciplina;
	}

	public void setTurma(Turma turma){
		this.turma= turma;
	}
	public void setDisciplina(Disciplina disciplina){
		this.disciplina= disciplina;
	}
}