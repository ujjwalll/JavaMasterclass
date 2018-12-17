package com.company;

public class Main {

    public static void main(String[] args) {
        // Int has a width of 32
	    int maxvalue = 2_147_483;
	    int mytotal = (maxvalue/2);
	    System.out.println(mytotal);

	    // byte has a width of 8
	    byte Mybytevalue = -128;
	    byte Mybytevalue1 = (byte) (Mybytevalue/2);
	    System.out.println(Mybytevalue1);


	    // Short has a width of 16
	    short Myshortvalue = 1;

	    // long has a width of 64
        long Mylongnumber;
        Mylongnumber = (long) (maxvalue+(10*Mybytevalue)+Myshortvalue+50000);
        System.out.println(Mylongnumber);


    }
}
