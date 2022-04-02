package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descricao curso java");
        curso1.setRequisitos("introdução a logica de programacao 1");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descricao curso js");
        curso1.setRequisitos("introdução a logica de programacao 2");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devDanilo = new Dev();
        devDanilo.setNome("Danilo");
        devDanilo.setIdade(36);
        devDanilo.inscreverBootcamp(bootcamp);
        System.out.println("Nome do Aluno -> " + devDanilo.getNome());
        System.out.println("Idade de Danilo -> " + devDanilo.getIdade() + "anos");
        System.out.println("Conteúdos Inscritos Danilo" + devDanilo.getConteudosInscritos());
        devDanilo.progredir();
        devDanilo.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Danilo" + devDanilo.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Danilo" + devDanilo.getConteudosConcluidos());
        System.out.println("XP:" + devDanilo.calcularTotalXp());

        System.out.println("---------------------------------------------------------------------------------------");

        Dev devAngelo = new Dev();
        devAngelo.setNome("Ângelo");
        devAngelo.setIdade(41);
        devAngelo.inscreverBootcamp(bootcamp);
        System.out.println("Nome do Aluno -> " + devAngelo.getNome());
        System.out.println("Idade de Ângelo -> " + devAngelo.getIdade() + "anos");
        System.out.println("Conteúdos Inscritos Ângelo" + devAngelo.getConteudosInscritos());
        devAngelo.progredir();
        devAngelo.progredir();
        devAngelo.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Ângelo" + devAngelo.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Ângelo" + devAngelo.getConteudosConcluidos());
        System.out.println("XP:" + devAngelo.calcularTotalXp());

    }
}
