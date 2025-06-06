import java.util.*;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Double> notas = new ArrayList<>();

        double entrada;
        System.out.println("Digite as notas (digite -1 para encerrar):");
        while ((entrada = sc.nextDouble()) != -1) {
            notas.add(entrada);
        }

        int qtd = notas.size();
        System.out.println("Quantidade de notas: " + qtd);

        System.out.print("Notas na ordem: ");
        for (double n : notas) {
            System.out.print(n + " ");
        }

        System.out.println("\nNotas na ordem inversa:");
        for (int i = notas.size() - 1; i >= 0; i--) {
            System.out.println(notas.get(i));
        }

        double soma = 0;
        for (double n : notas) soma += n;
        double media = soma / qtd;

        int acimaMedia = 0, abaixoSete = 0;
        for (double n : notas) {
            if (n > media) acimaMedia++;
            if (n < 7) abaixoSete++;
        }

        System.out.printf("Soma das notas: %.2f\n", soma);
        System.out.printf("Média das notas: %.2f\n", media);
        System.out.println("Notas acima da média: " + acimaMedia);
        System.out.println("Notas abaixo de 7: " + abaixoSete);

        System.out.println("Fim do programa. Obrigado!");
        sc.close();
    }
}
