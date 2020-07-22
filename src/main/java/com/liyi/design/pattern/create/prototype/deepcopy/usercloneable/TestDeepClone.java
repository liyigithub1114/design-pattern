package com.liyi.design.pattern.create.prototype.deepcopy.usercloneable;

public class TestDeepClone {
    //这种方法需要对每个成员对象进行clone操作，比较麻烦， 推荐序列化
    public static void main(String[] args) throws CloneNotSupportedException {
        DeepCloneTarget deepCloneTarget = new DeepCloneTarget("李四", 11);
        DeepClone deepClone = new DeepClone("张三", "11@11.com", 11, deepCloneTarget);

        System.out.println(deepClone.hashCode() + " " +  deepClone.getDeepCloneTarget().hashCode());

        DeepClone clone = (DeepClone) deepClone.clone();
        System.out.println(clone.hashCode() + " " + clone.getDeepCloneTarget().hashCode());
    }
}
