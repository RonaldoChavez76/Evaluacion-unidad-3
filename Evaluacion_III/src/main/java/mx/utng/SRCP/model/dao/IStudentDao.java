package mx.utng.SRCP.model.dao;

import java.util.List;

import mx.utng.SRCP.model.entity.Student;;

public interface IStudentDao {
    List<Student> list();
    void save(Student student);
    Student getById(Long id);
    void delete(Long id);
    
} 
