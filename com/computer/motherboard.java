package com.computer;

import java.util.Scanner;

public class motherboard extends systemm{
    static int a = 2;
    void print(){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();

        switch(a){
            case 1:
                System.out.println('1');
                break;
            case 2:
                System.out.println("2");
                break;
        }
    }
    void insert(){
        System.out.println("a = "+a);
    }


}
