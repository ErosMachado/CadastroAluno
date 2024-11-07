package services;

import models.Aluno;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CadastroAluno {
    // Atributos
    private ArrayList<Aluno> alunos;
    private Map<String, Aluno> alunosMap;

    // Construtor
    public CadastroAluno() {
        this.alunos = new ArrayList<>();
        this.alunosMap = new HashMap<>();
    }

    // Método para cadastrar um novo aluno
    public void cadastrarAluno(Aluno aluno) {
        alunos.add(aluno);
        alunosMap.put(aluno.getMatricula(), aluno);
    }

    // Método para exibir informações de todos os alunos cadastrados
    public void exibirTodosAlunos() {
        for (Aluno aluno : alunos) {
            aluno.exibirInfo();
            System.out.println("----------------------------");
        }
    }

    // buscar um aluno pelo número da matricula
    public Aluno buscarAlunoPorMatricula(String matricula) {
        return alunosMap.get(matricula);
    }

    // Método para exibir as informações de um aluno a partir da matricula
    public void exibirAlunoPorMatricula(String matricula) {
        Aluno aluno = buscarAlunoPorMatricula(matricula);
        if (aluno != null) {
            aluno.exibirInfo();
        } else {
            System.out.println("Aluno não encontrado para a matricula: " + matricula);
        }
    }
}
