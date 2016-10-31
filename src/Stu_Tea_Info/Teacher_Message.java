package Stu_Tea_Info;

import java.io.Serializable;

/**
 * Created by jerry on 16-10-28.
 */
public class Teacher_Message implements Serializable {

    private String teacher_name;

    private String teacher_key;

    public Teacher_Message(String teacher_name, String teacher_key) {
        this.teacher_name = teacher_name;
        this.teacher_key = teacher_key;
    }

    public Teacher_Message(){

    }

    public String getTeacher_name() {
        return teacher_name;
    }

    public void setTeacher_name(String teacher_name) {
        this.teacher_name = teacher_name;
    }

    public String getTeacher_key() {
        return teacher_key;
    }

    public void setTeacher_key(String teacher_key) {
        this.teacher_key = teacher_key;
    }


}
