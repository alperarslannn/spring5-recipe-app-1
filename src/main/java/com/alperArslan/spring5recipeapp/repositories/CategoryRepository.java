package com.alperArslan.spring5recipeapp.repositories;

import com.alperArslan.spring5recipeapp.domain.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category,Long> {
}
