package com.coderbd.methodsBasic;

public class MethodEx {

    String abc;
    static String msg = "Hello programmers";

    //Main Method
    public static void main(String[] args) {
        
        MethodEx.display7();
        MethodEx obj = new MethodEx();
        obj.display8();
        obj.display7();
        obj.display();
    }
//////////////////////////Methods//////////////
    // 1. access modifer like public/ protected/private/default
    //If empty, then it is default

    /*2. data type like primitive(bye, short, int, float, long, 
    double, char, boolean) type,
    or class type(String or any class name) or void
    If type is void, then method will not return anything*/
 /*
    Synatx of Method
    <access Modifer>+<Non-access Modifer is optional>+<Data Type>+Method Name>
    +(parameter is optional)+{Body is optional, 
    BUT most cases Body thakbe}
     */
    //Method 1
    public void display() {
        System.out.println("Hi I am from void Method");
    }
    //Method 2, Data type is int. so we must need return keyword and value

    public int display2() {
        int x = 10;
        return x;
    }

    //Method 3
    public String display3() {
        return "Hello World";
    }

    //Method 4
    public String display4() {
        String str = "Hello World";
        return str;
    }

    //Method 5
    public String display5() {
        abc = "Hello ABC";
        return abc;
    }

    //Method 6
    public String display6() {
        return msg;
    }
    //Method 7

    public static String display7() {
        return msg;
    }
    //Method 8

    public final String display8() {
        return msg;
    }
    //Method 9

    public float display9() {
        return 50;
    }
}
