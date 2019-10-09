package com.st.unittesting.Business;

import com.st.unittesting.data.SomeDataService;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class SomeBusinessImplMockTest {
    SomeBusinessImpl someBusiness=new SomeBusinessImpl();
    SomeDataService dataServiceMock=mock(SomeDataService.class);

    @Before
    public void before(){
        someBusiness.setSomeDataService(dataServiceMock);
    }
    @Test
    public void ClaculateSumUsingDataService_basic(){

        when(dataServiceMock.retriveAllData()).thenReturn(new int[]{1,2,3});

        int actual=someBusiness.CalculateSumUsingDataService();
        int expected=6;
        assertEquals(expected,actual);
    }
    @Test
    public void calculateSumUsingDataService_Empty(){

        when(dataServiceMock.retriveAllData()).thenReturn(new int[0]);

        int actual= someBusiness.CalculateSumUsingDataService();
        int expected=0;
        assertEquals(expected,actual);
    }
    @Test
    public void calculateSumUsingDataService_oneValue(){

        when(dataServiceMock.retriveAllData()).thenReturn(new int[]{5});

        int actual= someBusiness.CalculateSumUsingDataService();
        int expected=5;
        assertEquals(expected,actual);
    }

}