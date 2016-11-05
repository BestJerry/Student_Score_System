package Menu;

import Function.Teacher_Function;
import com.sun.javafx.css.parser.Css2Bin;
import com.sun.org.apache.xpath.internal.WhitespaceStrippingElementMatcher;

import java.io.IOException;
import java.io.Serializable;
import java.util.Scanner;

/**
 * Created by jerry on 16-10-28.
 */
public class Teacher_Menu extends Teacher_Function {

    public Teacher_Menu() {
    }

    public static void show() throws IOException, ClassNotFoundException {

        Scanner input = new Scanner(System.in);
        System.out.println("1.添加学生成绩");
        System.out.println("2.删除学生成绩");
        System.out.println("3.修改学生成绩");
        System.out.println("4.查看学生成绩");
        System.out.println("5.统计学生成绩");
        System.out.println("6.退出系统");
        System.out.println("请输入对应功能的标号，按回车键结束：");

        Teacher_Function teacher_function = new Teacher_Function();
        boolean flag = true;


        while (flag) {
            String choice = input.next();
            switch (choice.charAt(0)) {
                case '1':
                    teacher_function.addStudentScore();
                    flag = false;
                    break;
                case '2':
                    teacher_function.deleteStudentScore();
                    flag = false;
                    break;
                case '3':
                    teacher_function.editStudentScore();
                    flag = false;
                    break;
                case '4':
                    teacher_function.readStudentScore();
                    flag = false;
                    break;
                case '5':
                    teacher_function.countStudentScore();
                    flag = false;
                    break;
                case '6':
                    System.exit(0);
                default:
                    System.out.println("您的输入有误，请重新输入：");
            }
        }
    }
}
