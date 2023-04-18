package InterviewPractice;

public class fibonacci {
    public static int fibonacci_Calculation(int input){
       int first=0; int second=1; int next=0;
       for(int i=1;i<input;++i){
           next=first+second;
           first=second;
           second=next;
       }
       return next;
    }
    public static int fibonacci_Calculation_Recursion(int input){
       int result=0;
       if(input>1){
           result=fibonacci_Calculation_Recursion(input-1)+fibonacci_Calculation_Recursion(input-2);
           return result;
       }
       else if(input<0){
           throw new RuntimeException("Invalid Input for negative");
       }
       else{
           return input;
       }

    }

    public static void main(String[] args) {
        System.out.println(fibonacci.fibonacci_Calculation_Recursion(10));
        System.out.println(fibonacci.fibonacci_Calculation(10));
    }
}
