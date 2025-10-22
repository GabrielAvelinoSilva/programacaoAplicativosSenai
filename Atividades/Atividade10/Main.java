package atividade10;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ConexaoDAO dao = new ConexaoDAO();
        
        int opcao;
        do {
            System.out.println("\n=== MENU ALUNOS ===");
            System.out.println("1 - Cadastrar aluno");
            System.out.println("2 - Listar alunos");
            System.out.println("3 - Atualizar aluno");
            System.out.println("4 - Deletar aluno");
            System.out.println("5 - Sair");
            
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1 -> {
                    System.out.println("\n=== CADASTRAR ALUNO ===");
                    System.out.print("Informe o ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Informe o nome: ");
                    String nome = scanner.nextLine();

                    Aluno novoAluno = new Aluno(id, nome);
                    dao.cadastrarAluno(novoAluno);
                }

                case 2 -> {
                    System.out.println("\n=== LISTA DE ALUNOS ===");
                    List<Aluno> alunos = dao.listarAlunos();
                    if (alunos.isEmpty()) {
                        System.out.println("Nenhum aluno cadastrado.");
                    } else {
                        for (Aluno a : alunos) {
                            System.out.println("ID: " + a.getId() + " | Nome: " + a.getNome());
                        }
                    }
                }

                case 3 -> {
                    System.out.println("\n=== ATUALIZAR ALUNO ===");
                    System.out.print("Informe o ID do aluno: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Informe o novo nome: ");
                    String novoNome = scanner.nextLine();

                    Aluno alunoAtualizado = new Aluno(id, novoNome);
                    dao.atualizarAluno(alunoAtualizado);
                }

                case 4 -> {
                    System.out.println("\n=== DELETAR ALUNO ===");
                    System.out.print("Informe o ID do aluno a ser deletado: ");
                    int id = scanner.nextInt();

                    dao.deletarAluno(id);
                }

                case 5 -> {
                    System.out.println("Encerrando o programa...");
                }

                default ->
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 5);
        System.out.println("Sistema Encerrado, Tchau!");
    }
}
