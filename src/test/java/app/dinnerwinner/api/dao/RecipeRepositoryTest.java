package app.dinnerwinner.api.dao;

import app.dinnerwinner.api.entitles.Recipe;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;


@SpringBootTest
@Transactional
public class RecipeRepositoryTest {

    @Autowired
    private RecipeRepository recipeRepository;
    private Object Assert;

//    @Test
//    public void testFindAll() {
//        List<Recipe> recipes = recipeRepository.findAll();
//        assertNotNull(recipes);
//        assertTrue(!recipes.isEmpty());
//    }
}
