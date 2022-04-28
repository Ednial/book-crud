package com.crud.crudbook.entity;
import lombok.Data;
import org.springframework.lang.Nullable;

import javax.persistence.*;

@Entity(name = "Receta")
@Table(name = "receta")
@Data
public class Receta {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title;

    private String author;

    private String ingredient;
}
