package ProblemSolving;

import java.util.Arrays;

public class removeDuplicate {
    // Write a method to remove any duplicated char in String
    //E.g String target="abcdac" ==> duplicate:a,c  return: abcd

   // public static String removeDuplicate(String input){  // abcdabcefge   "" -->abcdefg
//        String result="";
//        // for loop
//        for(int i=0;i<input.length();i++){
//            if(!result.contains(input.charAt(i)+"")){
//                result=result+input.charAt(i);
//            }
//        }
//        return result;
//    }

//        public static String removeDuplicate(String input){  // abcdabcefge   "" -->abcdefg
//        String result="";
//        // forEach loop can only be used for collectionsType (array,List,Set,queue,map,Collection)
//        for(String each:input.split("")){ // String[] ={"a","b","c","d","a","b","c"}
//            result=(!result.contains(each)) ? result+each : result;
//        }
//        return result;
//    }


 public static void removeDuplicate(String input,String result, int i) {

// for loop
     if(i<input.length() ) {
         if (!result.contains(input.charAt(i) + "")) {
             result += input.charAt(i);
             removeDuplicate(input, result, ++i);
         } else {
             removeDuplicate(input, result, ++i);
         }
     }
       System.out.println(result);
       System.exit(0);

 }

 public static void removeDuplicate_Set(){

 }
    public static void main(String[] args) {
     //  removeDuplicate.removeDuplicate("aba","",0);
      //  System.out.println(removeDuplicate.removeDuplicate("abcdabceg", "", 0));
//System.out.println(removeDuplicate.removeDuplicate("abcdabcf11223fsgsgwgsgsdg",0));



    }
}