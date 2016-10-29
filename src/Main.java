import Login.Login_Function;
import Utility.Creat_Teacher_File;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;
import java.util.Scanner;


/**
 * Created by jerry on 16-10-27.
 */
public class Main implements Serializable{

    public static void  main(String[] args) throws FileNotFoundException {

        Creat_Teacher_File creat_teacher_file = new Creat_Teacher_File();
        creat_teacher_file.creatFile();

        Scanner input = new Scanner(System.in);
        System.out.println("学生成绩管理系统\n");
        System.out.println("1.教师登陆\n");
        System.out.println("2.学生登陆\n");
        System.out.println("3.退出系统");

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
