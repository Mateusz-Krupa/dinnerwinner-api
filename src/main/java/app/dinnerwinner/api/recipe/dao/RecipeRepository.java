package app.dinnerwinner.api.recipe.dao;

import app.dinnerwinner.api.recipe.entities.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecipeRepository extends JpaRepository<Recipe, Integer> { }


