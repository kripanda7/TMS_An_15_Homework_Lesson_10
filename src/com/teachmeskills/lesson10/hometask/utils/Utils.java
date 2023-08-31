package com.teachmeskills.lesson10.hometask.utils;

public class Utils {
    public static String findTheShortestWord(String str) {
        String[] words = str.replaceAll("[,.:;-]", "").split(" ");
        String tempResult = words[0];
        for(String word : words) {
            if(word.length() < tempResult.length()){
                tempResult = word;
            }
        }
        StringBuilder result = new StringBuilder();
        for(String word : words){
            if(word.length() == tempResult.length()) {
                result.append(word).append(",");
            }
        }
        return result.substring(0,result.length()-1);
    }

    public static String findTheLongestWord(String str) {
        String[] words = str.replaceAll("[,.:;-]", "").split(" ");
        String tempResult = words[0];
        for(String word : words) {
            if(word.length() > tempResult.length()){
                tempResult = word;
            }
        }
        StringBuilder result = new StringBuilder();
        for(String word : words){
            if(word.length() == tempResult.length()) {
                result.append(word).append(",");
            }
        }
        return result.substring(0,result.length()-1);
    }

    public static String getStringWithDuplicatedSymbols(String str) {
        StringBuilder sb = new StringBuilder();
        for(String symbol : str.split("")){
            sb.append(symbol).append(symbol);
        }
        return sb.toString();
    }
}
