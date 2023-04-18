package OOP.Super;

public class constructor extends superPractice{
    char gender;
    public void demo(){
        super.print();
    }
    public constructor(){
        super();
        System.out.println("Default Constructor");
    }

    public constructor(Integer id,String name,char gender){
        super(id,name);
        this.gender=gender;
    }

    public static void main(String[] args) {
        constructor constructor=new constructor(5,"name2",'M');
        constructor.demo();
        System.out.println(constructor.id);
        System.out.println(constructor.name);
        System.out.println(constructor.gender);
    }

}
