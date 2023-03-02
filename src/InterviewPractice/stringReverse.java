package InterviewPractice;

public class stringReverse {
    // how to reverse a string "Hello World"  ===> dlorW olleH
    // write a method to reverse String
     String  result="";  // 1.global 2. instance
    // 1
    public static String reverse_String(String input){
        String result="";
        for(int i=input.length()-1;i>=0;i--){

            result+=input.charAt(i);

        }
        return result;

    }




    //2 StringBuffer StringBuilder

    public static String StringBuffer_Reverse(String input){
        StringBuffer stringBuffer=new StringBuffer(input);
        return stringBuffer.reverse().toString();
    }

    public static String StringBuilder_Reverse(String input){
        StringBuilder stringBuilder=new StringBuilder(input);
        return stringBuilder.reverse().toString();
    }


    public static void main(String[] args) {
        String result=stringReverse.reverse_String("Hello World");
        System.out.println(result);

        System.out.println(stringReverse.StringBuffer_Reverse("Hellow Java"));
        System.out.println(stringReverse.StringBuilder_Reverse("Hellow Python"));



    }
}
