import java.util.Scanner;

//Exercício 2 Simular Empréstimo Social
//●	Se o número de parcelas for menor que 1 ou maior que 24, também não pode ser aprovado
//
//Mostre uma das mensagens:
//●	“Empréstimo aprovado. Valor de cada parcela: R$ X”
//
//●	“Empréstimo reprovado. Parcela muito alta.”
//
//●	“Empréstimo reprovado. Número de parcelas inválido.”

public class Atividade02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual valor deseja emprestado? ");
        double valorEmprestimo = scanner.nextDouble();

        System.out.print("Em quantas parcelas deseja pagar (de 1 a 24)? ");
        double parcelas = scanner.nextDouble();

        System.out.print("Qual seu salário? " );
        double salario = scanner.nextDouble();

        double valorParcelas = valorEmprestimo/parcelas;

        if (parcelas > 24 || parcelas < 1) {
            System.out.println("Empréstimo reprovado. Número de parcelas inválido.");
        } else if (valorParcelas >= salario) {
            System.out.println("Empréstimo reprovado. Parcela muito alta.");
        } else {
            System.out.println("Empréstimo aprovado. Valor de cada parcela: R$" +valorParcelas);
        }
    }
}
