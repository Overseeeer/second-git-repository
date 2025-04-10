import java.util.Scanner;
class HelloWorld{

    public static void main(String [] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Hello, my fellow World! :)");

        System.out.printf("\nDigite o seu nome, meu consagrado: ");
        String nome = scan.nextLine();

        System.out.println("\nO seu nome é: " + nome);

    }

}