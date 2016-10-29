package Utility;

import Menu.Teacher_Menu;
import Stu_Tea_Info.Teacher_Message;

import java.io.*;

/**
 * Created by jerry on 16-10-29.
 */
public class Creat_Teacher_File implements Serializable{

    public File teacher_Information ;

    public Creat_Teacher_File() throws FileNotFoundException {
        teacher_Information = new File("teacher_message.txt");
    }

    public void  creatFile(){

        try {
            if(!teacher_Information.exists()){
               teacher_Information.createNewFile();
                Teacher_Message teacher_message = new Teacher_Message("Jerry","123456");
                try (
                        ObjectOutputStream output = new ObjectOutputStream
                                (new FileOutputStream(teacher_Information))
                        ){
                        output.writeObject(teacher_message);
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
