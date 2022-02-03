package com.letscode.google.guava;

import com.google.common.collect.*;
import com.letscode.sort.Estudante;

import java.time.LocalDate;
import java.util.*;

public class GuavaCollectionTest {

    public static void main(String[] args) {
//        lists();
//        sets();
//        collections();
//        multiMap();
//        biMap();
//        tables();
    }

    private static void lists() {
        partitions();
    }

    private static void partitions() {
        //construtor estatico mutavel - diferente de List.of ou Arrays.asList (java.util)
        List<String> listaEstudantes = Lists.newArrayList("Aline", "Barbara", "Carlos", "Diogo", "Ester", "Fabio");
        listaEstudantes.add("Artur");

        Collections.shuffle(listaEstudantes);
        List<List<String>> partitions = Lists.partition(listaEstudantes, 2);
        System.out.println(partitions);
    }

    private static void sets() {
        Set<String> conjunto1 = Sets.newHashSet("a", "b", "c");

        Set<String> conjunto2 = Sets.newHashSet("b", "c", "d");

        Set<String> union = Sets.union(conjunto1, conjunto2);
//        System.out.println(union);

        Set<String> intersection = Sets.intersection(conjunto1, conjunto2);
//        System.out.println(intersection);
//
        Set<String> difference = Sets.difference(conjunto1, conjunto2);
//        System.out.println(difference);

        Set<String> symmetricDifference = Sets.symmetricDifference(conjunto1, conjunto2);
//        System.out.println(symmetricDifference);

        Set<List<String>> cartesianProduct = Sets.cartesianProduct(conjunto1, conjunto2);
//        cartesianProduct.forEach(System.out::println);

        Set<Set<String>> combinations = Sets.combinations(union, 2);
//        combinations.forEach(System.out::println);

        Set<Set<String>> powerSet = Sets.powerSet(union); //todas as combinacoes possiveis
//        powerSet.forEach(System.out::println);

        Collection<List<String>> permutations = Collections2.permutations(conjunto1);
//        permutations.forEach(System.out::println);

//        Collections2.filter(union, input -> List.of("a", "b").contains(input)).forEach(System.out::println);
    }

    private static void collections() {
        List<Estudante> estudantes = List.of(
                Estudante.builder().nome("aaaa").build(),
                Estudante.builder().nome("bbbb").build()
        );

        Collection<String> nomes = Collections2.transform(estudantes, Estudante::getNome);
        System.out.println(nomes);
    }

    private static void multiMap() {
        Multimap<String, Estudante> multimap = ArrayListMultimap.create();

        Estudante estudante1 = Estudante.builder().nome("fulano1").turma("turma1").build();
        Estudante estudante2 = Estudante.builder().nome("fulano2").turma("turma2").build();
        Estudante estudante3 = Estudante.builder().nome("fulano3").turma("turma1").build();

        List.of(estudante1,
                estudante2,
                estudante3
        ).forEach(estudante -> multimap.put(estudante.getTurma(), estudante));

//        System.out.println(multimap.keys());
//        System.out.println(multimap.keys().size());
//        System.out.println(multimap.get("turma1"));

//        multimap.remove("turma1", estudante1);
//        System.out.println(multimap);
    }

    private static void biMap() {
        BiMap<String, Integer> biMap = HashBiMap.create();
        biMap.put("fulano1", 1);
        biMap.put("fulano2", 2);
        biMap.put("fulano3", 3);
        System.out.println(biMap.get("fulano1"));
        System.out.println(biMap.inverse().get(2));
        //...
    }

    private static void tables() {
        Table<String, String, Object> table = TreeBasedTable.create();
        //-         qtd     nota       dataNasc
        //fulano    190     8           5/10/90
        //beltrana    220     9           5/1/93

        table.put("fulano", "qtdCursosConcluidos", 190);
        table.put("fulano", "nota", 8);
        table.put("fulano", "dataNasc", LocalDate.of(1990, 10, 5));

        table.put("beltrana", "qtdCursosConcluidos", 220);
        table.put("beltrana", "nota", 9);
        table.put("beltrana", "dataNasc", LocalDate.of(1993, 1, 5));

        Map<String, Map<String, Object>> columnMap = table.columnMap();

        System.out.println(table);
        //linha, coluna, valor
    }
}
