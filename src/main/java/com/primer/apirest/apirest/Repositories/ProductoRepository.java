package com.primer.apirest.apirest.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.primer.apirest.apirest.Entities.Producto;
                                                            // Entity y tipo de dato que es el id
public interface ProductoRepository extends JpaRepository<Producto, Long> {

}
