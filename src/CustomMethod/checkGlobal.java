package CustomMethod;

public class checkGlobal {

    public static void main(String[] args) {
        System.out.println(staticMember.herName);
      //  System.out.println(myName);  compile error invalid cannot call local variable
        staticMember.printHelloWorld();
    }
}
