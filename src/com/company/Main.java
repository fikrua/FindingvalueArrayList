package com.company;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> randValue = new ArrayList<Integer>();
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        int value=0;

        for(int i =0; i<20; i++){
            int t=rand.nextInt(50);
            randValue.add(t);
        }
        System.out.println("ArrayList: "+randValue);

	System.out.print("value to find: ");
	int findValue = scan.nextInt();
	for (int i = 0; i<randValue.size();i++) {
        if (randValue.get(i) == findValue) {
            value++;
            System.out.printf("%d is in array list ", findValue);
        }
        //  System.out.println();

        //else
            //System.out.printf("%d is not in array list ", findValue);
    }
//    if(value>0)
//        System.out.printf("%d is in array list ", findValue);

    }
}
