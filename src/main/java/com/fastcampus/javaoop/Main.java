package com.fastcampus.javaoop;

import com.fastcampus.javaoop.logic.JavaSort;
import com.fastcampus.javaoop.logic.Sort;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Sort<String> sort = new JavaSort<>();
        List<String> sorted = sort.sort(List.of(args));
        System.out.println("[result]: " + sorted);
    }
}
