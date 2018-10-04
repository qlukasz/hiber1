package pl.serwis.Dao;

import org.springframework.stereotype.Repository;
import pl.serwis.Entity.Student;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class StudentDao {
    private static Map<Integer, Student> students;
    static{
        students = new HashMap<Integer, Student>(){
            {
                put(1, new Student(1, "Name1", "course1"));
                put(2, new Student(2, "Name2", "course2"));
                put(3, new Student(3, "Name3", "course3"));
            }
        };
    }

    public Collection<Student> getAllStudents(){
        return this.students.values();
    }
    public Student getStudentById(int id){
        return this.students.get(id);
    }
    public void deleteStudentById(int id){
        this.students.remove(id);
    }
    public void updateStudent(Student student){
        Student s = students.get(student.getId());
        s.setName(student.getName());
        s.setCourse(student.getCourse());
    }

}
