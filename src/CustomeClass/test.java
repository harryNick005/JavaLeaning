package CustomeClass;

public class test {
     int id;
    public void setter(int id){
       this.id=id;
    }
    public int getter(){
        return this.id;
    }

    public static void main(String[] args) {
        test t=new test();
        t.setter(5);
        System.out.println(t.getter());
    }
}
