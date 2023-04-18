package Collection;

import java.util.*;

public class ListPractice {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();



        ArrayList<String> stringArrayList=new ArrayList<>();
        stringArrayList.add("Java");
        stringArrayList.add("Python");
        stringArrayList.add("JS");
        stringArrayList.add("100");
        System.out.println(stringArrayList);

        String firstElement= stringArrayList.get(0);
        String fourthElement=(String) stringArrayList.get(3);
        System.out.println(fourthElement);




        List<Character> linkedList=new LinkedList<>();
        Vector<Integer> vector=new Vector<>();
        Stack<Double> stack=new Stack<>();

    }
}
