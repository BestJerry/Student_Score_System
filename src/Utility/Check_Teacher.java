package Utility;

import Stu_Tea_Info.Teacher_Message;

import java.io.*;

/**
 * Created by jerry on 16-10-29.
 */
public class Check_Teacher implements Serializable{

    public static boolean check_teacher(String name, String key) throws IOException, ClassNotFoundException {
        try(
                ObjectInputStream input = new ObjectInputStream(new FileInputStream("teacher_message.txt"));
        ){
            Teacher_Message teacher_message = (Teacher_Message)( input.readObject());
            if(name.equals(teacher_message.getTeacher_name())&&key.equals(teacher_message.getTeacher_key())){
                return  true;
            }
            else
                return  false;
        }
    }
}
