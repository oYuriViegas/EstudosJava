package application;

import entities.Escola;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bem-vindo ao sistema de gerenciamento de escola!");

        // Criando a escola
        System.out.print("Informe a quantidade total de classes na escola: ");
        int qtdClasses = sc.nextInt();
        sc.nextLine();

        Escola escola;
        try {
            escola = new Escola(qtdClasses);
        } catch (Exception e) {
            System.out.println("Erro ao criar a escola: " + e.getMessage());
            return;
        }

        while (true) {
            System.out.println("\nO que você gostaria de fazer?");
            System.out.println("1. Ver todas as classes");
            System.out.println("2. Alterar onde uma classe está ocorrendo");
            System.out.println("3. Ver onde uma classe está ocorrendo");
            System.out.println("4. Ver a capacidade total da escola");
            System.out.println("5. Sair");

            int escolha = sc.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println(escola.toString());
                    break;
                case 2:
                    System.out.print("Informe o nível da classe: ");
                    char nivel = sc.next().charAt(0);
                    System.out.print("Informe o ano da classe: ");
                    int ano = sc.nextInt();
                    System.out.print("Informe a turma da classe: ");
                    char turma = sc.next().charAt(0);
                    System.out.print("Informe o novo local da classe: ");
                    char novoOnde = sc.next().charAt(0);

                    escola.setOnde(nivel, ano, turma, novoOnde);
                    System.out.println("Local alterado com sucesso!");
                    break;
                case 3:
                    System.out.print("Informe o nível da classe: ");
                    nivel = sc.next().charAt(0);
                    System.out.print("Informe o ano da classe: ");
                    ano = sc.nextInt();
                    System.out.print("Informe a turma da classe: ");
                    turma = sc.next().charAt(0);

                    char onde = escola.getOnde(nivel, ano, turma);
                    if (onde == 'N') {
                        System.out.println("Classe não encontrada!");
                    } else {
                        System.out.println("A classe está ocorrendo em: " + onde);
                    }
                    break;
                case 4:
                    System.out.println("A capacidade total da escola é: " + escola.capacidade());
                    break;
                case 5:
                    System.out.println("Saindo do sistema...");
                    return;
                default:
                    System.out.println("Opção inválida, por favor tente novamente!");
            }
        }
    }
}
