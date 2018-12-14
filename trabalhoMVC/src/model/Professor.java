package model;

public class Professor extends Pessoa{
    private double salario;
    private String titulacao;

    public Professor(String nome, String endereco, String telefone, String cpf, String tipo, double salario, String titulacao){
            super(nome, endereco, telefone, cpf, tipo);
            this.salario= salario;
            this.titulacao= titulacao;
    }

    public Professor(){}

    public double getSalario(){
            return this.salario;
    }
    public void setTitulacao(String titulacao){
        this.titulacao = titulacao;
    }

    public void setSalario(double salario){
            this.salario= salario;
    }
    public String getTitulacao(){
        return this.titulacao;
    }

}