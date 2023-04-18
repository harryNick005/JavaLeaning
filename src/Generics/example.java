package Generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class example <T extends Number> {  //  in class level a extends b means anything lower than b(b is included) can be used as class type
    T value;
    public void listDemo(T[] inputArray){
        List<T> nonGeneric_List=new ArrayList<>(Arrays.asList(inputArray));
        System.out.println(nonGeneric_List);
    }
    public void demo(ArrayList<? extends T> list){  // here we need to pay attention to what T finally is

    }
    public static void main(String[] args) {
       example<Integer> exampleObj=new example<>();
       exampleObj.listDemo(new Integer[]{1,2,3,4,5});
        System.out.println(exampleObj.value = 5555);
//        exampleObj.demo(new ArrayList<Number>());
        exampleObj.demo(new ArrayList<Integer>());


//        example<String> exampleObj2=new example<>();
//        exampleObj2.listDemo(new String[]{"Java","Python","JS","C#"});
//        System.out.println(exampleObj2.value = "This is String");
//        System.out.println(exampleObj2.value.getClass().getName());
    }
}
