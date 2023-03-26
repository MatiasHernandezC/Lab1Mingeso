package com.milkStgo.monolitico.services;

import com.milkStgo.monolitico.entities.ProveedorEntity;
import com.milkStgo.monolitico.repositories.ProveedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class ProveedorService {
    @Autowired
    ProveedorRepository proveedorRepository;

    public ArrayList<ProveedorEntity> obtenerProveedores(){
        return (ArrayList<ProveedorEntity>) proveedorRepository.findAll();
    }

    public ProveedorEntity guardarProveedor(ProveedorEntity usuario){
        return proveedorRepository.save(usuario);
    }

    public Optional<ProveedorEntity> obtenerPorId(Long id){
        return proveedorRepository.findById(id);
    }

    public boolean eliminarProveedor(Long id) {
        try{
            proveedorRepository.deleteById(id);
            return true;
        }catch(Exception err){
            return false;
        }
    }

}