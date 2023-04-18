package app.dinnerwinner.api.recipe.controllers;

import app.dinnerwinner.api.recipe.entitles.Recipe;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/my")
public class MyController {

    @GetMapping("/recipe")
    public List<Recipe> getMyRecipe(){
        return null;
    };








}
