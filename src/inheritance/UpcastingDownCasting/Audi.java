package inheritance.UpcastingDownCasting;

public class Audi extends Car{

@Override
    public void horn(){
        System.out.println(brand+" BiBiBi");
    }

    public void matrixBeam(String onAndOff){
        System.out.println("Audi Beam is "+onAndOff);
    }

    public static void main(String[] args) {
        Car audi=new Audi();  // Up-casting
        Audi audi_Down=(Audi)audi; //Down-casting


        audi.brand="audi";

        // start car
        audi.ignition();

        // move forward
        audi.forward();

        // move back forward
        audi.reverse();

        // horn
       audi.horn();
       audi_Down.horn();

        //brake
        audi.brake();

        //park
        audi.park();

        //matrix Beam
        audi_Down.matrixBeam("on");


    }
}
