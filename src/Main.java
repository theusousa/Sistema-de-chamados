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
            System.out.println("3 - Procurar pelo ID");
            System.out.println("4 - Atualizar Status");
            System.out.println("5 - Excluir chamado");
            System.out.println("6 - Sair");

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
                if (listaChamado.isEmpty()) {
                    System.out.println("Nenhum Chamado cadastrado.");
                } else {
                    for (Chamado chamado : listaChamado) {
                        System.out.println(chamado);
                    }
                }


            } else if (opcao == 3) {
                System.out.println("Digite o ID do chamado");
                int idBusca = sc.nextInt();
                sc.nextLine();

                boolean encontrado = false;

                for (Chamado chamado : listaChamado) {
                    if (chamado.getID() == idBusca) {
                        System.out.println(chamado);
                        encontrado = true;
                        break;
                    }
                }

                if (!encontrado) {
                    System.out.println("Chamado não encontrado");
                }


            } else if (opcao == 4) {
                System.out.println("Digite o ID do chamado que deseja atualizar:");
                int idBuscar = sc.nextInt();
                sc.nextLine();

                boolean encontrado = false;

                for (Chamado chamado : listaChamado) {
                    if (chamado.getID() == idBuscar) {
                        System.out.println("Chamado encontrado");
                        System.out.println(chamado);

                        System.out.println("Digite o novo status: ");
                        String novoStatus = sc.nextLine();

                        chamado.setStatus(novoStatus);

                        System.out.println("Status atualizado com sucesso");
                        encontrado = true;
                        break;
                    }
                }

            } else if (opcao == 5) {
                System.out.println("Digite o ID do chamado que deseja excluir:");
                int idBusca = sc.nextInt();
                sc.nextLine();

                boolean removido = false;

                for (Chamado chamado : listaChamado) {
                    if (chamado.getID() == idBusca) {
                        listaChamado.remove(chamado);
                        System.out.println("Chamado excluido com sucesso");
                        removido = true;
                        break;
                    }
                }

                if (!removido) {
                    System.out.println("Chamado não encontrado.");
                }

            } else if (opcao == 6) {
                System.out.println("Saindo do sistema...");

            } else {
                System.out.println("Opção inválida!");
            }

        } while (opcao != 4);

        sc.close();
    }
}