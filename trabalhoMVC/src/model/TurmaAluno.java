package model;

public class TurmaAluno{
	private Turma turma;
	private Aluno aluno;

	public TurmaAluno(){}
	
	public TurmaAluno(Turma turma, Aluno aluno){
		this.turma= turma;
		this.aluno= aluno;
	}

	public Turma getTurma(){
		return this.turma;
	}
	public Aluno getAluno(){
		return this.aluno;
	}

	public void setTurma(Turma turma){
		this.turma= turma;
	}
	public void setAluno(Aluno aluno){
		this.aluno= aluno;
	}
}