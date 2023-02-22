package inheritance.UpcastingDownCasting;

public class Car {
    String brand="";


    public void ignition(){
        System.out.println(brand+" Engine started");
    }

    public void forward(){
        System.out.println(brand+" car is moving forward");
    }

    public void reverse(){
        System.out.println(brand+" car is going backward");
    }

    public void horn(){
        System.out.println(brand+" Bebebe");
    }
    public void brake(){
        System.out.println(brand+" car stops");
    }

    public void park(){
        System.out.println(brand+" car is parked");
    }
}
