package Utility;

import Stu_Tea_Info.Student_Message;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 * Created by jerry on 16-10-28.
 */
public class ReadAndWrite {
    public ArrayList readStudentFile(ArrayList<Student_Message> list) throws IOException, ClassNotFoundException {

        try (
                ObjectInputStream inputStream = new ObjectInputStream
                        (new FileInputStream("student_message.txt"));
        ) {

            list = (ArrayList<Student_Message>) inputStream.readObject();

        }
        return list;
    }

}
