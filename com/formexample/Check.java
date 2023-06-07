package com.formexample;

import java.net.*;
public class Check{
    public static void main(String[] args) {
        try {
            InetAddress obj1 = InetAddress.getByName("www.example.com");
            InetAddress obj2 = InetAddress.getByName("http://example.com");
            if (obj1.equals(obj2)) { /*use boolean*/
                System.out.println("Both are Same");
            } else {
                System.out.println("Both are not Same");
            }
        }catch(UnknownHostException ex){
                    System.out.println("Host Lookup Failed");
                }
            }

    }