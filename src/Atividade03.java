import java.util.Scanner;

// (R$ 4,00)
//Peça ao usuário dois dados:
//A tarifa do transporte público depende dessas condições:
//●	Se tiver menos de 6 anos ou mais de 65 → não paga nada
//
//●	Se for estudante de até 25 anos → paga 50% da tarifa
//
//●	Todos os outros pagam tarifa cheia (R$ 4,00)
//
//Mostre a mensagem:
//Valor a pagar: R$ X

public class Atividade03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Idade: ");
        int idade = scanner.nextInt();

        System.out.print("digite 1 se for estudante, 2 se nao for estudante: ");
        int estudante12 = scanner.nextInt();

        double valorPagar = 4;

        if (idade < 6 || idade > 65) {
            System.out.println("Valor a pagar: R$" + (0.0));
        } else if (idade < 25 && estudante12 == 1) {
            System.out.println("Valor a pagar: R$" + (valorPagar / 2) );
        } else {
            System.out.println("Valor a pagar: R$" +valorPagar);
        }
    }
}
