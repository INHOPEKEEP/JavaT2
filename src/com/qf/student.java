package com.qf;

public class student extends person{

    String xke;

    public student(int Num, String Sex, String Name) {
        super(Num, Sex, Name);
        // TODO Auto-generated constructor stub


    }

    public void showx(){
        System.out.println("学生姓名:"+Name+", 性别:"+Sex+", 编号:"+Num);
    }


}
