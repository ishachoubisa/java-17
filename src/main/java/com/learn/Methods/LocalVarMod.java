package com.learn.Methods;

public class LocalVarMod {
    public void ZooAnimalCheckup(boolean isWeekend){
        final int rest;//with this rest variable,we don't need to assign a value when a final variable is declared
        if(isWeekend) rest=5;//the rule is only that it must be assigned a value before it can be used
        else rest=20;//if comment else statement it will produce error does not compile because when isWeekend is false rest will
                     //not have value and local variable must assign some value before use.
        System.out.println(rest);

        final var girrafe = new LocalVarMod();//we can use var and final together
        final int[] friends = new int[5];

//        rest = 10;//DOES NOT COMPILE.Final variable can not change value.
//        girrafe = new LocalVarMod();//DOES NOT COMPILE
//        friends = null;//DOES NOT COMPILE

        //using final modifier we can modify data.The final attribute only refer to variable reference,the content can be freely
        //modified(assuming object is immutable).
        //rest = 12;//The rest variable is primitive,so it's just a value that can't be modified.
        //girrafe.setName("george");//we need setter getter method
        friends[2] = 2;//the contents of giraffe and friends variables can be freely modified,provided the variables aren't
                       //reassigned.
    }
}
