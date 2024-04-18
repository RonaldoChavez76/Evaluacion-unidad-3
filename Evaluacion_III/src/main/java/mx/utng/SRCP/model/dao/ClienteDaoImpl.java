package mx.utng.SRCP.model.dao;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import mx.utng.SRCP.model.entity.Cliente;

@Repository
public class ClienteDaoImpl implements IClienteDao{
    //Entity Manager y contexto de persistencia
    //Guarda internamente todas las entidads y
    //utiliza como una cache datos de BD
    //@PersistenceContext
    @Autowired
    private EntityManager em;


    @SuppressWarnings("unchecked")
    @Override
    public List<Cliente> list() {
        return em.createQuery("from Cliente").getResultList();
    }

    @Override
    public void save(Cliente cliente) {
        if(cliente.getId() != null && cliente.getId() >0){
            em.merge(cliente);
        }else{
            em.persist(cliente);
        }
    }

    @Override
    public Cliente getById(Long id) {
        return em.find(Cliente.class, id);
    }

    @Override
    public void delete(Long id) {
        Cliente cliente = getById(id);
        em.remove(cliente);
    }

}

