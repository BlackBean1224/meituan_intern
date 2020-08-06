/**
 * @author bean
 * @date 2020/7/1
 */
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import lombok.Data;
import netscape.javascript.JSObject;

import java.util.ArrayList;
import java.util.List;


@Data
class Student {
    Long id;
    String name;
    StudentInfo studentInfo;

    @Data
    class StudentInfo {
        Integer birthday;
        String nickName;
    }

    Student () {
        studentInfo = new StudentInfo();
    }
    Student(Long id, String name, int birthday, String nickName) {
        studentInfo = new StudentInfo();
        this.id = id;
        this.name = name;
        this.studentInfo.setBirthday(birthday);
        this.studentInfo.setNickName(nickName);
    }

    @Override
    public String toString() {
        return "id:" + id + ' ' + "name:" + name + studentInfo.getBirthday() + studentInfo.getNickName();
    }

}
public class testFastJson {
    public static void main(String[] args) {
        Student student1 = new Student(10L, "豆",19991224,"豆宝");
        Student student2 = new Student(10L, "黑",19991224,"黑宝");
        student1.getStudentInfo().setNickName(null);
        student1.getStudentInfo().setBirthday(null);
        List<Student> student = new ArrayList<>();
        student.add(student1);
        student.add(student2);
        String jsonString = JSONObject.toJSONString(student);
        System.out.println(jsonString);

//        Student newStudent = JSONObject.parseObject(jsonString, Student.class);
//        JSONObject studentJSONObject = JSONObject.parseObject(jsonString);
//        System.out.println(studentJSONObject);
//        System.out.println("wow");

    }
}
