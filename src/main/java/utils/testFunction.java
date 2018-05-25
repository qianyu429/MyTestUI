package utils;

import org.testng.annotations.Test;

/**
 * Created by mac on 2018/4/12.
 */
public class testFunction {
    public void func(int a,int b,int c){
        a=456;
        b=567;
        c=678;
    }

    @Test
    public void testResult(){
        int a=10;
        int b=20;
        int c=30;
        func(a,b,c);
        System.out.println("abc的值分别为:"+ a + b + c);
    }
}
