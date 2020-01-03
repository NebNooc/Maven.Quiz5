package rocks.zipcode.io.quiz4.collections;

import java.util.HashMap;
import java.util.Map;

/**
 * @author leon on 11/12/2018.
 */
public class ZipCodeWilmington {

    private Map<Student, Double> studyMap = new HashMap<>();

    public void enroll(Student student) {
        studyMap.put(student, student.getTotalStudyTime());
    }

    public Boolean isEnrolled(Student student) {
        return studyMap.containsKey(student);
    }

    public void lecture(double numberOfHours) {
        for(Student s : studyMap.keySet()) {
            studyMap.replace(s, s.getTotalStudyTime() + numberOfHours);
        }

        //studyMap.replaceAll((student, totalStudyHours) -> totalStudyHours + numberOfHours);
    }

    public Map<Student, Double> getStudyMap() {
        return studyMap;
    }
}
