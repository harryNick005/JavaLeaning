package Generics;

import java.util.ArrayList;
import java.util.List;

public class genericMethod {
    public static void main(String[] args) {
        List nonGeneric=new ArrayList<>();
        nonGeneric.add(Integer.valueOf(1));
        nonGeneric.add(2);
        nonGeneric.add("Hello World");
        System.out.println(nonGeneric);
        Integer value=(Integer) nonGeneric.get(0);

    }
}
