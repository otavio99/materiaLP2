package model;

public class Turma{
	private String horario;
	private String professor;
	private int cod;
	private int numVagas;
        private String descricaoCurso;

	public Turma(){}
	
	public Turma(String horario, String professor, int numVagas, String descricaoCurso){
		this.horario= horario;
		this.professor= professor;
		this.numVagas= numVagas;
                this.descricaoCurso= descricaoCurso;
	}

	public String getHorario(){
		return this.horario;
	}
	public String getProfessor(){
		return this.professor;
	}
	public int getCod(){
		return this.cod;
	}
	public int getNumVagas(){
		return this.numVagas;
	}
        public String descricaoCurso(){
		return this.descricaoCurso;
	}

	public void setHorario(String horario){
		this.horario= horario;
	}
	public void setProfessor(String professor){
		this.professor= professor;
	}
	public void setCod(int cod){
		this.cod= cod;
	}
	public void setNumVagas(int numVagas){
		this.numVagas= numVagas;
	}
        public void setDescricaoCurso(String descricaoCurso){
		this.descricaoCurso= descricaoCurso;
	}
}
