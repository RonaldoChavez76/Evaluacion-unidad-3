package mx.utng.SRCP.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mx.utng.SRCP.model.dao.IClienteDao;
import mx.utng.SRCP.model.entity.Cliente;

@Service
public class ClienteServiceImpl implements IClienteService{
    //Inyectamos la interfaz para utilizar los métodos de CRUD
     //C-Create, R-Read Retrieve, U-Update, D-Delete
     @Autowired
     private IClienteDao dao;
 
 
     @Transactional(readOnly = true)
     @Override
     public List<Cliente> list() {
         return dao.list();
     }
 
     @Transactional
     @Override
     public void save(Cliente cliente) {
         dao.save(cliente);
     }
 
     @Transactional(readOnly = true)
     @Override
     public Cliente getById(Long id) {
         return dao.getById(id);
     }
 
     @Transactional
     @Override
     public void delete(Long id) {
         dao.delete(id);
     }
     
 }
 
