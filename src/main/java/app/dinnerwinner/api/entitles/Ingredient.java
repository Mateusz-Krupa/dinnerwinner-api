package app.dinnerwinner.api.entitles;

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


}
