package com.qf;

import java.util.Scanner;

public class test {


    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String name;

        System.out.println("请输入姓名:");

        Scanner sca = new Scanner(System.in);

        name=sca.next();

        course c1 =new course();

        student s1= new student(1, "男", name);

        teacher t1 = new teacher(2, "女", "Mi");



        //s1.showx();
        //t1.shows();


        c1.caozuo();
        System.out.println("授课教师:"+t1.Name+"，性别："+t1.Sex);
        System.out.println(s1.Name+"同学以上为你的选课/选课信息。");
    }

}
