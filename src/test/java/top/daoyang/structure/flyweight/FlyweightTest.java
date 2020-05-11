package top.daoyang.structure.flyweight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlyweightTest {

    @Test
    public void flyWeight() {
        for (int i = 0; i < 2; i++) {
            Flyweight.ExamInfoFactory.getExamInfo("subject " + i);
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                Flyweight.ExamInfo examInfo = Flyweight.ExamInfoFactory.getExamInfo("subject " + j);

                examInfo.setStudent("student " + i);

                System.out.println(examInfo);
            }
        }
    }
}