package inheritance.UpcastingDownCasting;

public class BWM extends Car {

    public void horn(){
        System.out.println(brand+" DiDiDi");
    }
    public static void main(String[] args) {
        BWM bwm=new BWM();
        bwm.brand="BMW";

        // start car
        bwm.ignition();

        // move forward
        bwm.forward();

        // move back forward
        bwm.reverse();

        // horn
        bwm.horn();

        //brake
        bwm.brake();

        //park

        bwm.park();

    }

}
