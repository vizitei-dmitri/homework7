package com.computer;

public class pcBox {
    public static void main(String[] args) {
        hardDisc disc = new hardDisc();
        disc.print();
        disc.insert();

        motherboard mb = new motherboard();
        mb.print();
        mb.insert();


        videocard vc = new videocard();
        vc.print();
        vc.insert();
    }
}
