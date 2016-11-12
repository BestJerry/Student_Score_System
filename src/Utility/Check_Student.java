package Utility;

import Stu_Tea_Info.Student_Message;
import Stu_Tea_Info.Teacher_Message;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 * Created by jerry on 16-10-31.
 */
public class Check_Student {


    public static boolean check_student(String name, long stu_Id) throws IOException, ClassNotFoundException {
        ArrayList<Student_Message> list = new ArrayList<>();
        ReadAndWrite readAndWrite = new ReadAndWrite();
        list = readAndWrite.readStudentFile(list);

        for(Student_Message student_message : list){
            if(student_message.getStu_Name().equals(name)&&student_message.getStu_Id()==stu_Id){
                return true;
            }
        }
        return  false;
    }
}
