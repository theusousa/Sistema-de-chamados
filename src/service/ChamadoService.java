package service;
import model.Chamado;
import java.util.ArrayList;

public class ChamadoService {
    private ArrayList<Chamado> listaChamado = new ArrayList<>();
    private int contadorId = 1;

    public void cadastroChamado(String titulo, String descricao, String solicitante) {

        if (titulo.isBlank()) {
            System.out.println("Título não pode estar vazio");
            return;
        }
        if (descricao.isBlank()) {
            System.out.println("descrição não pode estar vazio");
            return;
        }
        if (solicitante.isBlank()) {
            System.out.println("solicitante não pode estar vazio");
            return;
        }
        Chamado novo = new Chamado(contadorId, titulo, descricao, solicitante, "ABERTO");
        listaChamado.add(novo);
        contadorId++;

        System.out.println("model.Chamado criado com sucesso!");
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
            System.out.println("model.Chamado não encontrado");
        }
    }

    public void atualizarStatus(int idBuscar, String novoStatus){
       boolean encontrado = false;

       if (!novoStatus.equalsIgnoreCase("ABERTO")
               && !novoStatus.equalsIgnoreCase("EM ANDAMENTO")
               && !novoStatus.equalsIgnoreCase("FINALIZADO")) {
           System.out.println("Status inválido");
           return;
       }

        for (Chamado chamado : listaChamado) {
            if (chamado.getID() == idBuscar){
                chamado.setStatus(novoStatus);
                System.out.println("Status atualizado com sucesso");
                encontrado = true;
                break;
            }

        }
        if (!encontrado) {
            System.out.println("model.Chamado não encontrado");
        }
    }

    public void excluirChamado(int idBusca) {
        boolean removido = false;
        for (Chamado chamado : listaChamado) {
            if (chamado.getID() == idBusca) {
                listaChamado.remove(chamado);
                System.out.println("model.Chamado excluido com sucesso");
                removido = true;
                break;
            }
        }
        if (!removido) {
            System.out.println("model.Chamado não encontrado");
        }
    }
}
