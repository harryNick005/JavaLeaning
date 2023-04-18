package recursion;

public class printLoop {
     public static void printTo100(int input){
         if(input>0){

             printTo100(input-1);
             System.out.println(input+" ");
         }

     }

    public static void main(String[] args) {
        printTo100(10);
    }
}
