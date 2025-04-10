import java.util.Scanner;
class HelloWorld{

    public static void main(String [] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Hello, World! :)");

        System.out.printf("\nDigite o seu nome: ");
        String nome = scan.nextLine();

        System.out.println("\nSeu nome é: " + nome);

    }

}