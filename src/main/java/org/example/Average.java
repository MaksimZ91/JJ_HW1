package org.example;

import java.util.List;
import java.util.stream.IntStream;

public class Average {
    public double aver(List ls){
        return ls.stream()
                .filter(element -> ((int)element % 2) == 0)
                .flatMapToInt(el -> IntStream.of((Integer) el))
                .average()
                .orElse(-1);
    }
}
