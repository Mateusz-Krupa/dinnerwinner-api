package app.dinnerwinner.api.recipe.dao;

import app.dinnerwinner.api.recipe.entities.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IngredientRepository extends JpaRepository<Ingredient, Integer> {

}


