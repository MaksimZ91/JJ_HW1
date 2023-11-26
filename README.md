# Урок 1. Лямбды и Stream API.  
Напишите программу, которая использует Stream API для обработки списка чисел. Программа должна вывести на экран среднее значение всех четных чисел в списке. 
![1](https://github.com/MaksimZ91/JJ_HW1/assets/72209139/cce5a3a8-c273-47ec-8a32-020e97f44047)

## Class Main 
```java
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
```

## Class Average
```java
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

```
