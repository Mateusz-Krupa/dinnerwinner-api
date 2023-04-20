package app.dinnerwinner.api.recipe.controllers;

import app.dinnerwinner.api.recipe.entities.Ingredient;
import app.dinnerwinner.api.recipe.services.IngredientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/ingredients")
public class IngredientController {

    @Autowired
    IngredientService ingredientService;

    @GetMapping()
    public List<Ingredient> getList(){
        return ingredientService.getAllIngredients();
    }

    @PostMapping
    public Ingredient createIngredient(@RequestBody Ingredient ingredient) {
        return ingredientService.createRecipe(ingredient);
    }
}
