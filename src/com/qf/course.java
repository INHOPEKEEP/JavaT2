package com.qf;


import java.util.Scanner;

public class course {



    public course(){}

    int bh,ch,dh;

    String Crn[]={"English","Chinese","Math"};

    int address;

    String time;

    String Name;

    Scanner sc =new Scanner(System.in);

    Scanner ss =new Scanner(System.in);

    public void caozuo(){

        System.out.println("请选择你的操作：(1-选课，2-退课)");

        ch=ss.nextInt();

        if(ch==1){
            System.out.println("请选择课程：(编号为1-3)");

            bh=sc.nextInt();

            if(bh==1){
                address=301;time="7:00";
                System.out.println("你选的课程为:"+Crn[0]+", 课程编号:"+bh+", 教室："+address+", 时间："+time);
            }else if(bh==2){
                address=302;time="8:00";
                System.out.println("你选的课程为:"+Crn[1]+", 课程编号:"+bh+", 教室："+address+", 时间："+time);
            }else if(bh==3){
                address=303;time="9:00";
                System.out.println("你选的课程为:"+Crn[2]+", 课程编号:"+bh+", 教室："+address+", 时间："+time);
            }else{
                System.out.println("输入错误！");
            }

        }else{
            System.out.println("请选择退课课程：(编号为1-3)");

            dh=sc.nextInt();

            if(dh==1){

                System.out.println("你要退的课程为:"+Crn[0]);
            }else if(dh==2){

                System.out.println("你要退的课程为:"+Crn[1]);
            }else if(dh==3){

                System.out.println("你要退的课程为:"+Crn[2]);
            }else{
                System.out.println("输入错误！");
            }
        }

        }

    }



