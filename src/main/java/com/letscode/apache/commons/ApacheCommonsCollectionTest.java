package com.letscode.apache.commons;

import com.google.common.collect.Lists;
import org.apache.commons.collections4.Bag;
import org.apache.commons.collections4.BidiMap;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.bag.HashBag;
import org.apache.commons.collections4.bidimap.TreeBidiMap;

import java.util.Collection;
import java.util.List;

public class ApacheCommonsCollectionTest {

    public static void main(String[] args) {
//        collectionUtils();
//        bag();
//        bidMap();
    }

    private static void collectionUtils() {
        List<String> lista1 = Lists.newArrayList("a", "b");
        List<String> lista2 = List.of("f", "g");

        List<String> lista = CollectionUtils.collate(lista1, lista2);
//        System.out.println(lista);

        Collection<Object> collection = CollectionUtils.emptyIfNull(null);
//        System.out.println(collection);

//        CollectionUtils.addIgnoreNull(lista1, "as");
//        System.out.println(lista1);
    }

    private static void bag() {
        Bag<Integer> elementos = new HashBag<>();
//        SortedBag<Integer> elementos = new TreeBag<>();
        elementos.add(2);
        elementos.add(1);
        elementos.add(1);
        elementos.add(1);
        elementos.add(3);
        elementos.add(1);
        elementos.add(3);
        elementos.add(3);
//        System.out.println(elementos.first());
        System.out.println(elementos.size());
        System.out.println(elementos.getCount(1));
        System.out.println(elementos);
    }

    private static void bidMap() {
        BidiMap<String, Integer> biMap = new TreeBidiMap<>();
        biMap.put("a", 100);
        biMap.put("b", 200);
        biMap.put("c", 300);
        System.out.println(biMap.get("a"));
        System.out.println(biMap.inverseBidiMap().get(200));
    }
}
