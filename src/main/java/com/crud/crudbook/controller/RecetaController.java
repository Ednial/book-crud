package com.crud.crudbook.controller;

import com.crud.crudbook.entity.Receta;
import com.crud.crudbook.service.RecetaServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/")

public class RecetaController {

    @Autowired
    private RecetaServiceInterface service;

    @GetMapping("get/recetas")
    public List<Receta> getAllRecetas(){
        return service.getAllRecetas();
    }

    @PostMapping("save/receta")
    public Receta saveReceta(@RequestBody Receta receta){
        return service.saveReceta(receta);
    }

    @PutMapping("update/receta")
    public Receta updateReceta(@RequestBody Receta receta){
        return service.updateReceta(receta);
    }

    @DeleteMapping("delete/receta/{id}")
    public void deleteReceta(@PathVariable Long id){
        service.deleteReceta(id);
    }

}
