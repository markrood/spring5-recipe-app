package rood.mark.services;

import org.springframework.stereotype.Service;
import rood.mark.domain.Recipe;
import rood.mark.repository.RecipeRepository;

import java.util.HashSet;
import java.util.Set;

@Service
public class RecipeServiceImp implements RecipeService{

    private final RecipeRepository recipeRepository;

    public RecipeServiceImp(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    @Override
    public Set<Recipe> getRecipes() {
        Set<Recipe> recipeSet = new HashSet<>();
        recipeRepository.findAll().iterator().forEachRemaining(recipeSet::add);
        return recipeSet;
    }
}
