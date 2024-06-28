import java.time.LocalDate;

import Dominio.Bootcamp;
import Dominio.Curso;
import Dominio.Dev;
import Dominio.Mentoria;

public class Main {
    
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        Curso curso2 = new Curso();

        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descriçao curso Java");
        curso1.setCargaHoraia(40);

        curso2.setTitulo("Curso Python");
        curso2.setDescricao("Descriçao curso Python");
        curso2.setCargaHoraia(40);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Mentoria para aprender Java");
        mentoria.setData(LocalDate.now());

        // System.out.println(curso1);
        // System.out.println(curso2);
        // System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Java Developer");
        bootcamp.setDescricao("Descricao do bootcamp");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);
        
        Dev devPedro = new Dev();
        devPedro.setNome("Pedro");
        devPedro.increverbootcamp(bootcamp);
        System.out.println("Conteudos incritos: " + devPedro.getConteudosInscritos());
        devPedro.progredir();
        System.out.println("Conteudos concluidos: " + devPedro.getConteudosConcluidos());



        Dev devAna = new Dev();
        devAna.setNome("Ana");
        devAna.increverbootcamp(bootcamp);
        System.out.println("Conteudos incritos: " + devAna.getConteudosInscritos());
        devAna.progredir();
        System.out.println("Conteudos concluidos: " + devAna.getConteudosConcluidos());


    }



}
