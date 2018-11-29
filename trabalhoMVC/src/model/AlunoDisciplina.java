package model;

public class AlunoDisciplina{
	private Aluno aluno;
	private Disciplina disciplina;
        private float n1;
        private float n2;
        private String ano_semestre;
        

	public AlunoDisciplina(){}
	
	public AlunoDisciplina(Aluno aluno, Disciplina disciplina, float n1, float n2, String ano_semestre){
            this.aluno= aluno;
            this.disciplina= disciplina;
            this.n1= n1;
            this.n2= n2;
            this.ano_semestre= ano_semestre;
	}

	public Aluno getAluno(){
            return this.aluno;
	}
	public Disciplina getDisciplina(){
            return this.disciplina;
	}
        public float getN1(){
            return this.n1;
	}
        public float getN2(){
            return this.n2;
	}
        public String getAno_semestre(){
            return this.ano_semestre;
	}
        

	public void setAluno(Aluno aluno){
            this.aluno= aluno;
	}
	public void setDisciplina(Disciplina disciplina){
            this.disciplina= disciplina;
	}
        public void setN1(float n1){
            this.n1= n1;
	}
        public void setN2(float n2){
            this.n2= n2;
	}
        public void setAno_semestre(String ano_semestre){
            this.ano_semestre= ano_semestre;
	}
        
}