package pl.serwis.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Student {
    private int id;
    private String name;
    private  String course;

    public Student(){}
}
