import java.util.Random;
import java.util.Scanner;

public class Adivinhacaogame {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random random = new Random();

        //menu

        System.out.println("Escolha a dificuldade:\n" +
                "1 - Fácil (0 a 10)\n" +
                "2 - Médio (0 a 50)\n" +
                "3 - Difícil (0 a 100)");

        //nivel de dificuldade

        int dificuldade;
        while (!input.hasNextInt()) {
            input.next();
            System.out.println("Digite um número valido:");
        }
        dificuldade = input.nextInt();
        while (dificuldade < 1 || dificuldade > 3) {
            System.out.println("digite uma dificuldade valida");
            while (!input.hasNextInt()) {
                input.next();
                System.out.println("Digite um numero valido:");
                dificuldade = input.nextInt();
            }    }
        System.out.println("Dificuldade escolhida: " + dificuldade);
        int max = 0;
        switch (dificuldade) {
            case 1:
                max = 10;
                break;
            case 2:
                max = 50;
                break;
            case 3:
                max = 100;
                break;
        }

        //Gena um numero inteiro aleatorio

        int min = 0;
        int secret = random.nextInt(max - min + 1) + min;
        System.out.println("Advinhe o numero aleatorio de " + min + " ate " + max + "\n");

        //validaçao numerica
        System.out.printf("Digite um numero: \n");
        while (!input.hasNextInt()) {
            input.next();
            System.out.println("Digite um número valido:");
        }
        int chute = input.nextInt();
        //tentativas

        int tentativas = 1;

        // loop de resultados

        while (secret != chute) {
            if (secret > chute) {
                System.out.println("Maior");
            } else if (secret < chute) {
                System.out.println("Menor");
            }
            System.out.println("Tente de novo:");
            while (!input.hasNextInt()) {
                input.next();
                System.out.println("Digite um número valido:");
            }
            chute = input.nextInt();
            tentativas++;

        }
        System.out.println("\nPARABENS! VOCE ACERTOU O NUMERO SECRETO EM " + tentativas + " TENTATIVAS");
                System.out.println("O numero secreto era: " + secret);
    }
}

