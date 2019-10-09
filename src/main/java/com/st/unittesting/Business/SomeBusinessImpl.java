package com.st.unittesting.Business;

import com.st.unittesting.data.SomeDataService;

public class SomeBusinessImpl {
    private SomeDataService someDataService;


    public void setSomeDataService(SomeDataService someDataService) {
        this.someDataService = someDataService;
    }

    public int calculate (int [] data){
        int sum=0;
        for(int value:data){
            sum+=value;
        }
        return sum;
    }

    public int CalculateSumUsingDataService(){
        int sum=0;
        int[] data=someDataService.retriveAllData();
        for(int value:data){
            sum+=value;
        }
        return sum;
    }
}
