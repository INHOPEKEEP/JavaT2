package com.qf;

public class teacher extends person{
    String ske;

    public teacher(int Num, String Sex, String Name) {
        super(Num, Sex, Name);
        // TODO Auto-generated constructor stub


    }

    public teacher(){}

    public void shows(){

        System.out.println("教师姓名:"+Name+", 性别:"+Sex+", 编号:"+Num);
    }

}
