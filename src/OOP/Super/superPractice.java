package OOP.Super;

public class superPractice {
    Integer id;
    String name;
public void print(){
    System.out.println("Hello World");
}
    public superPractice(){
      this(123,"Name1");
    }
    public superPractice(Integer id,String name){
        this.id=id;
        this.name=name;
    }
}
