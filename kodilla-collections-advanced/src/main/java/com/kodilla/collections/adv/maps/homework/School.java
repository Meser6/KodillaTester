package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School  {

    public String schoolName;
    int classesOne;
    int classesTwo;
    int classesThree;

    public School(String schoolName, int classesOne, int classesTwo, int classesThree) {
        this.schoolName = schoolName;
        this.classesOne = classesOne;
        this.classesTwo = classesTwo;
        this.classesThree = classesThree;

    }


    @Override
    public String toString() {
        return "school " + schoolName;
    }

    public int getSum(){
        return classesOne + classesTwo + classesThree;
    }

}
