package mx.utng.SRCP.model.dao;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import mx.utng.SRCP.model.entity.Publicacion;

@Repository
public class PublicacionDaoImpl implements IPublicacionDao{
    
    @Autowired
    private EntityManager em;


    @SuppressWarnings("unchecked")
    @Override
    public List<Publicacion> list() {
        return em.createQuery("from Publicacion").getResultList();
    }

    @Override
    public void save(Publicacion publicacion) {
        if(publicacion.getId() != null && publicacion.getId() >0){
            em.merge(publicacion);
        }else{
            em.persist(publicacion);
        }
    }

    @Override
    public Publicacion getById(Long id) {
        return em.find(Publicacion.class, id);
    }

    @Override
    public void delete(Long id) {
        Publicacion publicacion = getById(id);
        em.remove(publicacion);
    }
}
