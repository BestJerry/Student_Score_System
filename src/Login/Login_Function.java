package Login;


import Menu.Student_Menu;
import Menu.Teacher_Menu;

import java.util.Scanner;

import Stu_Tea_Info.*;


/**
 * Created by jerry on 16-10-28.
 */
public class Login_Function  {

    public static void teacherlogin(){

        Scanner input = new Scanner(System.in);
        System.out.println("欢迎教师登陆");
        System.out.println("请输入您的名字：");
        String name = input.next();
        System.out.println("请输入您的密码：");
        String key = input.next();

        Teacher_Menu.show();

    }


    public  static  void studentlogin(){

        Scanner input = new Scanner(System.in);
        System.out.println("欢迎学生登陆");
        System.out.println("请输入你的姓名：");
        String name = input.next();
        System.out.println("请输入你的学号：");
        long stu_Id = input.nextLong();
        Student_Message student_message = new Student_Message(name,stu_Id);
        Student_Menu student_menu = new Student_Menu();
        student_menu.show(student_message);
    }
}
