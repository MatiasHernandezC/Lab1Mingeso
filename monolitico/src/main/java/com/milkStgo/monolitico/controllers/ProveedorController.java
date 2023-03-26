package com.milkStgo.monolitico.controllers;

import com.milkStgo.monolitico.entities.ProveedorEntity;
import com.milkStgo.monolitico.services.ProveedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
@RequestMapping
public class ProveedorController {
    @Autowired
    ProveedorService proveedorService;

    @GetMapping("/listar")
    public String listar(Model model) {
        ArrayList<ProveedorEntity>proveedores=proveedorService.obtenerProveedores();
        model.addAttribute("proveedores",proveedores);
        return "index";
    }

}