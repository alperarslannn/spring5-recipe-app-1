package com.alperArslan.spring5recipeapp.controllers;

import com.alperArslan.spring5recipeapp.services.RecipeServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.ui.Model;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class IndexControllerTest {
    @Mock
    RecipeServiceImpl recipeService;
    @Mock
    Model model;

    IndexController indexController;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);

        indexController = new IndexController(recipeService);
    }

    @Test
    public void getIndexPage() {
        String viewName = indexController.getIndexPage(model);

        assertEquals("index",viewName);
        verify(recipeService,times(1)).getRecipes();
        verify(model,times(1)).addAttribute(eq("recipes"),anySet());
    }
}