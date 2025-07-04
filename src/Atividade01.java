import java.util.Scanner;

//Exercício 1  Login no Sistema
//Enunciado detalhado:
//Crie um código que simule o acesso de um usuário ao sistema.
// O programa deve pedir:
//●	Um nome de usuário (login)
//
//●	Uma senha
//
//Considere que os dados corretos são:
//●	Usuário: admin
//
//●	Senha: 1234
//
//Se os dados estiverem certos, mostre a mensagem:
//Login bem-sucedido.
//
//Se estiverem errados, mostre:
//Login inválido. Conta bloqueada.

public class Atividade01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nomeCerto = "admin";
        String senhaCerta = "1234";

        System.out.print("Usuário: ");
        String nomeDigitado = scanner.next();

        System.out.print("Senha: ");
        String senhaDigitada = scanner.next();

        if ((nomeDigitado.equalsIgnoreCase(nomeCerto)) && (senhaDigitada.equalsIgnoreCase(senhaCerta))) {
            System.out.println("Login bem-sucedido.");
        } else {
            System.out.println("Login inválido. Conta bloqueada.");
        }
    }
}
