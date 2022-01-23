package MVC.model.repository;

import MVC.model.model.Student;

public interface IStudentRepository {
    Student[] getAll();
    void add(Student student);
}
