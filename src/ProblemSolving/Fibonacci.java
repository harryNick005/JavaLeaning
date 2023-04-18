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

    public static void main(String[] args) {
        System.out.println(Fibonacci.FibonacciSequence(11));
    }
}
