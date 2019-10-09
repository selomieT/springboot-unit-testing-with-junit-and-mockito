package com.st.unittesting.Business;

import org.junit.Test;

import static org.junit.Assert.*;

public class SomeBusinessImplTest {
    @Test
    public void claculatedSum_basic(){
        SomeBusinessImpl business=new SomeBusinessImpl();
        int actualResult=business.calculate(new int[]{1,2,3});
        int expected=6;
        assertEquals(expected,actualResult);
    }

    @Test
    public void claculatedSum_empty(){
        SomeBusinessImpl business=new SomeBusinessImpl();
        int actualResult=business.calculate(new int[]{});
        int expected=0;
        assertEquals(expected,actualResult);
    }
    @Test
    public void claculatedSum_oneValue(){
        SomeBusinessImpl business=new SomeBusinessImpl();
        int actualResult=business.calculate(new int[]{5});
        int expected=5;
        assertEquals(expected,actualResult);
    }
}