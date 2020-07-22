package com.liyi.design.pattern.structure.component;


public class Test {
    public static void main(String[] args) {
        UniversityComponent universityComponent = new UniversityComponent("软件工程", "清华大学");

        CollegeComponent collegeComponent = new CollegeComponent("软件工程专业", "软件工程");
        CollegeComponent collegeComponent1 = new CollegeComponent("小语种专业", "小语种");

        DepartmentComponent departmentComponent = new DepartmentComponent("专业1","信息工程");
        DepartmentComponent departmentComponent1 = new DepartmentComponent("专业2","通信工程");
        DepartmentComponent departmentComponent2 = new DepartmentComponent("专业3","信息安全");

        DepartmentComponent departmentComponent3 = new DepartmentComponent("英语专业1","英语");
        DepartmentComponent departmentComponent4 = new DepartmentComponent("日语专业2","日语");
        DepartmentComponent departmentComponent5 = new DepartmentComponent("中文专业3","中文");

        universityComponent.add(collegeComponent);
        universityComponent.add(collegeComponent1);

        collegeComponent.add(departmentComponent);
        collegeComponent.add(departmentComponent1);
        collegeComponent.add(departmentComponent2);

        collegeComponent1.add(departmentComponent3);
        collegeComponent1.add(departmentComponent4);
        collegeComponent1.add(departmentComponent5);

        universityComponent.print();
    }
}
