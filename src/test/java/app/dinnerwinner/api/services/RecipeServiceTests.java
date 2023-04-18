package app.dinnerwinner.api.services;

import app.dinnerwinner.api.recipe.dao.RecipeRepository;
import app.dinnerwinner.api.recipe.entitles.Ingredient;
import app.dinnerwinner.api.recipe.entitles.Recipe;

import app.dinnerwinner.api.recipe.services.RecipeService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;



import java.util.ArrayList;
import java.util.List;


public class RecipeServiceTests {

    private RecipeService recipeService;

    @Mock
    private RecipeRepository recipeRepository;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        recipeService = new RecipeService(recipeRepository);
    }

    @Test
    public void testCreateRecipe() {
        Recipe recipe = new Recipe();
        recipe.setName("Spaghetti Bolognese");
        recipe.setDescription("A classic Italian pasta dish with a meaty tomato sauce");

        List<Ingredient> ingredients = new ArrayList<>();
        Ingredient ingredient1 = new Ingredient();
        ingredient1.setName("Spaghetti");
        ingredient1.setUnit("g");
        ingredient1.setWeight(200f);
        ingredients.add(ingredient1);

        Ingredient ingredient2 = new Ingredient();
        ingredient2.setName("Beef");
        ingredient2.setUnit("g");
        ingredient2.setWeight(300f);
        ingredients.add(ingredient2);

        recipe.setIngredients(ingredients);

        Mockito.when(recipeRepository.save(recipe)).thenReturn(recipe);

        Recipe createdRecipe = recipeService.createRecipe(recipe);

        Assertions.assertEquals(recipe.getName(), createdRecipe.getName());
        Assertions.assertEquals(recipe.getDescription(), createdRecipe.getDescription());
        Assertions.assertEquals(recipe.getIngredients().size(), createdRecipe.getIngredients().size());
    }

    @Test
    public void testGetAllRecipes() {
        List<Ingredient> list = new ArrayList<Ingredient>();
        Recipe recipe1 = new Recipe("Pasta Carbonara", "Classic Italian pasta dish with creamy sauce", list);
        Recipe recipe2 = new Recipe("Chicken Curry", "Spicy and fragrant Indian curry dish", list);
        List<Recipe> recipeList =  new ArrayList<Recipe>();
        recipeList.add(recipe1);
        recipeList.add(recipe2);

        Mockito.when(recipeRepository.findAll()).thenReturn(recipeList);

        List<Recipe> recipes = recipeService.getAllRecipes();
        Assertions.assertEquals(recipes.size(), 2);
        Assertions.assertEquals(recipes, recipeList);
    }
}
