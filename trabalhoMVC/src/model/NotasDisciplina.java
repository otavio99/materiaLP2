package model;

public class NotasDisciplina{
	private float n1;
	private float n2;

	public NotasDisciplina(){}
	
	public NotasDisciplina(float n1, float n2){
		this.n1= n1;
		this.n2= n2;
	}

	public float getN1(){
		return this.n1;
	}
	public float getN2(){
		return this.n2;
	}

	public void setN2(float n2){
		this.n2= n2;
	}
	public void setN1(float n1){
		this.n1= n1;
	}
}