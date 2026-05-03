import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ChamadoService chamadoService = new ChamadoService();

        int opcao;

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

                chamadoService.cadastroChamado(titulo, descricao, solicitante);

            } else if (opcao == 2) {
                chamadoService.listarChamado();


            } else if (opcao == 3) {
                System.out.println("Digite o ID do chamado");
                int idBusca = sc.nextInt();
                sc.nextLine();

                chamadoService.buscarId(idBusca);


            } else if (opcao == 4) {
                
                System.out.println("Digite o ID do chamado que deseja atualizar:");
                int idBuscar = sc.nextInt();
                sc.nextLine();

                System.out.println("1 - ABERTO");
                System.out.println("2 - EM ANDAMENTO");
                System.out.println("3 - FINALIZADO");

                System.out.println("Selecione o novo status: ");
                int statusOpcao = sc.nextInt();
                sc.nextLine();

                String novoStatus = "";

                if (statusOpcao == 1) {
                    novoStatus = "ABERTO";
                } else if (statusOpcao == 2) {
                    novoStatus = "EM ANDAMENTO";
                } else if (statusOpcao == 3) {
                    novoStatus = "FINALIZADO";
                } else {
                    System.out.println("Opção inválida");
                }

                if (!novoStatus.isBlank()) {
                    chamadoService.atualizarStatus(idBuscar, novoStatus);
                }


            } else if (opcao == 5) {
                System.out.println("Digite o ID do chamado que deseja excluir:");
                int idBusca = sc.nextInt();
                sc.nextLine();

                chamadoService.excluirChamado(idBusca);

            } else if (opcao == 6) {
                System.out.println("Saindo do sistema...");

            } else {
                System.out.println("Opção inválida!");
            }

        } while (opcao != 6);

        sc.close();
    }
}