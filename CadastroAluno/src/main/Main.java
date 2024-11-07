package main;

import models.AlunoGraduacao;
import models.AlunoPosGraduacao;
import services.CadastroAluno;

public class Main {
    public static void main(String[] args) {
        // Criando uma instância do sistema de cadastro de alunos
        CadastroAluno cadastro = new CadastroAluno();

        // Criando objetos para AlunoGraduacao
        AlunoGraduacao alunoGraduacao1 = new AlunoGraduacao("Ana Paula", "G01", 3.9, 8.5);
        AlunoGraduacao alunoGraduacao2 = new AlunoGraduacao("Cristine Aguiar", "G02", 8.3, 10.0);
        AlunoGraduacao alunoGraduacao3 = new AlunoGraduacao("Eros Machado", "G03", 10.0, 9.9);
        AlunoGraduacao alunoGraduacao4 = new AlunoGraduacao("Pedro Henrique", "G04", 6.5, 3.0);
        AlunoGraduacao alunoGraduacao5 = new AlunoGraduacao("Yan Wendel", "G05", 9.5, 10.0);

        
        // Criando objetos para AlunoPosGraduacao
        AlunoPosGraduacao alunoPosGraduacao1 = new AlunoPosGraduacao("Regiane Loiola", "P01", 9.0, 7.5);
        AlunoPosGraduacao alunoPosGraduacao2 = new AlunoPosGraduacao("Luis Gustavo", "P02", 10.0, 10.0);
        AlunoPosGraduacao alunoPosGraduacao3 = new AlunoPosGraduacao("Eduardo Sousa", "P03", 1.0, 2.5);
        AlunoPosGraduacao alunoPosGraduacao4 = new AlunoPosGraduacao("Osmar Rocha", "P04", 1.0, 1.5);
        AlunoPosGraduacao alunoPosGraduacao5 = new AlunoPosGraduacao("Emerson Costa", "P05", 10.0, 9.5);

        // Cadastrando os alunos da graduação no sistema
        cadastro.cadastrarAluno(alunoGraduacao1);
        cadastro.cadastrarAluno(alunoGraduacao2);
        cadastro.cadastrarAluno(alunoGraduacao3);
        cadastro.cadastrarAluno(alunoGraduacao4);
        cadastro.cadastrarAluno(alunoGraduacao5);
        
        
        // Cadastrando os alunos da Pós-graduação no sistema
        cadastro.cadastrarAluno(alunoPosGraduacao1);
        cadastro.cadastrarAluno(alunoPosGraduacao2);
        cadastro.cadastrarAluno(alunoPosGraduacao3);
        cadastro.cadastrarAluno(alunoPosGraduacao4);
        cadastro.cadastrarAluno(alunoPosGraduacao5);

        // Exibindo todos os alunos cadastrados
        System.out.println("Exibindo todos os alunos cadastrados:");
        cadastro.exibirTodosAlunos();

        // Buscando e exibindo informações de um aluno específico pela matrícula
        System.out.println("\nBuscando informações do aluno com matrícula G001:");
        cadastro.exibirAlunoPorMatricula("G001");

        System.out.println("\nBuscando informações do aluno com matrícula P002:");
        cadastro.exibirAlunoPorMatricula("P002");
    }
}