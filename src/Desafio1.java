public class Desafio1 {
    public static void main(String[] args) {

        int indice = 13;
        int soma = 0;
        int k = 0;

        do {
            k++;
            soma +=k;
        } while (k<indice);

        System.out.println(soma);
    }
}
