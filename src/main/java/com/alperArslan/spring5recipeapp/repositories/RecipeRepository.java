package com.alperArslan.spring5recipeapp.repositories;

import com.alperArslan.spring5recipeapp.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe,Long> {
}
