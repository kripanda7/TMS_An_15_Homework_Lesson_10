package com.teachmeskills.lesson10.hometask;

import static com.teachmeskills.lesson10.hometask.utils.Utils.*;

public class Runner {
    public static void main(String[] args) {
        String str = "1234-aBC-5678-Def-1A2b";
        String[] array = str.split("-");
        System.out.println(array[0] + array[2]);
        System.out.println(str.replaceAll("[a-zA-Z]", "*"));
        System.out.println(str.replaceAll("[0-9]+-", "").replaceAll("[0-9]", "/").replaceAll("-/|-", "/").toLowerCase());

        StringBuilder sb = new StringBuilder();
        sb.append(array[1]);
        sb.append("/");
        sb.append(array[3]);
        sb.append("/");
        sb.append(array[4].substring(1, 2));
        sb.append("/");
        sb.append(array[4].substring(3, 4));
        System.out.println("Letters:" + sb.toString().toUpperCase());

        if (str.toLowerCase().contains("abc")) {
            System.out.println("Document number contains \"abc\"");
        } else {
            System.out.println("Document number does not contains \"abc\"");
        }

        if (str.startsWith("555")) {
            System.out.println("Document number starts with \"555\"");
        } else {
            System.out.println("Document number does not starts with \"555\"");
        }

        if (str.toLowerCase().endsWith("1a2b")) {
            System.out.println("Document number ends with \"1a2b\"");
        } else {
            System.out.println("Document number does not ends with \"1a2b\"");
        }

        System.out.println(findTheShortestWord("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua."));
        System.out.println(findTheLongestWord("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua."));
        System.out.println(getStringWithDuplicatedSymbols("Hello"));
    }
}
