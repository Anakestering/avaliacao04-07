import java.util.Scanner;

//Exercício 5 — Descobrindo o Dia da Semana
//Desenvolva um programa em Java que utilize a estrutura switch-case para identificar o dia da semana com base em um número fornecido pelo usuário.
//O programa deve funcionar da seguinte forma:
//          a)  Solicite ao usuário que digite um número inteiro entre 1 e 7.
//
//b) Com base no número digitado, o programa deve exibir no console o nome do dia da semana correspondente, seguindo esta ordem:
//
//1 → Domingo
//2 → Segunda-feira
//3 → Terça-feira
//4 → Quarta-feira
//5 → Quinta-feira
//6 → Sexta-feira
//7 → Sábado
//
//      c) Caso o usuário digite um número fora do intervalo de 1 a 7, exiba a mensagem:
//       Número inválido. Digite um número entre 1 e 7.

public class Atividade05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número entre 1 e 7: ");
        int numero = scanner.nextInt();

        switch (numero) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("Sexta-feira");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.print("Número inválido. Digite um número entre 1 e 7. ");
                break;

        }
    }
}
