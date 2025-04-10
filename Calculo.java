import java.util.Scanner;
class Calculo{

    public static void Main(String [] args){

        Scanner scan = new Scanner(System.in);

        System.out.printf("Digite o número 1: ");
        int num1 = scan.nextInt();

        System.out.printf("\nDigite o número 2: ");
        int num2 = scan.nextInt();

        int calculo = num1+num2;

        System.out.printf("\n\nO resultado é: %d", calculo);

    }

}