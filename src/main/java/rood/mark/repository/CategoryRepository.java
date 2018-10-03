package rood.mark.repository;

import org.springframework.data.repository.CrudRepository;
import rood.mark.domain.Category;

import java.util.Optional;

public interface CategoryRepository extends CrudRepository<Category,Long> {

    Optional<Category> findByDescription(String description);
}
