import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Oi, você quer fazer a parte 1 ou a parte 2 do exercício? (Responda com 1 ou 2)");
        int respotas = s.nextInt();

        while ((respotas == 1) || (respotas == 2)) {
            if (respotas == 1) {
                System.out.println("******* PARTE 1 ******");
                commaSeparated();
            } else {
                System.out.println("******* PARTE 2 ******");
                dashSeparated();
            }

            System.out.println("E agora, você quer fazer a parte 1 ou a parte 2 do exercício? (Responda com 1 ou 2 - Para sair, digite 0)");
            respotas = s.nextInt();
        }
    }

    private static void commaSeparated() {
        Scanner s = new Scanner(System.in);
        System.out.println("Insira alguns nomes separados por vírgula:");
        String names = s.nextLine().toLowerCase();

        String[] namesList = names.split(",");
        Arrays.sort(namesList);

        System.out.println("Nomes ordenados: " + Arrays.toString(namesList));
    }

    private static void dashSeparated() {
        Scanner s = new Scanner(System.in);
        System.out.println("Insira os nomes com o sexo separado por traço. Use F ou M para o sexo. Exemplo: [Michael-M] ou [Luiza-F]:");
        String names = s.nextLine().toLowerCase();

        String[] namesArray = names.split(",");
        int numerosElementos = namesArray.length;

        List<String> listaDeDivisaoPorSexoMasculino = new ArrayList<>();
        List<String> listaDeDivisaoPorSexoFeminino = new ArrayList<>();

        for (int i = 0; i < numerosElementos; i++) {
            String[] dividoPorDash = namesArray[i].split("-");
            String nomePorElemento = dividoPorDash[0];

            if (dividoPorDash[1].equalsIgnoreCase("m")) {
                listaDeDivisaoPorSexoMasculino.add(nomePorElemento);
            } else if (dividoPorDash[1].equalsIgnoreCase("f")) {
                listaDeDivisaoPorSexoFeminino.add(nomePorElemento);
            }
        }

        System.out.println("Lista de nomes masculina: " + listaDeDivisaoPorSexoMasculino);
        System.out.println("Lista de nomes feminina: " + listaDeDivisaoPorSexoFeminino);
    }
}
