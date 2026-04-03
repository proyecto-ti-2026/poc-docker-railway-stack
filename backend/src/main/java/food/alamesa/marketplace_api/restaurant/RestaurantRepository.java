package food.alamesa.marketplace_api.restaurant;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface RestaurantRepository extends JpaRepository<Restaurant, UUID> {
    List<Restaurant> findByIsOpenTrue();
    List<Restaurant> findByCategoryIgnoreCase(String category);
}
