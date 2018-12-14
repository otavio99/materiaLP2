package model;

public class AlunoDisciplina{
	private int codAluno;
	private int codDisciplina;
	private float n1;
	private float n2;
        private int anoSemestre;

    public int getAnoSemestre() {
        return anoSemestre;
    }

    public void setAnoSemestre(int anoSemestre) {
        this.anoSemestre = anoSemestre;
    }

	public AlunoDisciplina(){}
	
	public AlunoDisciplina(int codAluno, int codDisciplina, int n1, int n2){
		this.codAluno= codAluno;
		this.codDisciplina= codDisciplina;
		this.n1= n1;
		this.n2= n2;
	}

	public int getCodAluno(){
		return this.codAluno;
	}
	public int getCodDisciplina(){
		return this.codDisciplina;
	}
	public float getN1(){
		return this.n1;
	}
	public float getN2(){
		return this.n2;
	}

	public void setCodAluno(int codAluno){
		this.codAluno= codAluno;
	}
	public void setCodDisciplina(int codDisciplina){
		this.codDisciplina= codDisciplina;
	}
	public void setN2(float n2){
		this.n2= n2;
	}
	public void setN1(float n1){
		this.n1= n1;
	}
}
