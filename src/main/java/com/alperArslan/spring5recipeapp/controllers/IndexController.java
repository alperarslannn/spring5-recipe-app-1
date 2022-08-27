package com.alperArslan.spring5recipeapp.controllers;

import com.alperArslan.spring5recipeapp.domain.Category;
import com.alperArslan.spring5recipeapp.domain.UnitOfMeasure;
import com.alperArslan.spring5recipeapp.repositories.CategoryRepository;
import com.alperArslan.spring5recipeapp.repositories.UnitOfMeasureRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class IndexController {
    private CategoryRepository categoryRepository;
    private UnitOfMeasureRepository unitOfMeasureRepository;

    public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }

    @RequestMapping({"","/","index"})
    public String getIndexPage(){
        Optional<Category> categoryOptional = categoryRepository.findByDescription("American");
        Optional<UnitOfMeasure> unitOfMeasureOptional = unitOfMeasureRepository.findByDescription("Teaspoon");

        System.out.println("hi");

        System.out.println("category id " + categoryOptional.get().getId());
        System.out.println("uom id " + unitOfMeasureOptional.get().getId());

        return "index";
    }
}
