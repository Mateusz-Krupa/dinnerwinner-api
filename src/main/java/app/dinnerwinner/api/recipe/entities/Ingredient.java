package app.dinnerwinner.api.recipe.entities;

import app.dinnerwinner.api.security.user.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="ingredients")
public class Ingredient implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    @Column(name = "user_id")
    private User user;

    private String unit;

    private float weight;

    @Column(name = "recipe_id")
    private Integer recipe;

    public Ingredient(String name, User user, String unit, float weight, Integer recipe) {
        this.name = name;
        this.unit = unit;
        this.weight = weight;
        this.recipe = recipe;
        this.user = user;
    }
}
