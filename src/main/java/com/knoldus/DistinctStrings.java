package com.knoldus;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DistinctStrings {
    public static List<String> getDistinctStrings(List <String> stringList) {

        Function<List<String>, List<String>> distinctStrings = str -> str.stream()
                .distinct()   // WILL GET DISTINCT ELEMENTS
                .sorted()    // SORTING THE LIST
                .collect(Collectors.toList()); // COLLECT AS A LIST
        return distinctStrings.apply(stringList);
    }

    public static void main(String[] args) {

        List <String> list = new ArrayList<>();
        System.out.println("Type words in one line using space and then press enter");
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();

        String [] stringList3 = line.split("\\s");
        for (String str : stringList3) {
            list.add(str);
        }

        System.out.println("Distinct Values" + DistinctStrings.getDistinctStrings(list));
    }
}
