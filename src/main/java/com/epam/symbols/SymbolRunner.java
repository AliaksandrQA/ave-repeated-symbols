package com.epam.symbols;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class SymbolRunner {
    public static void main(String[] args) {
        String[] str = "aaabbbbbcccccccxxxxxxxxlllll".split("");
        List<String> list = new LinkedList<>(Arrays.asList(str));

        findRepeatedSymbols(list);
    }

    private static void findRepeatedSymbols(List<String> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            int counter = 0;
            for (int j = i + 1; j < list.size(); j++) {

                if (Objects.equals(list.get(i), list.get(j))) {
                    counter++;
                    list.remove(j);
                    j--;
                }
            }
            System.out.println(counter + " " + list.get(i));
        }
    }
}
