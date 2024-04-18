package mx.utng.SRCP.model.dao;

import java.util.List;

import mx.utng.SRCP.model.entity.Teacher;

public interface ITeacherDao {
    List<Teacher> list();
    void save(Teacher teacher);
    Teacher getById(Long id);
    void delete(Long id);
}
