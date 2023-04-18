package Interface.Example;

public class Dell implements ComputerBrand{

    String brandName="Dell";
    double price=1200.50D;

    @Override
    public void pc_Price() {
        System.out.println("The brand is "+brandName+" And price is: "+price);
    }

}
