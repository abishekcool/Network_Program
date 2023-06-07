package com.formexample;
 import java.net.*;
class network{
public static void main (String[]args) throws UnknownHostException{
    InetAddress obj1=InetAddress.getByName("www.example.com");
    InetAddress obj2=InetAddress.getByName("example.com");
    boolean x=obj1.equals(obj2);
    System.out.println(x);


    }

}
