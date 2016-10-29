package Login;


import Menu.Student_Menu;
import Menu.Teacher_Menu;

import java.io.IOException;
import java.io.Serializable;
import java.util.Scanner;

import Stu_Tea_Info.*;
import Utility.Check_Teacher;
import com.sun.xml.internal.ws.runtime.config.TubelineFeatureReader;


/**
 * Created by jerry on 16-10-28.
 */
public class Login_Function implements Serializable {

    public static void teacherlogin() throws IOException, ClassNotFoundException {

        Scanner input = new Scanner(System.in);
        System.out.println("欢迎教师登陆");


        boolean flag = true;
        while (flag) {
            System.out.println("请输入您的名字，按回车键结束：");
            String name = input.next();
            System.out.println("请输入您的密码，按回车键结束：");
            String key = input.next();
            if (Check_Teacher.check_teacher(name, key)) {
                flag = false;
                Teacher_Menu.show();
            } else {
                System.out.println("您的名字或密码输入有误，请重新输入。");
            }
        }

    }


    public static void studentlogin() {

        Scanner input = new Scanner(System.in);
        System.out.println("欢迎学生登陆");
        System.out.println("请输入你的姓名：");
        String name = input.next();
        System.out.println("请输入你的学号：");
        long stu_Id = input.nextLong();
        Student_Message student_message = new Student_Message(name, stu_Id);
        Student_Menu student_menu = new Student_Menu();
        student_menu.show(student_message);
    }
}
