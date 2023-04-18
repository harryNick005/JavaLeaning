package Interface.Example;

public class AlienWare implements ComputerBrand{
    String brandName="AlienWare";
    double price=1400.99D;

    @Override
    public void pc_Price() {
        System.out.println("The brand is "+brandName+" And price is: "+price);
    }
}
