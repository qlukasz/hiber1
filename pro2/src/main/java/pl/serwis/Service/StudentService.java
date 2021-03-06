package pl.serwis.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.serwis.Dao.StudentDao;
import pl.serwis.Entity.Student;

import java.util.Collection;

@Service
public class StudentService {

    @Autowired
    private StudentDao studentDao;

    public Collection<Student> getAllStudents(){
        return studentDao.getAllStudents();
    }
    public Student getStudentById(int id){
        return this.studentDao.getStudentById(id);
    }
    public void deleteStudentById(int id){
        this.studentDao.deleteStudentById(id);
    }
    public void updateStudent(Student student){
        this.studentDao.updateStudent(student);
    }

}
