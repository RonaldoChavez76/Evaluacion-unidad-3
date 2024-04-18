package mx.utng.SRCP.model.service;

import java.util.List;
import mx.utng.SRCP.model.entity.Publicacion;

public interface IPublicacionService {
    List<Publicacion> list();
    void save(Publicacion publicacion);
    Publicacion getById(Long id);
    void delete(Long id);
}
