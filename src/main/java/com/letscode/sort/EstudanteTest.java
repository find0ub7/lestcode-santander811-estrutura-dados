package com.letscode.sort;


import com.google.common.collect.Lists;
import org.apache.commons.collections4.CollectionUtils;

import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

public class EstudanteTest {

    public static void main(String[] args) {
        Set<Estudante> estudantes = new HashSet<>();
        estudantes.add(Estudante.builder().nome("Joao").turma("811").idade(22).rank(5).build());
        estudantes.add(Estudante.builder().nome("Mariana").turma("811").idade(23).rank(3).build());
        estudantes.add(Estudante.builder().nome("Bruna").turma("810").idade(28).rank(10).build());
        estudantes.add(Estudante.builder().nome("Joao").turma("811").idade(12).rank(6).build());
        estudantes.add(Estudante.builder().nome("Maria").turma("811").idade(23).rank(4).build());

        Set<Estudante> estudantesGrupo2 = new HashSet<>();
        estudantesGrupo2.add(Estudante.builder().nome("Maria").turma("810").idade(23).rank(8).build());
        estudantesGrupo2.add(Estudante.builder().nome("Maria").turma("812").idade(23).rank(9).build());
        estudantesGrupo2.add(Estudante.builder().nome("Andre").turma("808").idade(20).rank(1).build());
        estudantesGrupo2.add(Estudante.builder().nome("Andre").turma("808").idade(20).rank(1).build());

        Set<Estudante> estudantesGrupo3 = new HashSet<>();
        estudantesGrupo3.add(Estudante.builder().nome("Joao").turma("811").idade(12).rank(6).build());
        estudantesGrupo3.add(Estudante.builder().nome("Maria").turma("811").idade(23).rank(4).build());

        Collection<Estudante> intersection = CollectionUtils.intersection(estudantes, estudantesGrupo3);
//        intersection.forEach(System.out::println);

        // // (a, b) x (d, e) -> ((a, d), (a, e), (b, d), (b, e))
//        Set<List<Estudante>> listSet = Sets.cartesianProduct(estudantesGrupo3, estudantesGrupo3);
//        listSet.forEach(System.out::println);

//        estudantes.forEach(System.out::println);

//        Set<Estudante> estudantesMap = List.of("fulano", "beltrano")
//                .stream()
//                .filter(nome -> nome.equals("fulano"))
//                .map(nome -> Estudante.builder().nome(nome).build())
//                .collect(Collectors.toSet());

        Map<String, List<Estudante>> estudantesPorTurma = estudantes.stream().collect(groupingBy(Estudante::getTurma));

//        estudantesPorTurma.forEach((turma, ests) -> {
//            System.out.println("Turma: " + turma);
//            System.out.println("Estudantes: " + ests);
//        });

        List<Estudante> estudantes811 = estudantesPorTurma.getOrDefault("819", Collections.emptyList());
//        System.out.println(estudantes811);

//        new ArrayList<>(estudantes).sort(
//                Comparator.comparing(Estudante::getNome)
//                .thenComparing(Estudante::getIdade, Comparator.reverseOrder())
//                .thenComparing(Estudante::getRank));

//        estudantes.stream()
//                .sorted(Comparator.comparing(Estudante::getNome)
//                        .thenComparing(Estudante::getIdade, Comparator.reverseOrder())
//                        .thenComparing(Estudante::getRank))
//                .forEach(System.out::println);

//        agrupamentoPorIteracao(estudantes);


        Map<String, List<Estudante>> agrupamentoViaStream = estudantes.stream().collect(groupingBy(Estudante::getTurma));
        System.out.println(agrupamentoViaStream);

//        Set<Estudante> estudantesSet = new TreeSet<>(comparing(Estudante::getNome)
//                .thenComparing(Estudante::getIdade, reverseOrder())
//                .thenComparing(Estudante::getRank));

//        estudantesSet.addAll(estudantes);
//        estudantes.forEach(estudantesSet::add);

//        estudantesSet.forEach(System.out::println);
    }

    private static void agrupamentoPorIteracao(Set<Estudante> estudantes) {
        Map<String, List<Estudante>> agrupamento = new HashMap<>();
        for (Estudante estudante : estudantes) {
            String turma = estudante.getTurma();

            List<Estudante> listaDaTurma = agrupamento.getOrDefault(turma, Lists.newArrayList());
            listaDaTurma.add(estudante);
            agrupamento.put(turma, listaDaTurma);
        }
        System.out.println(agrupamento);
    }
}
