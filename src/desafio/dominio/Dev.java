package desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
    private String nome;
    private Set<Conteudo> conteudoInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

    public void inscreverBootcamp(Bootcamp bootcamp){
        this.conteudoInscritos.addAll(bootcamp.getConteudos());
        bootcamp.getDevInscritos().add(this);
    }

    public void progredir(){
        Optional<Conteudo> conteudo = this.conteudoInscritos.stream().findFirst();
        if(conteudo.isPresent()){
            this.conteudosConcluidos.add(conteudo.get());
            this.conteudoInscritos.remove(conteudo.get());
        }
        else{
            System.err.println("Voce nao esta matriculado em nenhum conteudo!");
        }
    }

    public double calcularXp(){
        return this.conteudosConcluidos.stream().mapToDouble(conteudo-> conteudo.calcuarXp()).sum();
    }

    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(o==null||getClass()!=o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteudoInscritos, dev.conteudoInscritos) && Objects.equals(conteudosConcluidos,dev.conteudosConcluidos);
    }

    @Override
    public int hashCode(){
        return Objects.hash(nome, conteudoInscritos, conteudosConcluidos);
    }
}
