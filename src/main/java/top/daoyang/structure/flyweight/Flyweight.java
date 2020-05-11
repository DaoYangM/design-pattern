package top.daoyang.structure.flyweight;

import lombok.Data;
import lombok.ToString;

import java.util.HashMap;
import java.util.Map;

/**
 * 享元模式通过一保存不可变对象，来复用对象
 */
public class Flyweight {

    @Data
    @ToString
    public static class ExamInfo {
        private String student;

        private String subject;
    }

    public static class ExamInfoFactory {
        private static Map<String, ExamInfo> examInfoMap = new HashMap<>();

        public static ExamInfo getExamInfo(String subject) {
            if (examInfoMap.containsKey(subject)) {
                return examInfoMap.get(subject);
            } else {
                ExamInfo examInfo = new ExamInfo();
                examInfo.setSubject(subject);
                examInfoMap.put(subject, examInfo);
                System.out.println("new examInfo " + subject);
                return examInfo;
            }
        }
    }
}
