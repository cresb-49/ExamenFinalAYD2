package com.carlos;

import com.carlos.original.FinalExample;

public class Main {
    public static void main(String[] args) {
        String input = "jfhskdfhsdk,kfsdkjfhsd,hfsdkjf";
        FinalExample FinalExample = new FinalExample();
        FinalExample.processData(input);


        double result = FinalExample.calculateArea("circle", 1);
        System.out.println(result);

        double result2 = FinalExample.calculateArea("rectangle", 2,2);
        System.out.println(result2);

    }
}