
/**
 * Created by jerry on 16-10-27.
 */
public class Student_Message {

    public String stu_Name;

    public long stu_Id;

    public int frist_attend_grade;

    public int second_attend_grade;

    public int third_attend_grade;

    public int first_test_grade;

    public int second_test_grade;

    public int third_test_grade;

    public int first_homework_grade;

    public int second_homework_grade;

    public int third_homework_grade;

    public int final_test_grade;

    public double final_grade;

    public String getStu_Name() {
        return stu_Name;
    }

    public void setStu_Name(String stu_Name) {
        this.stu_Name = stu_Name;
    }

    public long getStu_Id() {
        return stu_Id;
    }

    public void setStu_Id(long stu_Id) {
        this.stu_Id = stu_Id;
    }

    public int getFrist_attend_grade() {
        return frist_attend_grade;
    }

    public void setFrist_attend_grade(int frist_attend_grade) {
        this.frist_attend_grade = frist_attend_grade;
    }

    public int getSecond_attend_grade() {
        return second_attend_grade;
    }

    public void setSecond_attend_grade(int second_attend_grade) {
        this.second_attend_grade = second_attend_grade;
    }

    public int getThird_attend_grade() {
        return third_attend_grade;
    }

    public void setThird_attend_grade(int third_attend_grade) {
        this.third_attend_grade = third_attend_grade;
    }

    public int getFirst_test_grade() {
        return first_test_grade;
    }

    public void setFirst_test_grade(int first_test_grade) {
        this.first_test_grade = first_test_grade;
    }

    public int getSecond_test_grade() {
        return second_test_grade;
    }

    public void setSecond_test_grade(int second_test_grade) {
        this.second_test_grade = second_test_grade;
    }

    public int getThird_test_grade() {
        return third_test_grade;
    }

    public void setThird_test_grade(int third_test_grade) {
        this.third_test_grade = third_test_grade;
    }

    public int getFirst_homework_grade() {
        return first_homework_grade;
    }

    public void setFirst_homework_grade(int first_homework_grade) {
        this.first_homework_grade = first_homework_grade;
    }

    public int getSecond_homework_grade() {
        return second_homework_grade;
    }

    public void setSecond_homework_grade(int second_homework_grade) {
        this.second_homework_grade = second_homework_grade;
    }

    public int getThird_homework_grade() {
        return third_homework_grade;
    }

    public void setThird_homework_grade(int third_homework_grade) {
        this.third_homework_grade = third_homework_grade;
    }

    public int getFinal_test_grade() {
        return final_test_grade;
    }

    public void setFinal_test_grade(int final_test_grade) {
        this.final_test_grade = final_test_grade;
    }

    public double getFinal_grade() {
        return final_grade;
    }

    @Override
    public String toString() {
        return "Student_Message{" +
                "stu_Name='" + stu_Name + '\'' +
                ", stu_Id=" + stu_Id +
                ", frist_attend_grade=" + frist_attend_grade +
                ", second_attend_grade=" + second_attend_grade +
                ", third_attend_grade=" + third_attend_grade +
                ", first_test_grade=" + first_test_grade +
                ", second_test_grade=" + second_test_grade +
                ", third_test_grade=" + third_test_grade +
                ", first_homework_grade=" + first_homework_grade +
                ", second_homework_grade=" + second_homework_grade +
                ", third_homework_grade=" + third_homework_grade +
                ", final_test_grade=" + final_test_grade +
                ", final_grade=" + final_grade +
                '}';
    }

    public void setFinal_grade() {
        this.final_grade = this.getFrist_attend_grade()*0.01+(this.getSecond_attend_grade()+this.getThird_attend_grade())*0.02+
                (this.getFirst_test_grade()+this.getSecond_test_grade())*0.07+this.getThird_test_grade()*0.06+(this.getFirst_homework_grade()+
        this.getSecond_homework_grade())*0.08+this.getThird_homework_grade()*0.09+this.getFinal_test_grade()*0.5;
    }
}
