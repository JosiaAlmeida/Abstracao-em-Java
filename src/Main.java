import java.time.LocalDate;

import desafio.dominio.Curso;
import desafio.dominio.Mentoria;

public class Main{
    public static void main(String[] args) {
        Curso curso = new Curso();
        Mentoria mentoria = new Mentoria();

        curso.setTitle("Java");
        curso.setDescricao("Abstraindo objecto e java");
        curso.setCargaHoraria(4);

        mentoria.setTitle("Josia Almeida");
        mentoria.setDescricao("Explicando como abstrair um objecto em Java");
        mentoria.setDate(LocalDate.now());

        System.out.println(curso.toString());
        System.out.println(mentoria.toString());
        
    }
}