package com.company;

import java.util.ArrayList;

public class MyImmutableArray {
    private final ArrayList<Integer> immutableArray;

    public MyImmutableArray(ArrayList<Integer> immutableArray) {
        int i;
        this.immutableArray = new ArrayList<>();
        for(i = 0; i < immutableArray.size(); i++){
            this.immutableArray.add(immutableArray.get(i));
        }
    }

    public ArrayList<Integer> getArray(){

        MyImmutableArray copyObj = new MyImmutableArray(this.immutableArray);
        return copyObj.immutableArray;
    }

}
