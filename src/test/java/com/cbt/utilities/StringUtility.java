package com.cbt.utilities;

public class StringUtility {


    public static void verifyEquals (String expected, String actual){
        if (actual.equals(expected)) {
            System.out.println("PASS...");
        } else {
            System.out.println("FAIL! Expected result is : " + expected + " Actual result is : " + actual);
        }
    }

    public static String  titleWithoutSpace(String title){
        String noSpaceTitle="";
        for (int i = 0; i < title.length()-1; i++) {
            if (!title.substring(i,i+1).equals(" ")){
                noSpaceTitle=noSpaceTitle+title.substring(i,i+1);
            }
        }
        return noSpaceTitle;
    }
}
