import java.util.*;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] faixaSalarial = new int[9]; // índices de 0 a 8

        while (true) {
            System.out.print("Digite as vendas brutas da semana (ou -1 para sair): ");
            double vendas = sc.nextDouble();
            if (vendas == -1) break;

            double salario = 200 + vendas * 0.09;
            int indice = (int) (salario / 100) - 2;

            if (indice >= 8) {
                faixaSalarial[8]++;
            } else if (indice >= 0) {
                faixaSalarial[indice]++;
            }
        }

        String[] intervalos = {
            "$200 - $299", "$300 - $399", "$400 - $499",
            "$500 - $599", "$600 - $699", "$700 - $799",
            "$800 - $899", "$900 - $999", "$1000 ou mais"
        };

        System.out.println("\nDistribuição dos salários:");
        for (int i = 0; i < faixaSalarial.length; i++) {
            System.out.printf("%s: %d\n", intervalos[i], faixaSalarial[i]);
        }

        sc.close();
    }
}
