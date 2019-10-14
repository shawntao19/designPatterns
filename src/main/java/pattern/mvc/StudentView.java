package pattern.mvc;

/**
 * @Author: xuwentao
 * Created on 2019/10/14 10:16
 */
public class StudentView {
    public void printStudentDetails(String studentName, String studentRollNo) {
        System.out.println("Student: ");
        System.out.println("Name: " + studentName);
        System.out.println("Roll No: " + studentRollNo);
    }
}
