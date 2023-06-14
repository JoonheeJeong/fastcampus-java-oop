package com.fastcampus.javaoop;

import com.fastcampus.javaoop.logic.BubbleSort;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        BubbleSort<String> bubbleSort = new BubbleSort<>();
        List<String> sorted = bubbleSort.sort(List.of(args));
        System.out.println(sorted);
    }
}
