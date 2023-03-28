package untitled.domain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import untitled.domain.*;

@RepositoryRestResource(collectionResourceRel = "foods", path = "foods")
public interface FoodRepository
    extends PagingAndSortingRepository<Food, String> {}
