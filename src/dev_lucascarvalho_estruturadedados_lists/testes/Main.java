package dev_lucascarvalho_estruturadedados_lists.testes;

import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        MyLinkedList<Integer> lista = new MyLinkedList<>();

        int opcao;

        do {
            System.out.println("\n===== MENU LINKED LIST =====");
            System.out.println("1 - Add First");
            System.out.println("2 - Add Last");
            System.out.println("3 - Insert At");
            System.out.println("4 - Remove First");
            System.out.println("5 - Remove Last");
            System.out.println("6 - Remove At");
            System.out.println("7 - Remove Item");
            System.out.println("8 - Find");
            System.out.println("9 - Get");
            System.out.println("10 - Set");
            System.out.println("11 - Clear");
            System.out.println("12 - Mostrar Lista");
            System.out.println("0 - Sair");
            System.out.println("Escolha: ");
            opcao = sc.nextInt();sc.nextLine();
            System.out.println();

            try {
                switch (opcao) {

                    case 1:
                        System.out.print("Valor: ");
                        lista.addFirst(sc.nextInt());
                        break;

                    case 2:
                        System.out.print("Valor: ");
                        lista.addLast(sc.nextInt());
                        break;

                    case 3:
                        System.out.print("Índice: ");
                        int indexInsert = sc.nextInt();

                        System.out.print("Valor: ");
                        int valorInsert = sc.nextInt();

                        lista.insertAt(indexInsert, valorInsert);
                        break;

                    case 4:
                        System.out.println("Removido: " + lista.removeFirst());
                        break;

                    case 5:
                        System.out.println("Removido: " + lista.removeLast());
                        break;

                    case 6:
                        System.out.print("Índice: ");
                        int indexRemove = sc.nextInt();

                        System.out.println("Removido: " + lista.removeAt(indexRemove));
                        break;

                    case 7:
                        System.out.print("Valor: ");
                        int valorRemove = sc.nextInt();

                        if (lista.remove(valorRemove)) {
                            System.out.println("Elemento removido!");
                        } else {
                            System.out.println("Elemento não encontrado!");
                        }
                        break;

                    case 8:
                        System.out.print("Valor: ");
                        int valorFind = sc.nextInt();

                        int posicao = lista.find(valorFind);

                        if (posicao != -1) {
                            System.out.println("Encontrado no índice: " + posicao);
                        } else {
                            System.out.println("Elemento não encontrado!");
                        }
                        break;

                    case 9:
                        System.out.print("Índice: ");
                        int indexGet = sc.nextInt();

                        System.out.println("Valor: " + lista.get(indexGet));
                        break;

                    case 10:
                        System.out.print("Índice: ");
                        int indexSet = sc.nextInt();

                        System.out.print("Novo valor: ");
                        int novoValor = sc.nextInt();

                        lista.set(indexSet, novoValor);
                        break;

                    case 11:
                        lista.clear();
                        System.out.println("Lista limpa!");
                        break;

                    case 12:
                        System.out.println(lista);
                        break;

                    case 0:
                        System.out.println("Encerrando...");
                        break;

                    default:
                        System.out.println("Opção inválida!");
                }

            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        } while (opcao != 0);

        sc.close();
    }
}
