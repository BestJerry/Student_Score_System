package Menu;

import Stu_Tea_Info.Student_Message;

import java.util.Scanner;


/**
 * Created by jerry on 16-10-28.
 */
public class Student_Menu extends Student_Message{

    public void show(Student_Message student_message){

        System.out.println("1.查询成绩");
        System.out.println("2.退出系统");
        System.out.println("请输入对应功能的标号：");
        Scanner input = new Scanner(System.in);
        String choice = input.next();
        boolean flag = true;
        while (flag){
            switch (choice.charAt(0)){
                case '1':
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
