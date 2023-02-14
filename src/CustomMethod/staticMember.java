package CustomMethod;

public class staticMember {
    // class member :
    // 1 var(static variable, instance variable[non-static variable])
    // 2 method(static method, instance method[non-static method])

    /*
    static member belongs to class
    instance member belongs to object
     */


    /*
      variable:
      1.global===> variable: when you declare variable at class level
      2.local ===> variable: when you declare variable at method
     */
    //String static herName="Nancy"; // invalid
    static String herName="Nancy"; // global


    public static void printHelloWorld(){
        System.out.println("Hello World");
    }


    public static void main(String[] args) {
        String myName="Nick"; //local
        System.out.println(myName);
        System.out.println(staticMember.herName);// global
        staticMember.printHelloWorld();

    }

}
