package com.liyi.design.pattern.behavior.visitor;

public class Test {
    public static void main(String[] args) {
        ObjectStructure objectStructure = new ObjectStructure();
        Man man  = new Man();
        objectStructure.add(man);


        Woman woman = new Woman();
        objectStructure.add(woman);

        Comment success = new Success();
        objectStructure.display(success);

        Comment fail = new Fail();
        objectStructure.display(fail);
    }
}
