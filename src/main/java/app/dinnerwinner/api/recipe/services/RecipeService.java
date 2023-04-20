package app.dinnerwinner.api.recipe.services;

import app.dinnerwinner.api.recipe.dao.RecipeRepository;
import app.dinnerwinner.api.recipe.entities.Recipe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecipeService {

    @Autowired
    private RecipeRepository recipeRepository;

    public RecipeService(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    public List<Recipe> getAllRecipes() {
        return recipeRepository.findAll();
    }
    
    public Recipe createRecipe(Recipe recipe){
        return recipeRepository.save(recipe);
    }

}
