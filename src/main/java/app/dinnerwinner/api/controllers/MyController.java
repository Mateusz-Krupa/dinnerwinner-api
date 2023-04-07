package app.dinnerwinner.api.controllers;

import app.dinnerwinner.api.dao.UserRepository;
import app.dinnerwinner.api.entitles.Recipe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/my")
public class MyController {

    @GetMapping("/recipe")
    public List<Recipe> getMyRecipe(){
        return null;
    };
}
