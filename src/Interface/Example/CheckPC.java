package Interface.Example;

import Timmer.Time;

import java.lang.annotation.Inherited;

public class CheckPC {
    public static ComputerBrand pc;
    public static <T extends ComputerBrand> void printInfo(T pcType){
        pc=  pcType;
        pc.pc_Price();
    }

//    public static void printInfo(ComputerBrand brand){
//        pc=brand;
//        pc.pc_Price();
//    }



//    public  static <T extends ComputerBrand> T  printInfo( T pcType){
//
//        return (T) (pc= pcType);
//    }
    public static void main(String[] args) {



      CheckPC.printInfo(new Apple());

//      CheckPC.printInfo(new AlienWare());
//      CheckPC.printInfo(new IBM());
//      CheckPC.printInfo(new Acer());















//        // checkDell
//        Dell dell=new Dell();
//        dell.pc_Price();
//
//        // check Apple
//        Apple apple=new Apple();
//        apple.pc_Price();
//
//        // checkIBM
//        IBM ibm=new IBM();
//        ibm.pc_Price();
//
//        // check Acer
//        Acer acer=new Acer();
//        acer.pc_Price();
//
//        // check AlienWare
//        AlienWare alienWare=new AlienWare();
//        alienWare.pc_Price();


    }
}
