package rood.mark.repository;

import org.springframework.data.repository.CrudRepository;
import rood.mark.domain.Recipe;

public interface ResipeRepository extends CrudRepository<Recipe,Long> {
}
