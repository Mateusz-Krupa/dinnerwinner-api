package app.dinnerwinner.api.dao;

import app.dinnerwinner.api.entitles.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecipeRepository extends JpaRepository<Recipe, Integer> { }


