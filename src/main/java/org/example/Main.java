package org.example;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> ls = new ArrayList<>();
        Average av = new Average();
        initList(ls);
        System.out.println("Среднее значение всех четных чисел в списке: " + ls + " = " + av.aver(ls));

    }

    private static void initList(List ls) {
        for (int i = 1; i < 11; i++) {
            ls.add(i);
        }
    }

}