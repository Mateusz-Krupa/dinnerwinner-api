package app.dinnerwinner.api.recipe.entitles;

import jakarta.persistence.*;

@Entity
@Table(name="ingredients")
public class Ingredient {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    private String name;

    private String unit;

    private float weight;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "recipe_id")
    private Recipe recipe;

    public Ingredient() {
    }

    public Ingredient(String name, String unit, float weight, Recipe recipe) {
        this.name = name;
        this.unit = unit;
        this.weight = weight;
        this.recipe = recipe;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }
}
