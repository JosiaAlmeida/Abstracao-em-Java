package desafio.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {
    private String nome;
    private String descricao;
    private final LocalDate dateInicial = LocalDate.now();
    private final LocalDate dataFinal = dateInicial.plusDays(45);
    private Set<Dev> devInscritos = new HashSet<>();
    private Set<Conteudo> conteudos = new LinkedHashSet<>();
    

    /**
     * @return String return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return String return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return Set<Dev> return the devInscritos
     */
    public Set<Dev> getDevInscritos() {
        return devInscritos;
    }

    /**
     * @param devInscritos the devInscritos to set
     */
    public void setDevInscritos(Set<Dev> devInscritos) {
        this.devInscritos = devInscritos;
    }

    /**
     * @return Set<Conteudo> return the conteudos
     */
    public Set<Conteudo> getConteudos() {
        return conteudos;
    }

    /**
     * @param conteudos the conteudos to set
     */
    public void setConteudos(Set<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }


    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(o==null||getClass()!=o.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals(nome, bootcamp.nome) && Objects.equals(descricao, bootcamp.descricao) && Objects.equals(devInscritos,bootcamp.devInscritos)&& Objects.equals(conteudos,bootcamp.conteudos);
    }

    @Override
    public int hashCode(){
        return Objects.hash(nome, descricao, devInscritos, conteudos);
    }

}
