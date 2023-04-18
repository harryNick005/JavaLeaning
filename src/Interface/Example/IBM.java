package Interface.Example;

public class IBM implements ComputerBrand{
    String brandName="IBM";
    double price=1180.99D;


    @Override
    public void pc_Price() {
        System.out.println("The brand is "+brandName+" And price is: "+price);
    }
}
