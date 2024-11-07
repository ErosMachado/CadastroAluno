package models;

import interfaces.Calculavel;

public abstract class Aluno implements Calculavel {
    // Atributos
    private String nome;
    private String matricula;
    private double nota1;
    private double nota2;

    // Construtor
    public Aluno(String nome, String matricula, double nota1, double nota2) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}

	// M�todo para verificar aprova��o
    public boolean verificarAprovacao() {
        return calcularMedia() >= 7.0;
    }

    // m�todo para exibir informa��es do aluno
    public void exibirInfo() {
        System.out.println("Nome: " + this.nome);
        System.out.println("matr�cula: " + this.matricula);
        System.out.printf("M�dia: " + calcularMedia() +"\n");
        System.out.println("Status: " + (verificarAprovacao() ? "Aprovado" : "Reprovado"));
    }

    // M�todo abstrato para calcular a m�dia
    public abstract double calcularMedia();
}
