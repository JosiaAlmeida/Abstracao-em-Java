import java.time.LocalDate;

import desafio.dominio.Bootcamp;
import desafio.dominio.Curso;
import desafio.dominio.Dev;
import desafio.dominio.Mentoria;

public class Main{
    public static void main(String[] args) {
        Curso curso = new Curso();
        Curso curso1 = new Curso();
        Curso curso2 = new Curso();
        Mentoria mentoria = new Mentoria();

        curso.setTitle("Java");
        curso.setDescricao("Abstraindo objecto e java");
        curso.setCargaHoraria(4);

        curso1.setTitle("C#");
        curso1.setDescricao("Abstraindo objecto em C#");
        curso1.setCargaHoraria(4);

        curso2.setTitle("Dart");
        curso2.setDescricao("Abstraindo objecto e Dart");
        curso2.setCargaHoraria(4);

        mentoria.setTitle("Josia Almeida");
        mentoria.setDescricao("Explicando como abstrair um objecto em Java");
        mentoria.setDate(LocalDate.now());

        // System.out.println(curso.toString());
        // System.out.println(mentoria.toString());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp POO");
        bootcamp.setDescricao("Bootcamp POO go go go");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);

        Dev dev = new Dev();
        dev.setNome("Josia");
        dev.inscreverBootcamp(bootcamp);

        System.out.println("\n\nConteudo Inscrito"+ dev.getConteudoInscritos());

        Dev dev2 = new Dev();
        dev2.setNome("Almeida");
        dev2.inscreverBootcamp(bootcamp);

        System.out.println("\n\nConteudo Inscrito"+ dev2.getConteudoInscritos());
        


    }
}