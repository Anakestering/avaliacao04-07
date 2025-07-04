import java.util.Scanner;

//       90 a 100	A
//      80 a 89	B
//     70 a 79	C
//     60 a 69	D
//    Abaixo de 60	F

//Sua nota é C.

public class Atividade04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nota de 0 a 100: ");
        int nota = scanner.nextInt();

        String conceito = "";

        if (nota >= 90 && nota <= 100) {
            conceito = "A";
            System.out.println("Sua nota é: " + conceito);
        } else if (nota >= 80 && nota <= 89) {
            conceito = "B";
            System.out.println("Sua nota é: " + conceito);
        } else if (nota >= 70 && nota <= 79) {
            conceito = "C";
            System.out.println("Sua nota é: " + conceito);
        } else if (nota >= 60 && nota <= 69) {
            conceito = "D";
            System.out.println("Sua nota é: " + conceito);
        } else if ( nota < 60 ) {
            conceito = "F";
            System.out.println("Sua nota é: " + conceito);
        } else {
            System.out.print("Nota inválida");
        }
    }
}
