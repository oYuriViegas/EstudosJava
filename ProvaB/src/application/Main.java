package application;

import entities.Apartment;
import entities.Hotel;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bem-vindo ao sistema de gerenciamento de Hotel!");

        // Criando o hotel
        System.out.println("Informe a quantidade de andares do hotel");
        int qntFloor = sc.nextInt();
        sc.nextLine();

        Hotel hotel;
        try {
            hotel = new Hotel(qntFloor);
        } catch (Exception e) {
            System.out.println("Erro ao criar hotel: " + e.getMessage());
            return;
        }

        while (true) {
            System.out.println("\nO que gostaria de fazer?");
            System.out.println("1. Ver todos os apartamentos");
            System.out.println("2. Ver a capacidade do hotel");
            System.out.println("3. Ocupar apartamento");
            System.out.println("4. Interditar apartamento");
            System.out.println("5. Desocupar apartamento");
            System.out.println("0. Sair");

            int choice = sc.nextInt();
            sc.nextLine(); // Consuming the newline character

            switch (choice) {
                case 1:
                    System.out.println(hotel.toString());
                    break;
                case 2:
                    System.out.println("Capacidade total do hotel: " + hotel.getCapacity());
                    System.out.println("Capacidade disponível: " + hotel.getAvailableCapacity());
                    break;
                case 3:
                    System.out.println("Informe o número do apartamento a ser ocupado:");
                    int aptToOccupy = sc.nextInt();
                    sc.nextLine(); // Consuming the newline character
                    // Assumindo que um método occupyApartment está implementado
                    hotel.occupyApartment(aptToOccupy);
                    break;
                case 4:
                    System.out.println("Informe o número do apartamento a ser interditado:");
                    int aptToInterdict = sc.nextInt();
                    sc.nextLine(); // Consuming the newline character
                    // Assumindo que um método interdictApartment está implementado
                    hotel.interdictApartment(aptToInterdict);
                    break;
                case 5:
                    System.out.println("Informe o número do apartamento a ser desocupado:");
                    int aptToUnoccupy = sc.nextInt();
                    sc.nextLine(); // Consuming the newline character
                    // Assumindo que um método unoccupyApartment está implementado
                    hotel.unoccupyApartment(aptToUnoccupy);
                    break;
                case 0:
                    System.out.println("Saindo do sistema...");
                    sc.close();
                    return;
                default:
                    System.out.println("Opção inválida, por favor tente novamente!");
            }
        }
    }
}
