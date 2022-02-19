package desafio.dominio;

public abstract class Conteudo {
    private String title;
    private String descricao;

    protected static final double XP_PADRAO = 10d;
    
    public abstract double calcuarXp();

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
