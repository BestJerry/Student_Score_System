package Stu_Tea_Info;

import java.io.Serializable;

/**
 * Created by jerry on 16-10-27.
 */
public class Student_Message implements Serializable {

    private String stu_Name;

    private long stu_Id;

    private int first_attend_grade;

    private int second_attend_grade;

    private int third_attend_grade;

    private int first_test_grade;

    private int second_test_grade;

    private int third_test_grade;

    private int first_homework_grade;

    private int second_homework_grade;

    private int third_homework_grade;

    private int final_test_grade;

    private double final_grade;

    public Student_Message(long stu_Id) {
        this.stu_Id = stu_Id;
    }

    public String getStu_Name() {
        return stu_Name;
    }

    public Student_Message() {
    }

    public Student_Message(String stu_Name, long stu_Id) {
        this.stu_Name = stu_Name;
        this.stu_Id = stu_Id;
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
        return first_attend_grade;
    }

    public void setFrist_attend_grade(int frist_attend_grade) {
        this.first_attend_grade = frist_attend_grade;
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
        return
                "学生姓名：" + stu_Name + " " +
                        "学号：" + stu_Id + "\n" +
                        "第一次课堂点名：" + first_attend_grade + " " +
                        "第二次课堂点名：" + second_attend_grade + " " +
                        "第三次课堂点名：" + third_attend_grade + "\n" +
                        "第一次课堂测试：" + first_test_grade + " " +
                        "第二次课堂测试：" + second_test_grade + " " +
                        "第三次课堂测试：" + third_test_grade + "\n" +
                        "第一次课后作业：" + first_homework_grade + " " +
                        "第二次课后作业：" + second_homework_grade + " " +
                        "第三次课后作业：" + third_homework_grade + "\n" +
                        "期末测试：" + final_test_grade + " " +
                        "总成绩：" + final_grade + "\n";
    }

    public void setFinal_grade() {
        this.final_grade = this.getFrist_attend_grade() * 0.01 + (this.getSecond_attend_grade() + this.getThird_attend_grade()) * 0.02 +
                (this.getFirst_test_grade() + this.getSecond_test_grade()) * 0.07 + this.getThird_test_grade() * 0.06 + (this.getFirst_homework_grade() +
                this.getSecond_homework_grade()) * 0.08 + this.getThird_homework_grade() * 0.09 + this.getFinal_test_grade() * 0.5;
    }
}
