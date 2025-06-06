import java.util.*;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] perguntas = {
            "Telefonou para a vítima?",
            "Esteve no local do crime?",
            "Mora perto da vítima?",
            "Devia para a vítima?",
            "Já trabalhou com a vítima?"
        };

        int respostasPositivas = 0;

        for (String pergunta : perguntas) {
            System.out.print(pergunta + " (s/n): ");
            String resposta = sc.next().toLowerCase();
            if (resposta.equals("s")) {
                respostasPositivas++;
            }
        }

        String classificacao;
        switch (respostasPositivas) {
            case 2 -> classificacao = "Suspeita";
            case 3, 4 -> classificacao = "Cúmplice";
            case 5 -> classificacao = "Assassino";
            default -> classificacao = "Inocente";
        }

        System.out.println("Classificação: " + classificacao);
        sc.close();
    }
}
