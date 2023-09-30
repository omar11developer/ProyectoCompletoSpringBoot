package com.groupomar.facturadigital.models.dao;

import com.groupomar.facturadigital.models.entity.Producto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IProductoDao extends CrudRepository<Producto, Long> {
    @Query("select p from Producto p where p.nombre like %1%")
    public List<Producto> findByNombre(String term);

    public List<Producto> findNombreLikeIgnoreCase(String term);
}
