package com.liyi.design.pattern.create.prototype.deepcopy.userserialize;

public class TestDeepClone {
    public static void main(String[] args) {
        DeepCloneTarget deepCloneTarget = new DeepCloneTarget("李四",11);
        DeepClone deepClone = new DeepClone("张三", 12, deepCloneTarget);

        System.out.println(deepClone.hashCode() + " " + deepClone.getDeepCloneTarget().hashCode());

        DeepClone clone = deepClone.myClone();
        System.out.println(clone.hashCode() + " " + clone.getDeepCloneTarget().hashCode());

        clone = deepClone.myClone();
        System.out.println(clone.hashCode() + " " + clone.getDeepCloneTarget().hashCode());
    }
}
