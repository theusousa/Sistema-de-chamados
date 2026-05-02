public class Chamado {
    private int id;
    private String titulo;
    private String descricao;
    private String solicitante;
    private String status;

    public Chamado(int id, String titulo,String descricao, String solicitante, String status){
        this.titulo = titulo;
        this.descricao = descricao;
        this.id = id;
        this.solicitante = solicitante;
        this.status = status;
    }

    public int getID(){
        return id;
    }


    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getStatus(){
        return status;
    }

    public String getSolicitante(){
        return solicitante;
    }

    public void setStatus(){
        this.status = status;
    }

    @Override
    public String toString() {
        return "ID: " + id +
                "\nTitulo: " + titulo +
                "\nDescricao: " + descricao +
                "\nSolicitante: " + solicitante +
                "\nStatus: " + status +
                "\n----------------------";
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
