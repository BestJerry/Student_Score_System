package Stu_Tea_Info;

/**
 * Created by jerry on 16-10-28.
 */
public class Teacher_Message {

    public String teacher_name;

    public int teacher_key;

    public Teacher_Message(String teacher_name, int teacher_key) {
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

    public int getTeacher_key() {
        return teacher_key;
    }

    public void setTeacher_key(int teacher_key) {
        this.teacher_key = teacher_key;
    }
}
