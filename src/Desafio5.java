import java.util.Scanner;

public class Desafio5 {
    public static void main(String[] args) {

        // 5) Escreva um programa que inverta os caracteres de um string.
        //IMPORTANTE:
        //a) Essa string pode ser informada através de qualquer entrada de sua preferência ou pode ser previamente definida no código;
        //b) Evite usar funções prontas, como, por exemplo, reverse;

        String palavra;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a palavra a ser invertida: ");
        palavra = entrada.nextLine();
        System.out.println("Palavra original: " + palavra);
        System.out.println("Palavra invertida: " + inverterString(palavra));

    }
    public static String inverterString(String str) {
            StringBuilder stringInvertida = new StringBuilder();
            for (int i = str.length() - 1; i >= 0; i--) {
                stringInvertida.append(str.charAt(i));
            }
            return stringInvertida.toString();
        }
}
