package rood.mark.repository;

import org.springframework.data.repository.CrudRepository;
import rood.mark.domain.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe,Long> {
}
