package inheritance.Intruduction;

public class child extends parent {

    // 1. not use parent object(x) 2. change method implementation(x)

@Override
    public void Polo(){
        System.out.println("辣抓饭");
    }

    public void childMethod(){
        System.out.println("This is method from child class");
    }
    public void childMethod1(){
        System.out.println("This is method1 from child class");
    }
    public void childMethod2(){
        System.out.println("This is method2 from child class");
    }
    public static void main(String[] args) {

        child c=new child();
        c.Polo();


        c.childMethod();
        c.childMethod1();
        c.childMethod2();


        c.parentMethod();
        c.parentMethod1();
        c.parentMethod2();









    }
}
