package Function;

import Menu.Teacher_Menu;
import Stu_Tea_Info.Student_Message;
import Stu_Tea_Info.Teacher_Message;
import com.sun.xml.internal.ws.runtime.config.TubelineFeatureReader;
import jdk.nashorn.internal.ir.Flags;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by jerry on 16-10-28.
 */
public class Teacher_Function extends Student_Message{


    public void addStudentScore() throws IOException, ClassNotFoundException {
        try (
                ObjectOutputStream outputStream = new ObjectOutputStream
                        (new FileOutputStream("student_message.txt",true));
                )
        {
            Scanner input = new Scanner(System.in);
            Student_Message student_message = new Student_Message();
            System.out.println("请输入您要添加的学生姓名：");
            String name = input.next();
            student_message.setStu_Name(name);
            System.out.println("请输入您要添加的学生学号：");
            long stu_Id = input.nextLong();
            student_message.setStu_Id(stu_Id);
            System.out.println("请按照提示输入各项成绩：");
            System.out.print("第一次课堂点名：");
            int score1 = input.nextInt();
            student_message.setFrist_attend_grade(score1);
            System.out.print("第二次课堂点名：");
            int score2 = input.nextInt();
            student_message.setSecond_attend_grade(score2);
            System.out.print("第三次课堂点名：");
            int score3 = input.nextInt();
            student_message.setThird_attend_grade(score3);
            System.out.print("第一次课堂小测：");
            int score4 = input.nextInt();
            student_message.setFirst_test_grade(score4);
            System.out.print("第二次课堂小测：");
            int score5 = input.nextInt();
            student_message.setSecond_test_grade(score5);
            System.out.print("第三次课堂小测：");
            int score6 = input.nextInt();
            student_message.setThird_test_grade(score6);
            System.out.print("第一次课后作业：");
            int score7 = input.nextInt();
            student_message.setFirst_homework_grade(score7);
            System.out.print("第二次课后作业：");
            int score8 = input.nextInt();
            student_message.setSecond_homework_grade(score8);
            System.out.print("第三次课后作业：");
            int score9 = input.nextInt();
            student_message.setThird_homework_grade(score9);
            System.out.print("期末测试：");
            int score10 = input.nextInt();
            student_message.setFinal_test_grade(score10);
            student_message.setFinal_grade();
            /*ArrayList<Student_Message> arrayList = new ArrayList<>();
            arrayList.add(student_message);*/
            System.out.println(student_message.toString());
            outputStream.writeObject(student_message);

        }
        Scanner input = new Scanner(System.in);
        System.out.println("成绩录入成功！若想返回上一级请输入“back”");
        boolean flag = true;

        while(flag){
            String word = input.next();
            if(word.matches("back")){
                Teacher_Menu.show();
                flag = false;
            }
            else
            {
                System.out.println("您的输入有误，请重新输入。");
            }
        }
    }


    public void readStudentScore() throws IOException, ClassNotFoundException {

        try (
                ObjectInputStream inputStream = new ObjectInputStream
                        (new FileInputStream("student_message.txt"));
                )
        {

            ArrayList<Student_Message> list = (ArrayList<Student_Message>) inputStream.readObject();
            for(Student_Message student_message : list){
                System.out.println(student_message.toString());
            }
        }

        boolean flag = true;
        Scanner input = new Scanner(System.in);

        System.out.println("以上是所有学生的成绩信息，若想返回上一级请输入“back”");
        while(flag){
          String word = input.next();
            if(word.matches("back")){
                Teacher_Menu.show();
                flag = false;
            }
            else
            {
                System.out.println("您的输入有误，请重新输入。");
            }
        }

    }
}
