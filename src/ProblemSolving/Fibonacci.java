package ProblemSolving;

public class Fibonacci {
    // Solve without using recursion
    public static int FibonacciSequence(int target){
        int first=0; int second=1; int next=0;
        if(target==0 || target==1){
            return target;
        }
        else{
            for (int i = 1; i < target; i++) {
                next=first+second;
                first=second;
                second=next;

            }
            return next;
        }
    }
    public static int FibonacciSequence_Recursive(int target){
        if(target>=0 && target <2){
            return target;
        }
        else{
            return  target=FibonacciSequence_Recursive(target-1)+FibonacciSequence_Recursive(target-2);

        }
    }
    public static void main(String[] args) {
        System.out.println(Fibonacci.FibonacciSequence(11));
        System.out.println(Fibonacci.FibonacciSequence(11));
    }
}
