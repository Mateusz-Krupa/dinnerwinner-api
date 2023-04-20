package app.dinnerwinner.api.recipe.services;

import app.dinnerwinner.api.recipe.dao.IngredientRepository;
import app.dinnerwinner.api.recipe.entities.Ingredient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IngredientService {

    @Autowired
    private IngredientRepository ingredientRepository;

    public IngredientService(IngredientRepository ingredientRepository) {
        this.ingredientRepository = ingredientRepository;
    }

    public List<Ingredient> getAllIngredients() {
        return ingredientRepository.findAll();
    }


    public Ingredient createRecipe(Ingredient ingredient){
        return ingredientRepository.save(ingredient);
    }

}
