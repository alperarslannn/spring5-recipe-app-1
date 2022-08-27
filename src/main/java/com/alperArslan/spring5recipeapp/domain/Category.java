package com.alperArslan.spring5recipeapp.domain;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@EqualsAndHashCode(exclude = {"recipes"})
@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "categories")
    private Set<Recipe> recipes = new HashSet<>();

    public Category() {
    }

}
