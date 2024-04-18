package mx.utng.SRCP.model.service;

import java.util.List;

import mx.utng.SRCP.model.entity.Teacher;

public interface ITeacherService {
     List<Teacher> list();
    void save(Teacher teacher);
    Teacher getById(Long id);
    void delete(Long id);
}
