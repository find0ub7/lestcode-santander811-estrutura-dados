package com.letscode.google.guava;

import com.google.common.base.CaseFormat;
import com.google.common.base.CharMatcher;
import com.google.common.base.Splitter;

import java.util.Arrays;

public class GuavaStringTest {

    public static void main(String[] args) {
//        caseFormat();
//        splitter();
//        charMatcher();
    }

    private static void caseFormat() {
//        Format	        Example
//        LOWER_CAMEL	    lowerCamel
//        LOWER_HYPHEN	    lower-hyphen
//        LOWER_UNDERSCORE	lower_underscore
//        UPPER_CAMEL	    UpperCamel
//        UPPER_UNDERSCORE	UPPER_UNDERSCORE

        String convertido = CaseFormat.UPPER_CAMEL.to(CaseFormat.LOWER_CAMEL, "AlgumaCoisa");
        System.out.println(convertido);
    }

    private static void splitter() {
        String linha = "campo1 ;campo2 ;; campo4";
        String[] split = linha.split(";");

        System.out.println("split.length: " + split.length);
        Arrays.stream(split)
                .forEach(System.out::println);

        System.out.println("----");

        Splitter.on(";")
//                .omitEmptyStrings()
                .trimResults()
                .split(linha)
                .forEach(System.out::println);
    }

    private static void charMatcher() {
        String texto = "algum texto \r\ncom \tcaracteres de controle";
        System.out.println(texto);
        String frase = CharMatcher.javaIsoControl().removeFrom(texto);
        System.out.println(frase);
    }
}
