package pl.serwis.Dao;

import org.springframework.stereotype.Repository;
import pl.serwis.Entity.Student;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class StudentDao {
    private static Map<Integer, Student> students;
    static{
        students = new HashMap<Integer, Student>(){
            {
                put(1, new Student(1, "Name1", new ArrayList<String>() {{
                    add("c11");
                    add("c12");
                    add("c13");
                }}));

                put(2, new Student(2, "Name2", new ArrayList<String>() {{
                    add("c21");
                    add("c22");
                    add("c23");
                }}));
                put(3, new Student(3, "Name3", new ArrayList<String>() {{
                    add("c31");
                    add("c32");
                    add("c33");
                }}));
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
    }

}
