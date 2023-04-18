package ProblemSolving;

import java.util.Arrays;

public class removeDuplicate {
    // Write a method to remove any duplicated char in String
    //E.g String target="abcdac" ==> duplicate:a,c  return: abcd

//    public static String removeDuplicate(String input){  // abcdabcefge   "" -->abcdefg
//        String result="";
//        // for loop
//        for(int i=0;i<input.length();i++){
//            if(!result.contains(input.charAt(i)+"")){
//                result=result+input.charAt(i);
//            }
//        }
//        return result;
//    }

        public static String removeDuplicate(String input){  // abcdabcefge   "" -->abcdefg
        String result="";
        // forEach loop can only be used for collectionsType (array,List,Set,queue,map,Collection)
        for(String each:input.split("")){ // String[] ={"a","b","c","d","a","b","c"}
            result=(!result.contains(each)) ? result+each : result;
        }
        return result;
    }


    public static void main(String[] args) {
        System.out.println(removeDuplicate.removeDuplicate("abcdabcf"));
        System.out.println(removeDuplicate.removeDuplicate("abcdabcf11223fsgsgwgsgsdg"));



    }
}