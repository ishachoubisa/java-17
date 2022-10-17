package com.learn.BuildingBlocks;

public class StringPrint {
    public static void main(String[] args) {
        System.out.println(" \" ");
        System.out.println("""
                \""" """);
        System.out.println(" \"\"\" ");
        System.out.println("""
                \"\"\" """);
        System.out.println("isha\s");
        System.out.println("""
               isha\s""");
        //System.out.println("isha\");
       // System.out.println("""
          //      isha\""");

        String block = """
                doe \
                deer """;
        System.out.println(block);
        String block1 = """
                doe \n
                deer 
                """;
        System.out.println(block1);
        String block2 = """
                "doe\"\"\"
                \"deer\"""
                 """;
        System.out.println("*"+ block2  + "*");
    }
}
