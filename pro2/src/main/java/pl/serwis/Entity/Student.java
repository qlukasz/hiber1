package pl.serwis.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@AllArgsConstructor
@Data
public class Student {
    private int id;
    private String name;
    private List<String> courses;

    public Student(){}
}
