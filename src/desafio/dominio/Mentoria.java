package desafio.dominio;
import java.time.LocalDate;


public class Mentoria extends Conteudo{
    private LocalDate date; /// Para trabalhar com data

    public LocalDate getDate(){
        return this.date;
    }
    public void setDate(LocalDate date){
        this.date = date;
    }

    @Override
    public double calcuarXp() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public String toString(){
        return "Curso{"+ "titulo="+getTitle()+", descricao="+getDescricao()+", Data="+getDate()+"}";
    }

}
