package models;

public class AlunoPosGraduacao extends Aluno {
    // Construtor
    public AlunoPosGraduacao(String nome, String matricula, double nota1, double nota2) {
        super(nome, matricula, nota1, nota2);
    }

    // Implementação do método calcularMedia()
    @Override
    public double calcularMedia() {
        return (getNota1() * 0.6) + (getNota2() * 0.4);
    }
}
