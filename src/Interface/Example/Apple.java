package Interface.Example;

public class Apple implements ComputerBrand {
    String brandName="Apple";
    double price=1400.50D;

    @Override
    public void pc_Price() {
        System.out.println("The brand is "+brandName+" And price is: "+price);
    }
}
