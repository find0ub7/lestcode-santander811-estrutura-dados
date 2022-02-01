package com.letscode.apache.commons.collections;

import com.google.common.collect.Lists;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.Transformer;
import org.apache.commons.collections.TransformerUtils;

import java.util.*;

public class ApacheCommonsCollectionTest {

    public static void main(String[] args) {
        List<String> lista = Lists.newArrayList("a", "b", "c", "d", "a", "b", "c", "d");
        Set<String> conjunto = Set.of("a", "b");
        Collection intersection = CollectionUtils.intersection(lista, conjunto);
        System.out.println(intersection);

        Collections.sort(lista);

        CollectionUtils.transform(lista, o -> Integer.valueOf(o.hashCode()));
        System.out.println(lista);

    }
}
