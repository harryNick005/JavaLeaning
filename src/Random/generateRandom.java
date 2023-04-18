package Random;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class generateRandom {
    public static double generateRandom(double ... range){
     return Math.random()*(range[1]-range[0])+range[0];
    }

    public static void main(String[] args) {
        System.out.println(generateRandom.generateRandom(2, 5));

        List<String> strList= Arrays.asList("Java","python","JS");

        Consumer<String> consumer=new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println("Hello: "+s);
            }
        };
        consumer.accept("bro");

        strList.forEach(consumer);
//        strList.forEach(new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println("Hello: "+s);
//            }
//        });

    }
}
