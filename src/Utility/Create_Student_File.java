package Utility;

import Stu_Tea_Info.Student_Message;
import Stu_Tea_Info.Teacher_Message;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by jerry on 16-10-31.
 */
public class Create_Student_File {

    public File student_Information ;

    public Create_Student_File() throws FileNotFoundException {
        student_Information = new File("student_message.txt");
    }

    public void  createFile(){

        try {
            if(!student_Information.exists()){
                student_Information.createNewFile();
                Student_Message student_message1 = new Student_Message("Tom",001);
                student_message1.setFrist_attend_grade(100);
                student_message1.setSecond_attend_grade(100);
                student_message1.setThird_attend_grade(0);
                student_message1.setFirst_test_grade(80);
                student_message1.setSecond_test_grade(90);
                student_message1.setThird_test_grade(85);
                student_message1.setFirst_homework_grade(75);
                student_message1.setSecond_homework_grade(80);
                student_message1.setThird_homework_grade(85);
                student_message1.setFinal_test_grade(85);
                student_message1.setFinal_grade();
                Student_Message student_message2 = new Student_Message("Mary",002);
                student_message2.setFrist_attend_grade(100);
                student_message2.setSecond_attend_grade(100);
                student_message2.setThird_attend_grade(100);
                student_message2.setFirst_test_grade(90);
                student_message2.setSecond_test_grade(80);
                student_message2.setThird_test_grade(85);
                student_message2.setFirst_homework_grade(80);
                student_message2.setSecond_homework_grade(90);
                student_message2.setThird_homework_grade(95);
                student_message2.setFinal_test_grade(90);
                student_message2.setFinal_grade();
                ArrayList<Student_Message> arrayList = new ArrayList<>();
                arrayList.add(student_message1);
                arrayList.add(student_message2);
                try (
                        ObjectOutputStream output = new ObjectOutputStream
                                (new FileOutputStream(student_Information,true))
                ){
                    output.writeObject(arrayList);
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
