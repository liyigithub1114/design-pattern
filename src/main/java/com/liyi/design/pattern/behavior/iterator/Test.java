package com.liyi.design.pattern.behavior.iterator;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        ComputerConcrete computerConcrete = new ComputerConcrete();
        InfoConcrete infoConcrete = new InfoConcrete();
        List<College> collegeList = new ArrayList<>();
        collegeList.add(computerConcrete);
        collegeList.add(infoConcrete);

        CollegePrint print = new CollegePrint();
        print.print(collegeList);
    }
}
