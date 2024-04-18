package mx.utng.SRCP.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mx.utng.SRCP.model.dao.IPublicacionDao;

import mx.utng.SRCP.model.entity.Publicacion;

@Service
public class PublicacionServiceImpl implements IPublicacionService{
   @Autowired
    private IPublicacionDao dao;


    @Transactional(readOnly = true)
    @Override
    public List<Publicacion> list() {
        return dao.list();
    }

    @Transactional
    @Override
    public void save(Publicacion publicacion) {
        dao.save(publicacion);
    }

    @Transactional(readOnly = true)
    @Override
    public Publicacion getById(Long id) {
        return dao.getById(id);
    }

    @Transactional
    @Override
    public void delete(Long id) {
        dao.delete(id);
    } 
}
