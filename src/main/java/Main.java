import com.google.common.collect.Sets;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
//        testePilha();
//        testeFila();
        testeLista();
//        testeConjunto();
//        testeMapa();
//        String[] notas = new String[10];
//        List<String> notasLista = new ArrayList<>();
//        List<String> notasLista2 = new LinkedList<>();
    }

    private static void testePilha() {
        Stack<String> pilha = new Stack<>(); //push(add) pop(remove)
        pilha.push("a"); //c
        pilha.push("b"); //b
        pilha.push("c"); //a
//        System.out.println(pilha);
        while (!pilha.empty()) System.out.println(pilha.pop());
//        System.out.println(pilha.peek()); //exibe o topo da pilha sem remover
//        System.out.println(pilha.pop()); //remove o topo da pilha
    }

    private static void testeLista() {
        List<String> lista = new ArrayList<>();
        List<String> listaLinked = new LinkedList<>();
        lista.add("b");
        lista.add("a");
        lista.add("e");
        lista.add("d");
        lista.add("c");

        //TODO ordenacao por ordem natural
        //TODO ordenacao com comparator considerando vogais primeiro (classe anonima -> lambda)
        //TODO ordenacao com comparator considerando vogais primeiro (classe concreta)

//        Collections.shuffle(lista);
        lista.sort(Comparator.reverseOrder());
        lista.forEach(System.out::println);

        listaLinked.add("A");
        listaLinked.add("C");
        listaLinked.add("B");
        listaLinked.add("D");
        listaLinked.add("A");

//        listaLinked.forEach(System.out::println);//mantem a ordem de inclusao e nao ordem dos elementos(alfabetica no caso de String)
    }

    private static void testeFila() {
        Queue<String> fila = new ArrayDeque<>();
        fila.offer("10");
        fila.offer("1");
        fila.offer("5");

        while (!fila.isEmpty()) System.out.println(fila.poll());

        Queue<Integer> filaPrioritaria = new PriorityQueue<>();
        filaPrioritaria.add(10);
        filaPrioritaria.add(1);
        filaPrioritaria.add(5);
        filaPrioritaria.add(11);
        filaPrioritaria.add(101);

        while (!filaPrioritaria.isEmpty()) {
            var element = filaPrioritaria.poll();
            System.out.println(element);
        }
    }

    private static void testeConjunto() {
        Set<String> conjunto = new HashSet<>();
        conjunto.add("aaa");
        conjunto.add("bbb");
        conjunto.add("ccc");
//        conjunto.forEach(System.out::println);
        Set<String> conjuntoLinked = new LinkedHashSet<>();

        Iterator<String> iterator = conjuntoLinked.iterator();
        while(iterator.hasNext()) {
            String elemento = iterator.next();
        }

        Set<List<String>> listsSet = Sets.cartesianProduct(conjunto, conjunto);
        Set<List<String>> setAtualizado =
                listsSet.stream()
                        .filter(lists -> !lists.get(0).equals(lists.get(1)))
                        .collect(Collectors.toSet());
        System.out.println(setAtualizado);

        conjuntoLinked.add("aaa");
        conjuntoLinked.add("bbb");
        conjuntoLinked.add("ddd");
        conjuntoLinked.add("ccc");
//        conjuntoLinked.forEach(System.out::println);

//        Collections.reverse();

        Set<String> conjuntoOrdenado = new TreeSet<>();
        conjuntoOrdenado.add("zzz");
        conjuntoOrdenado.add("ccc");
        conjuntoOrdenado.add("aaa");
        conjuntoOrdenado.add("bbb");
        conjuntoOrdenado.add("eee");
        conjuntoOrdenado.add("ggg");
//        conjuntoOrdenado.forEach(System.out::println);

        //TODO operacao de remocao
//        System.out.println(conjuntoLinked.removeAll(conjunto));
//        conjuntoLinked.forEach(System.out::println);
//        conjuntoLinked.addAll(conjunto);
    }

    private static void testeMapa() {
        Map<String, Object> mapa = new HashMap<>();
        mapa.put("key1", "valor1");
        mapa.put("key2", "valor2");
        mapa.put("key3", "valor3");
        mapa.put("key4", "valor4");
        mapa.put("key5", "valor5");
//        System.out.println(mapa);
        Map<String, Object> mapaLinked = new LinkedHashMap<>();
        mapaLinked.put("key2", "valor2");
        mapaLinked.put("key1", "valor1");
        mapaLinked.put("key3", "valor3");
        mapaLinked.put("key5", "valor5");
        mapaLinked.put("key4", "valor4");
//        System.out.println(mapaLinked);

        TreeMap<String, Object> mapaTree = new TreeMap<>();
        mapaTree.put("ddd", "ddd");
        mapaTree.put("ccc", "ccc");
        mapaTree.put("bbb", "bbb");
        mapaTree.put("aaa", "aaa");
//        System.out.println(mapaTree);

        Map<AlgumEnum, Object> enumMap = new EnumMap<>(AlgumEnum.class);
        enumMap.put(AlgumEnum.Y, "yyyy");
        enumMap.put(AlgumEnum.Z, "zzz");
        enumMap.put(AlgumEnum.X, "xxx");
        System.out.println(enumMap);
    }
}
