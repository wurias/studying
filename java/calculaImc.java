/*
    _
 _ | |__ ___ ____ _
| || / _` \ V / _` |
 \__/\__,_|\_/\__,_|

CALCULA IMC
    Recebe entrada de usuário, calcula e retorna IMC
    com tabela de índices de obsidade.
*/
import java.util.Scanner;

public class calculaImc {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira seu peso: ");
        float peso = scan.nextFloat();
        System.out.println("Insira sua Altura: ");
        float altura = scan.nextFloat();

        float imc = peso / (altura * 2);
        System.out.printf("Seu IMC: %.2f %n", imc);

        if (imc < 18.5) {
            System.out.println("Abaixo do peso Normal");
        } else if ((imc >= 18.5) && (imc <= 24.9)) {
            System.out.println("Peso Normal");
        } else if ((imc >= 25) && (imc <= 29.9)) {
            System.out.println("Excesso de Peso");
        } else if ((imc >= 30 ) && (imc <= 34.9)) {
            System.out.println("Obesidade Classe I");
        } else if ((imc >= 35.0) && (imc <= 39.9)) {
            System.out.println("Obesidade Classe II");
        } else if (imc >= 40) {
            System.out.println("Obesidade Classe III");
        }
    }
}
