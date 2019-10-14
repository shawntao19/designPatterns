package pattern.data.access;

/**
 * @Author: xuwentao
 * Created on 2019/10/14 14:05
 */

import java.util.List;

public interface StudentDao {
    public List<Student> getAllStudents();

    public Student getStudent(int rollNo);

    public void updateStudent(Student student);

    public void deleteStudent(Student student);
}
