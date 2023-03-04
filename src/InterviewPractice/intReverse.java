package InterviewPractice;

public class intReverse {
    // how do we reverse integer

    //1. convert int to String 2. Utilize String class method  3. Convert reversed String back to int type

    public static int reverse_Integer_forLoop( int input){

        // How to convert Integer to String  =====> String.valueOf()   or Integer.toString()
        String convertInteger=String.valueOf(input);

        // logic part
        String result="";
        for(int i=convertInteger.length()-1;i>=0; i--){
            result+=convertInteger.charAt(i);
        }
        // How to convert String to Integer =====> Integer.parseInt()
        return Integer.parseInt(result);

    }

    public static int reverse_Integer_whileLoop( int input){
        String result="";
        String convertedString=Integer.toString(input);
        int j=convertedString.length()-1;
        while ( j>=0){
            result+=convertedString.charAt(j--);
        }
        return Integer.parseInt(result);

    }


    //2. No String conversion

    public static int reverseByModule(int input){
        // 1.get the remainder by 10  2. get the quotient by 10
        int result=0;
        while (input!=0){
            int R=input%10;
            result=(result*10)+R;
            input/=10;
        }
        return result;

    }




    public static void main(String[] args) {

        System.out.println(reverse_Integer_forLoop(12345));
        System.out.println(reverse_Integer_whileLoop(reverse_Integer_forLoop(12345)));
        System.out.println(reverseByModule(123));



    }
}
