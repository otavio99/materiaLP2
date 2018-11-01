package model;

public class AlunoDisciplina{
	private Aluno aluno;
	private Disciplina disciplina;

	public AlunoDisciplina(){}
	
	public AlunoDisciplina(Aluno aluno, Disciplina disciplina){
		this.aluno= aluno;
		this.disciplina= disciplina;
	}

	public Aluno getAluno(){
		return this.aluno;
	}
	public Disciplina getDisciplina(){
		return this.disciplina;
	}

	public void setAluno(Aluno aluno){
		this.aluno= aluno;
	}
	public void setDisciplina(Disciplina disciplina){
		this.disciplina= disciplina;
	}
}