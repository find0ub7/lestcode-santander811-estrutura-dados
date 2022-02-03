package com.letscode.apache.commons;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;

public class ApacheCommonsLangTest {

    public static void main(String[] args) {
//        stringUtils();
//        arraysUtils();
//        numberUtils();
    }

    private static void add() {
        int[] array = {1, 2, 3};
        int[] novoArray = ArrayUtils.add(array, 4);
        System.out.println(ArrayUtils.toString(novoArray));
    }

    private static void shift() {
        int[] array = {1, 2, 3, 4};
        ArrayUtils.shift(array, 2);
        System.out.println(ArrayUtils.toString(array));
    }

    private static void stringUtils() {
        abbreviate();
        defaultIfBlank();
        isEmpty();
        isBlank();
        getDigits();
        leftPad();
        reverse();
    }

    private static void abbreviate() {
        String palavra = StringUtils.abbreviate("Aasdad asdasd sksdkok gfkoddf deisjidjf", 10);
        System.out.println(palavra);
    }

    private static void defaultIfBlank() {
        String variavel = "tem algum valor";
        String valor = StringUtils.defaultIfBlank(variavel, "vazio");
        System.out.println(valor);
    }

    private static void isEmpty() {
        String variavel = "";
//        String variavel = "      ";
//        String variavel = null;
//        String variavel = "tem valor";
        if (StringUtils.isEmpty(variavel)) {
            System.out.println("estah empty");
        } else {
            System.out.println("nao estah empty");
        }
    }

    private static void isBlank() {
        String variavel = "";
//        String variavel = "      ";
//        String variavel = null;
//        String variavel = "tem valor";
        if (StringUtils.isBlank(variavel)) {
            System.out.println("estah blank");
        } else {
            System.out.println("nao estah blank");
        }
    }

    private static void getDigits() {
        String valor = StringUtils.getDigits("asd123asd4");
        System.out.println(valor);
    }

    private static void leftPad() {
        String leftPad = StringUtils.leftPad("1", 3, "0");
        System.out.println(leftPad);
    }

    private static void reverse() {
        String palavra = StringUtils.reverse("abcde");
        System.out.println(palavra);
    }

    private static void arraysUtils() {
//        shift();
//        add();
//        ArrayUtils.
    }

    private static void numberUtils() {
        isParsable();
        max();
//        NumberUtils.
    }

    private static void isParsable() {
        System.out.println(NumberUtils.isParsable("1"));
        System.out.println(NumberUtils.isParsable(" 1"));
    }

    private static void max() {
        int max = NumberUtils.max(1, 19, 2, 4, 29);
        System.out.println(max);
    }
}
