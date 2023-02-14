package CustomMethod;

public class instanceMember {

    String myName;
    public void printName(String Name){
        System.out.println("My name is "+Name);
    }

    public static void main(String[] args) {
        // we need to create an object
        // ClassName objectName = new Constructor
        // Constructor =className+();
        // ClassName objectName = new className()

        instanceMember obj = new instanceMember();

        obj.printName("Alibaba  ");

    }
}
