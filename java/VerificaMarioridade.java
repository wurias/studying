import java.util.Scanner;

public class VerificaMarioridade {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println();
        System.out.println("|Registro para Carteira de Habilitação|");
        System.out.println("Informe seu nome: ");
        String nome = scan.nextLine();

        System.out.println("Olá, " + nome + "!\ninforme sua idade: ");
        int idade = scan.nextInt();

        if (idade < 18) {
            System.out.println("Você é menor de idade!");
        }
        else if ((idade >= 18) && (idade < 75)) {
            System.out.println("Parabéns! Você pode obter sua Carteira de Habilitação.");
        }
        else {
            System.out.println("Por favor, entre em contato com a Supervisão.");
        }


    }
}
