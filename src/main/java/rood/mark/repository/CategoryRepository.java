package rood.mark.repository;

import org.springframework.data.repository.CrudRepository;
import rood.mark.domain.Catagory;

import java.util.Optional;

public interface CategoryRepository extends CrudRepository<Catagory,Long> {

    Optional<Catagory> findByDescription(String description);
}
