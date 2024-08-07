import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numeroAleatorio = new Random().nextInt(100);
        int tentativas = 5;
        int contador = 5;
        int  i;


        System.out.println("Você terá 5 chances para adivinhar o número.");
        for ( i = 0; i < tentativas; i++){

            System.out.println("Adivinhe o número?");

            int numero =sc.nextInt();

            if(numero > 100){
                System.out.println("O número digitado não pode ser maior que 100.");
            }else {


                if(numero == numeroAleatorio){
                    System.out.println("Você acetou!!");
                    break;
                }
                else{
                    contador--;
                    System.out.println("Errou!! você tem " + contador  +  " chances para acertar"  );

                    if(numero > numeroAleatorio){
                        System.out.println("O número que foi digitado é maior que o número sorteado.");

                    }
                    else {
                        System.out.println("O número que foi digitado é menor que o número sorteado.");

                    }
                }

            }
        }
        System.out.println("Número sorteado: " + numeroAleatorio);

    }
}