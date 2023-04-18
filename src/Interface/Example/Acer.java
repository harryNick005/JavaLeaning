package Interface.Example;

public class Acer implements ComputerBrand{
    String brandName="Acer";
    double price=1200.00D;

    @Override
    public void pc_Price() {
        System.out.println("The brand is "+brandName+" And price is: "+price);
    }
}
