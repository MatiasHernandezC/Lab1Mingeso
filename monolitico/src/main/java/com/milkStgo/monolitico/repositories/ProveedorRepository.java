package com.milkStgo.monolitico.repositories;

import com.milkStgo.monolitico.entities.ProveedorEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
public interface ProveedorRepository extends CrudRepository<ProveedorEntity, Long> {


}
