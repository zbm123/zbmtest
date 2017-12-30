package com.cn;

public class ABs extends Base{
    public static void main(String argv[]){
        ABs a = new ABs();
        a.amethod();
    }

    public void myfunc(){
        System.out.println("My func");
    }   
    public void amethod(){
        myfunc();
    }
}

