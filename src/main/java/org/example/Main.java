package org.example;

public class Main {
    public static void main(String[] args) {
        Acura myNSX = new Acura(2023, "NSX");
//        System.out.println(myNSX.getMake());
//        System.out.println(myNSX.getModel());
//        myNSX.startEngine();
        Rivian r1s = new Rivian(2024, "R1S");
        System.out.println(r1s.getCharge() + " is initial charge.");
        System.out.println(r1s.drive(30) + " is charge after 30 min of driving.");
        System.out.println(r1s.charge(10) + " is charge after 10 min of charging.");
    }
}
