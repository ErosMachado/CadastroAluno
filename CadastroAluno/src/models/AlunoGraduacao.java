package models;

public class AlunoGraduacao extends Aluno {
    // Construtor
    public AlunoGraduacao(String nome, String matricula, double nota1, double nota2) {
        super(nome, matricula, nota1, nota2);
    }

    // Implementa��o do m�todo calcularMedia()
    @Override
    public double calcularMedia() {
        return ((getNota1() + getNota2()) / 2);
    }
}
