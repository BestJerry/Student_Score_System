package Utility;

import Stu_Tea_Info.Student_Message;

import java.util.Comparator;

/**
 * Created by jerry on 16-11-5.
 */
public class ScoreComparator implements Comparator<Student_Message> {
    @Override
    public int compare(Student_Message o1, Student_Message o2) {
        if(o1.getFinal_grade()>o2.getFinal_grade())
            return 1;
        else
            return 0;
    }
}
