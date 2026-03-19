package br.com.escola.service;

import br.com.escola.model.Aluno;

public class AlunoService {

    public static void criarAluno(String nome, int idade, int matricula) {

        try {
            Aluno aluno = new Aluno(nome, idade, matricula);
            System.out.println(aluno);
        } catch (IllegalArgumentException e) {
            System.out.println("O(A) aluno(a) " + nome + " está com data de nascimento inválida.");
        }

    }

}