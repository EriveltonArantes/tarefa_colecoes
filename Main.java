import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> nomesMasculinos = new ArrayList<>();
        List<String> nomesFemininos = new ArrayList<>();

        do {
            System.out.print("Digite um nome de usuário: ");
            String nome = scanner.nextLine();

            System.out.print("É masculino ou feminino? (M/F): ");
            String genero = scanner.nextLine();

            if (genero.equalsIgnoreCase("M") || genero.equalsIgnoreCase("masculino")) {
                nomesMasculinos.add(nome);
            } else if (genero.equalsIgnoreCase("F") || genero.equalsIgnoreCase("feminino")) {
                nomesFemininos.add(nome);
            } else {
                System.out.println("Opção de gênero inválida. Ignorando o nome.");
            }

            System.out.print("Deseja adicionar mais um nome? (S/N): ");
            String resposta = scanner.nextLine();
            if (!resposta.equalsIgnoreCase("S") && !resposta.equalsIgnoreCase("sim")) {
                break;
            }
        } while (true);

        // Ordenar os nomes em ordem alfabética
        Collections.sort(nomesMasculinos);
        Collections.sort(nomesFemininos);

        // Imprimir os nomes separados por vírgulas com o gênero
        System.out.println("Nomes masculinos:");
        for (String nome : nomesMasculinos) {
            System.out.println("Masculino: " + nome);
        }

        System.out.println("\nNomes femininos:");
        for (String nome : nomesFemininos) {
            System.out.println("Feminino: " + nome);
        }

        // Calcular e exibir o total de nomes
        int totalMasculinos = nomesMasculinos.size();
        int totalFemininos = nomesFemininos.size();
        System.out.println("\nTotal de nomes masculinos: " + totalMasculinos);
        System.out.println("Total de nomes femininos: " + totalFemininos);
    }
}
