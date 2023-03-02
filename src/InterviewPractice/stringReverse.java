package InterviewPractice;

public class stringReverse {
    // how to reverse a string "Hello World"  ===> dlorW olleH
    // write a method to reverse String
     String  result="";  // 1.global 2. instance
    public static String reverseString(String input){
        String result="";
        for(int i=input.length()-1;i>=0;i--){

            result+=input.charAt(i);

        }
        return result;

    }

    public static void main(String[] args) {
        String result=stringReverse.reverseString("Hello World");
        stringReverse.reverseString("Hello World");
        String reversedString="dlroW olleH";

        if(reversedString.equals(result)){
            System.out.println("Reversed Successfully");
        }

    }
}
