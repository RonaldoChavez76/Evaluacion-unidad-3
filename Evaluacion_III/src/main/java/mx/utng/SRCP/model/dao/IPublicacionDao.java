package mx.utng.SRCP.model.dao;

import java.util.List;
import mx.utng.SRCP.model.entity.Publicacion;

public interface IPublicacionDao {
    List<Publicacion> list();
    void save(Publicacion publicacion);
    Publicacion getById(Long id);
    void delete(Long id);
}
