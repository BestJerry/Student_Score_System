import Login.Login_Function;
import Utility.Create_Student_File;
import Utility.Create_Teacher_File;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;


/**
 * Created by jerry on 16-10-27.
 */
public class Main {

    public static void  main(String[] args) throws IOException, ClassNotFoundException {

        Create_Teacher_File create_teacher_file = new Create_Teacher_File();
        create_teacher_file.createFile();

        Create_Student_File create_student_file = new Create_Student_File();
        create_student_file.createFile();

        Scanner input = new Scanner(System.in);
        System.out.println("学生成绩管理系统\n");
        System.out.println("1.教师登陆\n");
        System.out.println("2.学生登陆\n");
        System.out.println("3.退出系统\n");
        System.out.println("请输入对应功能的标号，按回车键结束：");
        boolean flag = true;
        while(flag){
            String choice = input.next();


            switch (choice.charAt(0)){
                case '1':
                    try {
                        Login_Function.teacherlogin();
                    } catch (IOException e) {
                        e.printStackTrace();
                    } catch (ClassNotFoundException e) {
                        e.printStackTrace();
                    }
                    flag = false;
                    break;
                case '2':
                    Login_Function.studentlogin();
                    flag = false;
                    break;
                case '3':
                    System.exit(0);
                default:
                    System.out.println("您的输入有误，请重新输入。");

            }
        }

    }


}
