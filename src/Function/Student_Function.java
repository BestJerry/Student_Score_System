package Function;

import Menu.Student_Menu;
import Menu.Teacher_Menu;
import Stu_Tea_Info.Student_Message;
import Utility.ReadAndWrite;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by jerry on 16-10-28.
 */
public class Student_Function {

    public void readScore(String name, long stu_Id) throws IOException, ClassNotFoundException {


        ArrayList<Student_Message> list = new ArrayList<>();
        ReadAndWrite readAndWrite = new ReadAndWrite();
        list = readAndWrite.readStudentFile(list);

        for(Student_Message student_message : list){
            if(student_message.getStu_Name().equals(name)&&student_message.getStu_Id()==stu_Id){
                System.out.println(student_message.toString());
            }
        }

        boolean flag = true;
        Scanner input = new Scanner(System.in);

        System.out.println("以上是你的所有成绩信息，若想返回上一级请输入\"back\"");
        while (flag) {
            String word = input.next();
            if (word.matches("back")) {
                Student_Menu.show(name,stu_Id);
                flag = false;
            } else {
                System.out.println("你的输入有误，请重新输入。");
            }
        }
    }

}
