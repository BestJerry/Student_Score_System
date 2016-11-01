package Function;

import Menu.Teacher_Menu;
import Stu_Tea_Info.Student_Message;
import Stu_Tea_Info.Teacher_Message;
import Utility.ReadAndWrite;
import com.sun.xml.internal.ws.runtime.config.TubelineFeatureReader;
import jdk.nashorn.internal.ir.CaseNode;
import jdk.nashorn.internal.ir.Flags;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by jerry on 16-10-28.
 */
public class Teacher_Function extends Student_Message {


    public void addStudentScore() throws IOException, ClassNotFoundException {

        ArrayList<Student_Message> list = new ArrayList<>();

        try (
                ObjectInputStream inputStream = new ObjectInputStream
                        (new FileInputStream("student_message.txt"));
        ) {

            list = (ArrayList<Student_Message>) inputStream.readObject();

        }

        try (
                ObjectOutputStream outputStream = new ObjectOutputStream
                        (new FileOutputStream("student_message.txt"));

        ) {
            Scanner input = new Scanner(System.in);
            Student_Message student_message = new Student_Message();
            System.out.println("请输入您要添加的学生姓名：");
            String name = input.next();
            student_message.setStu_Name(name);
            System.out.println("请输入您要添加的学生学号：");
            long stu_Id = input.nextLong();
            student_message.setStu_Id(stu_Id);
            System.out.println("请按照提示输入各项成绩：");
            System.out.print("第一次课堂点名：");
            int score1 = input.nextInt();
            student_message.setFrist_attend_grade(score1);
            System.out.print("第二次课堂点名：");
            int score2 = input.nextInt();
            student_message.setSecond_attend_grade(score2);
            System.out.print("第三次课堂点名：");
            int score3 = input.nextInt();
            student_message.setThird_attend_grade(score3);
            System.out.print("第一次课堂小测：");
            int score4 = input.nextInt();
            student_message.setFirst_test_grade(score4);
            System.out.print("第二次课堂小测：");
            int score5 = input.nextInt();
            student_message.setSecond_test_grade(score5);
            System.out.print("第三次课堂小测：");
            int score6 = input.nextInt();
            student_message.setThird_test_grade(score6);
            System.out.print("第一次课后作业：");
            int score7 = input.nextInt();
            student_message.setFirst_homework_grade(score7);
            System.out.print("第二次课后作业：");
            int score8 = input.nextInt();
            student_message.setSecond_homework_grade(score8);
            System.out.print("第三次课后作业：");
            int score9 = input.nextInt();
            student_message.setThird_homework_grade(score9);
            System.out.print("期末测试：");
            int score10 = input.nextInt();
            student_message.setFinal_test_grade(score10);
            student_message.setFinal_grade();
            //System.out.println(student_message.toString());
            list.add(student_message);
            outputStream.writeObject(list);

        }
        Scanner input = new Scanner(System.in);
        System.out.println("成绩录入成功！若想返回上一级请输入\"back\"");
        boolean flag = true;

        while (flag) {
            String word = input.next();
            if (word.matches("back")) {
                Teacher_Menu.show();
                flag = false;
            } else {
                System.out.println("您的输入有误，请重新输入。");
            }
        }
    }


    public void readStudentScore() throws IOException, ClassNotFoundException {

        try (
                ObjectInputStream inputStream = new ObjectInputStream
                        (new FileInputStream("student_message.txt"));
        ) {

            ArrayList<Student_Message> list = (ArrayList<Student_Message>) inputStream.readObject();
            for (Student_Message student_message : list) {
                System.out.println(student_message.toString());
            }
        }

        boolean flag = true;
        Scanner input = new Scanner(System.in);

        System.out.println("以上是所有学生的成绩信息，若想返回上一级请输入\"back\"");
        while (flag) {
            String word = input.next();
            if (word.matches("back")) {
                Teacher_Menu.show();
                flag = false;
            } else {
                System.out.println("您的输入有误，请重新输入。");
            }
        }

    }

    public void deleteStudentScore() throws IOException, ClassNotFoundException {

        ArrayList<Student_Message> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        try (
                ObjectInputStream inputStream = new ObjectInputStream
                        (new FileInputStream("student_message.txt"));
        ) {

            list = (ArrayList<Student_Message>) inputStream.readObject();

        }

        System.out.println("请您输入要删除的学生学号：");
        long stu_Id = input.nextLong();
        boolean isfind = false;
        boolean flag = true;
        for (Student_Message student_message : list) {
            if (student_message.getStu_Id() == stu_Id) {
                isfind = true;
                System.out.println("以下是该学生的成绩信息：");
                System.out.println(student_message.toString());
                System.out.println("删除操作有风险，请谨慎操作。" + "\n" + "确定删除请输入\"yes\",取消删除请输入\"no\"：");
                while (flag) {
                    String word = input.next();
                    if (word.matches("yes")) {
                        list.remove(student_message);
                        try (
                                ObjectOutputStream outputStream = new ObjectOutputStream
                                        (new FileOutputStream("student_message.txt"));

                        ) {
                            outputStream.writeObject(list);

                        }
                        System.out.println("删除成功，系统将自动返回上一级");
                        Teacher_Menu.show();
                        flag = false;
                    } else if (word.matches("no")) {
                        System.out.println("删除操作已取消，系统将自动返回上一级");
                        Teacher_Menu.show();
                        flag = false;
                    } else {
                        System.out.println("您的输入有误，请重新输入。");
                    }
                }
                break;
            }
        }
        if (!isfind) {

            System.out.println("您的输入有误，不存在该学生。" + "\n" + "若想返回上一级请输入\"back\"");

            while (flag) {
                String word = input.next();
                if (word.matches("back")) {
                    Teacher_Menu.show();
                    flag = false;
                } else {
                    System.out.println("您的输入有误，请重新输入。");
                }
            }
        }

    }

    public void editStudentScore() throws IOException, ClassNotFoundException {

        ArrayList<Student_Message> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        boolean flag = true;
        int newscore = 0;

        try (
                ObjectInputStream inputStream = new ObjectInputStream
                        (new FileInputStream("student_message.txt"));
        ) {

            list = (ArrayList<Student_Message>) inputStream.readObject();

        }
        System.out.println("请输入您要修改的学生学号");
        long Stu_Id = input.nextLong();
        for (Student_Message student_message : list) {
            if (student_message.getStu_Id() == Stu_Id) {
                System.out.println("以下是该学生的成绩信息：");
                System.out.println(student_message.toString());
                System.out.println("请根据需要修改的成绩选择以下成绩选项的标号：");
                System.out.print("1.第一次课堂点名成绩\n" +
                        "2.第二次课堂点名成绩\n" +
                        "3.第三次课堂点名成绩\n" +
                        "4.第一次课堂测试成绩\n" +
                        "5.第二次课堂测试成绩\n" +
                        "6.第三次课堂测试成绩\n" +
                        "7.第一次课后作业成绩\n" +
                        "8.第二次课后作业成绩\n" +
                        "9.第三次课后作业成绩\n" +
                        "10.期末测试成绩\n");


                while (flag) {
                    String choice = input.next();
                    switch (choice) {
                        case "1":
                            System.out.println("请输入该学生该项成绩的新成绩：");
                            newscore = input.nextInt();
                            if (checkcommit()) {
                                student_message.setFrist_attend_grade(newscore);
                                student_message.setFinal_grade();
                                try (
                                        ObjectOutputStream outputStream = new ObjectOutputStream
                                                (new FileOutputStream("student_message.txt"));

                                ) {
                                    outputStream.writeObject(list);

                                }
                                System.out.println("成绩已修改成功，系统将自动返回上一级");
                                Teacher_Menu.show();

                            } else {
                                System.out.println("修改操作已取消，系统将自动返回上一级");
                                Teacher_Menu.show();

                            }
                            flag = false;
                            break;
                        case "2":
                            System.out.println("请输入该学生该项成绩的新成绩：");
                            newscore = input.nextInt();
                            if (checkcommit()) {
                                student_message.setSecond_attend_grade(newscore);
                                student_message.setFinal_grade();
                                try (
                                        ObjectOutputStream outputStream = new ObjectOutputStream
                                                (new FileOutputStream("student_message.txt"));

                                ) {
                                    outputStream.writeObject(list);

                                }
                                System.out.println("成绩已修改成功，系统将自动返回上一级");
                                Teacher_Menu.show();

                            } else {
                                System.out.println("修改操作已取消，系统将自动返回上一级");
                                Teacher_Menu.show();

                            }
                            flag = false;
                            break;
                        case "3":
                            System.out.println("请输入该学生该项成绩的新成绩：");
                            newscore = input.nextInt();
                            if (checkcommit()) {
                                student_message.setThird_attend_grade(newscore);
                                student_message.setFinal_grade();
                                try (
                                        ObjectOutputStream outputStream = new ObjectOutputStream
                                                (new FileOutputStream("student_message.txt"));

                                ) {
                                    outputStream.writeObject(list);

                                }
                                System.out.println("成绩已修改成功，系统将自动返回上一级");
                                Teacher_Menu.show();

                            } else {
                                System.out.println("修改操作已取消，系统将自动返回上一级");
                                Teacher_Menu.show();

                            }
                            flag = false;
                            break;
                        case "4":
                            System.out.println("请输入该学生该项成绩的新成绩：");
                            newscore = input.nextInt();
                            if (checkcommit()) {
                                student_message.setFirst_test_grade(newscore);
                                student_message.setFinal_grade();
                                try (
                                        ObjectOutputStream outputStream = new ObjectOutputStream
                                                (new FileOutputStream("student_message.txt"));

                                ) {
                                    outputStream.writeObject(list);

                                }
                                System.out.println("成绩已修改成功，系统将自动返回上一级");
                                Teacher_Menu.show();

                            } else {
                                System.out.println("修改操作已取消，系统将自动返回上一级");
                                Teacher_Menu.show();

                            }
                            flag = false;
                            break;
                        case "5":
                            System.out.println("请输入该学生该项成绩的新成绩：");
                            newscore = input.nextInt();
                            if (checkcommit()) {
                                student_message.setSecond_test_grade(newscore);
                                student_message.setFinal_grade();
                                try (
                                        ObjectOutputStream outputStream = new ObjectOutputStream
                                                (new FileOutputStream("student_message.txt"));

                                ) {
                                    outputStream.writeObject(list);

                                }
                                System.out.println("成绩已修改成功，系统将自动返回上一级");
                                Teacher_Menu.show();

                            } else {
                                System.out.println("修改操作已取消，系统将自动返回上一级");
                                Teacher_Menu.show();

                            }
                            flag = false;
                            break;
                        case "6":
                            System.out.println("请输入该学生该项成绩的新成绩：");
                            newscore = input.nextInt();
                            if (checkcommit()) {
                                student_message.setThird_test_grade(newscore);
                                student_message.setFinal_grade();
                                try (
                                        ObjectOutputStream outputStream = new ObjectOutputStream
                                                (new FileOutputStream("student_message.txt"));

                                ) {
                                    outputStream.writeObject(list);

                                }
                                System.out.println("成绩已修改成功，系统将自动返回上一级");
                                Teacher_Menu.show();

                            } else {
                                System.out.println("修改操作已取消，系统将自动返回上一级");
                                Teacher_Menu.show();

                            }
                            flag = false;
                            break;
                        case "7":
                            System.out.println("请输入该学生该项成绩的新成绩：");
                            newscore = input.nextInt();
                            if (checkcommit()) {
                                student_message.setFirst_homework_grade(newscore);
                                student_message.setFinal_grade();
                                try (
                                        ObjectOutputStream outputStream = new ObjectOutputStream
                                                (new FileOutputStream("student_message.txt"));

                                ) {
                                    outputStream.writeObject(list);

                                }
                                System.out.println("成绩已修改成功，系统将自动返回上一级");
                                Teacher_Menu.show();

                            } else {
                                System.out.println("修改操作已取消，系统将自动返回上一级");
                                Teacher_Menu.show();

                            }
                            flag = false;
                            break;
                        case "8":
                            System.out.println("请输入该学生该项成绩的新成绩：");
                            newscore = input.nextInt();
                            if (checkcommit()) {
                                student_message.setSecond_homework_grade(newscore);
                                student_message.setFinal_grade();
                                try (
                                        ObjectOutputStream outputStream = new ObjectOutputStream
                                                (new FileOutputStream("student_message.txt"));

                                ) {
                                    outputStream.writeObject(list);

                                }
                                System.out.println("成绩已修改成功，系统将自动返回上一级");
                                Teacher_Menu.show();

                            } else {
                                System.out.println("修改操作已取消，系统将自动返回上一级");
                                Teacher_Menu.show();

                            }
                            flag = false;
                            break;
                        case "9":
                            System.out.println("请输入该学生该项成绩的新成绩：");
                            newscore = input.nextInt();
                            if (checkcommit()) {
                                student_message.setThird_homework_grade(newscore);
                                student_message.setFinal_grade();
                                try (
                                        ObjectOutputStream outputStream = new ObjectOutputStream
                                                (new FileOutputStream("student_message.txt"));

                                ) {
                                    outputStream.writeObject(list);

                                }
                                System.out.println("成绩已修改成功，系统将自动返回上一级");
                                Teacher_Menu.show();

                            } else {
                                System.out.println("修改操作已取消，系统将自动返回上一级");
                                Teacher_Menu.show();

                            }
                            flag = false;
                            break;
                        case "10":
                            System.out.println("请输入该学生该项成绩的新成绩：");
                            newscore = input.nextInt();
                            if (checkcommit()) {
                                student_message.setFinal_test_grade(newscore);
                                student_message.setFinal_grade();
                                try (
                                        ObjectOutputStream outputStream = new ObjectOutputStream
                                                (new FileOutputStream("student_message.txt"));

                                ) {
                                    outputStream.writeObject(list);

                                }
                                System.out.println("成绩已修改成功，系统将自动返回上一级");
                                Teacher_Menu.show();

                            } else {
                                System.out.println("修改操作已取消，系统将自动返回上一级");
                                Teacher_Menu.show();

                            }
                            flag = false;
                            break;
                        default:
                            System.out.println("您的输入有误，请重新输入：");
                    }
                }
            }
        }
    }

    public void countStudentScore() throws IOException, ClassNotFoundException {

        Scanner input = new Scanner(System.in);
        ArrayList<Student_Message> list = new ArrayList<>();
        ReadAndWrite readAndWrite = new ReadAndWrite();
        readAndWrite.readStudentFile(list);
        System.out.println("请选择您要查看的统计项：");
        System.out.print("1.总成绩排序\n" +
                "2.总成绩平均值\n" +
                "3.最高分\n" +
                "4.最低分\n" +
                "5.优秀率\n" +
                "6.良好率\n" +
                "7.不及格率\n");
        boolean flag = true;
        while (flag) {
            String choice = input.next();
            switch (choice) {
                case "1":
                    break;
                case "2":
                    break;
                case "3":
                    break;
                case "4":

                    break;
                case "5":
                    break;
                case "6":

                    break;
                case "7":
                    break;
                default:
                    System.out.println("您的输入有误，请重新输入。");
            }
        }

    }


    public static boolean checkcommit() {
        boolean flag = true;
        Scanner input = new Scanner(System.in);

        System.out.println("确定修改请输入\"yes\",取消修改请输入\"no\"：");
        while (flag) {
            String word = input.next();
            if (word.matches("yes")) {

                return true;

            } else if (word.matches("no")) {
                return false;
            } else {
                System.out.println("您的输入有误，请重新输入。");
            }
        }
        return false;
    }

    public double findmaxscore(ArrayList<Student_Message> list) {
        double max = list.get(1).getFinal_grade();
        for (Student_Message student_message : list) {
            if (student_message.getFinal_grade() > max) {
                max = student_message.getFinal_grade();
            }
        }
        return max;
    }

    public double findminscore(ArrayList<Student_Message> list) {
        double min = list.get(1).getFinal_grade();
        for (Student_Message student_message : list) {
            if (student_message.getFinal_grade() < min) {
                min = student_message.getFinal_grade();
            }
        }
        return min;
    }
}