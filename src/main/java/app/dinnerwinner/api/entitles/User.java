package app.dinnerwinner.api.entitles;

import app.dinnerwinner.api.enums.UserType;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name="users")
public class User {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String email;

    private String name;

    @Enumerated(EnumType.STRING)
    private UserType rank;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "user_recipe",
            joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "recipe_id", referencedColumnName = "id"))
    private Set<Recipe> recipes = new HashSet<>();

    @OneToMany(mappedBy = "ingredients", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Ingredient> myIngredients = new ArrayList<>();

}
