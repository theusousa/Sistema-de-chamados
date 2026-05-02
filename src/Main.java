import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Chamado> listaChamado = new ArrayList<>();

        int opcao;
        int contadorId = 1;

        do {
            System.out.println("1 - Abrir chamado");
            System.out.println("2 - Listar chamado");
            System.out.println("3 - Sair");

            opcao = sc.nextInt();
            sc.nextLine();

            if (opcao == 1) {
                System.out.println("Digite o titulo:");
                String titulo = sc.nextLine();

                System.out.println("Digite a descrição:");
                String descricao = sc.nextLine();

                System.out.println("Digite o solicitante:");
                String solicitante = sc.nextLine();

                Chamado novo = new Chamado(contadorId, titulo, descricao, solicitante, "ABERTO");

                listaChamado.add(novo);
                contadorId++;

                System.out.println("Chamado criado com sucesso!");

            } else if (opcao == 2) {
                System.out.println("Listando chamados...");

            } else if (opcao == 3) {
                System.out.println("Saindo do sistema...");

            } else {
                System.out.println("Opção inválida!");
            }

        } while (opcao != 3);

        sc.close();
    }
}