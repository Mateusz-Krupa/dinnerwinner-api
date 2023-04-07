package app.dinnerwinner.api.services;

import app.dinnerwinner.api.dao.RecipeRepository;
import app.dinnerwinner.api.entitles.Recipe;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecipeService {

    @PersistenceContext
    private EntityManager entityManager;

    @Autowired
    private RecipeRepository recipeRepository;

    public List<Recipe> getAllRecipes() {
        return recipeRepository.findAll();
    }


}
