package com.crud.crudbook.service;

import com.crud.crudbook.entity.Receta;
import com.crud.crudbook.repository.RecetaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecetaService implements RecetaServiceInterface {
    @Autowired
    private RecetaRepository recetaRepository;

    @Override
    public List<Receta> getAllRecetas() {
        return recetaRepository.findAll();
    }

    @Override
    public Receta saveReceta(Receta receta) {
        return recetaRepository.save(receta);
    }

    @Override
    public Receta updateReceta(Receta receta) {
        return recetaRepository.save(receta);
    }

    @Override
    public void deleteReceta(Long id) {
        recetaRepository.deleteById(id);
    }
}
