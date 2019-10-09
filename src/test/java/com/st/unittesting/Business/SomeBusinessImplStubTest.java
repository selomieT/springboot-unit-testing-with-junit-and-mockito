package com.st.unittesting.Business;

import com.st.unittesting.data.SomeDataService;
import org.junit.Test;

import static org.junit.Assert.*;

class SomeDataServiceStub implements SomeDataService{

    @Override
    public int[] retriveAllData() {

        return new int[]{1,2,3};


    }
}
class SomeDataEmptyStub implements SomeDataService{

    @Override
    public int[] retriveAllData() {
        return new int[0];
    }
}
class SomeDataOneValueStub implements  SomeDataService{
    @Override
    public int[] retriveAllData(){
        return new int[]{5};
    }
}

public class SomeBusinessImplStubTest {

    @Test
    public void  calculateSumUsingDataService_basic(){
        SomeBusinessImpl someBusiness=new SomeBusinessImpl();
        someBusiness.setSomeDataService(new SomeDataServiceStub());
        int actual=someBusiness.CalculateSumUsingDataService();
        int expected=6;

    }
    @Test
    public void claculateSumUsingDataService_empty(){
        SomeBusinessImpl someBusiness=new SomeBusinessImpl();
        someBusiness.setSomeDataService(new SomeDataEmptyStub());
        int actual=someBusiness.CalculateSumUsingDataService();
        int expected=0;
        assertEquals(expected,actual);
    }
    @Test
    public void claculateSumUsingDataService_oneValue(){
        SomeBusinessImpl someBusiness=new SomeBusinessImpl();
        someBusiness.setSomeDataService(new SomeDataOneValueStub());
        int actual=someBusiness.CalculateSumUsingDataService();
        int expected=5;
        assertEquals(expected,actual);
    }
    //maintaing stub is difficult beacuse
    // 1 if we add additional method int interface all class which implements the interface has to overide the method
    //2 we have to create different class to get different result for each test
    //that is why we choose mockito

}