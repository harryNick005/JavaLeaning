package inheritance.UpcastingDownCasting;

public class Benz extends Car{


    public void horn(){
        System.out.println(brand+" BonBonBon");
    }

    public static void main(String[] args) {
        Benz benz=new Benz();
        benz.brand="Benz";

        // start car
        benz.ignition();

        // move forward
        benz.forward();

        // move back forward
        benz.reverse();

        // horn
        benz.horn();

        //brake
        benz.brake();

        //park

        benz.park();
    }
}
