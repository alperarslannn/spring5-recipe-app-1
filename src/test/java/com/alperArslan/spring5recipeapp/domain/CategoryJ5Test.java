package com.alperArslan.spring5recipeapp.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CategoryJ5Test {
    Category category;

    @BeforeEach
    void setUp() {
        category = new Category();

    }

    @Test
    public void getId() {
        Long idValue = 4L;
        category.setId(idValue);

        Assertions.assertEquals(idValue, category.getId());
    }
}