package com.crud.crudbook.service;

import com.crud.crudbook.entity.Receta;

import java.util.List;

public interface RecetaServiceInterface {
    List<Receta> getAllRecetas();
    Receta saveReceta(Receta receta);
    Receta updateReceta(Receta receta);
    void deleteReceta(Long id);
}
