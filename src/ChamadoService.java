import java.util.ArrayList;

public class ChamadoService {
    private ArrayList<Chamado> listaChamado = new ArrayList<>();
    private int contadorId = 1;

    public void cadastroChamado(String titulo, String descricao, String solicitante) {
        Chamado novo = new Chamado(contadorId, titulo, descricao, solicitante, "ABERTO");

        listaChamado.add(novo);
        contadorId++;

        System.out.println("Chamado criado com sucesso!");
    }

    public void listarChamado() {
        if (listaChamado.isEmpty()) {
            System.out.println("Nenhum chamado cadastrado.");
        } else {
            for (Chamado chamado : listaChamado) {
                System.out.println(chamado);
            }
        }
    }

    public void buscarId(int idBusca) {

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
    }

    public void atualizarStatus(int idBuscar, String novoStatus) {
       boolean encontrado = false;

        for (Chamado chamado : listaChamado) {

            if (chamado.getID() == idBuscar){
                chamado.setStatus(novoStatus);
                System.out.println("Status atualizado com sucesso");
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Chamado não encontrado");
        }
    }

    public void excluirChamado(int idBusca) {
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
            System.out.println("Chamado não encontrado");
        }
    }
}
