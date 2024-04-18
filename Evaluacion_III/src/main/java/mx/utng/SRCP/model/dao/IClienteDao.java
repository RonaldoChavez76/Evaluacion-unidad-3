package mx.utng.SRCP.model.dao;

import java.util.List;

import mx.utng.SRCP.model.entity.Cliente;

public interface IClienteDao {
    List<Cliente> list();
    void save(Cliente cliente);
    Cliente getById(Long id);
    void delete(Long id);
    
} 
