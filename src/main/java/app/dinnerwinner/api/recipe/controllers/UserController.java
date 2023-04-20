package app.dinnerwinner.api.recipe.controllers;

import app.dinnerwinner.api.recipe.entities.Ingredient;
import app.dinnerwinner.api.security.user.User;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/api/v1/user")
@RestController
public class UserController {

    @GetMapping("/current")
    public String getUserDetails(@AuthenticationPrincipal User user) {
        String username = user.getUsername();
        // You can also get other user details such as authorities, password, etc.
        // using methods provided by the UserDetails interface
        return "Hello, " + username + "!";
    }

    @GetMapping("/ingredients")
    public List<Ingredient> getUserIngredients(@AuthenticationPrincipal User user) {
        Integer id = user.getId();
        // You can also get other user details such as authorities, password, etc.
        // using methods provided by the UserDetails interface
        return user.getIngredients();
    }

}