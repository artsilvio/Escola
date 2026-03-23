//Esse é o main
package br.com.escola.app;

import br.com.escola.service.AlunoService;

public class Main {

    public static void main(String[] args) {
        //Impressão da lista de alunos-teste (não precisa da palavra teste)
        AlunoService.criarAluno("João", 18, 123);
        AlunoService.criarAluno("Maria", -10, 456);
        AlunoService.criarAluno("Carlos", 25, 789);
        AlunoService.criarAluno("Joaquim", 19, 779);
        AlunoService.criarAluno("José", 130, 771);
    }

}
