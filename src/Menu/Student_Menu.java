package Menu;

import Function.Student_Function;
import Stu_Tea_Info.Student_Message;

import java.io.IOException;
import java.io.Serializable;
import java.util.Scanner;


/**
 * Created by jerry on 16-10-28.
 */
public class Student_Menu extends Student_Message {

    public Student_Menu() {
    }

    public static void show(String name ,long stu_Id) throws IOException, ClassNotFoundException {

        Student_Function student_function = new Student_Function();
        System.out.println("1.查询成绩");
        System.out.println("2.退出系统");
        System.out.println("请输入对应功能的标号，按回车键结束：");
        Scanner input = new Scanner(System.in);
        String choice = input.next();
        boolean flag = true;
        while (flag) {
            switch (choice.charAt(0)) {
                case '1':
                    student_function.readScore(name,stu_Id);
                    flag = false;
                    break;
                case '2':
                    System.exit(0);
                default:
                    System.out.println("你的输入有误，请重新输入：");
            }
        }
    }
}
