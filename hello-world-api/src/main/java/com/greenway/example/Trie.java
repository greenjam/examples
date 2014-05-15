package com.greenway.example;

import org.apache.commons.collections4.trie.PatriciaTrie;

import java.util.Map;

public class Trie {

    private static PatriciaTrie<String> trie = new PatriciaTrie<String>();

    public static void main(String[] args){
        trie.put("qwerty_42234_fkgd","123456");
        trie.put("qwerty_42235_fkgd","123457");
        trie.put("qwerty_42236_fkgd","123458");
        trie.put("qwerty_42237_fkgd","123459");
        trie.put("qwerty_42238_fkgd","123450");
        trie.put("qwerty_42239_fkgd","123451");

        Map.Entry<String,String> string =trie.select("qwerty_4223_d");
        String value = trie.get("qwerty_42235_fkd");
        System.out.println(value);
    }
}
