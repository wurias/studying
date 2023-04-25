package devdojo.curso.introducao;

import java.util.Scanner;

public class operadorTernario {
    public static void main(String[] args) {

        int idade;
        String nome, resposta;

        Scanner scan = new Scanner(System.in);
        System.out.println("Informe seu nome: ");
        nome = scan.nextLine();
        System.out.println("Agora sua Idade: ");
        idade = scan.nextInt();

        resposta = idade >= 18 ? "Autorizado Emitir CNH." : "Proibido Emitir CNH.";

        System.out.println(resposta);


    }
}
