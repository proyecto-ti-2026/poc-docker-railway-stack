package food.alamesa.marketplace_api.restaurant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/restaurants")
@CrossOrigin(origins = "${frontend.url}")
public class RestaurantController {

    @Autowired
    RestaurantRepository repo;

    @GetMapping
    public List<Restaurant> list(
            @RequestParam(required = false) String category,
            @RequestParam(defaultValue = "false") boolean openOnly) {
        if (category != null)
            return repo.findByCategoryIgnoreCase(category);
        if (openOnly)
            return repo.findByIsOpenTrue();
        return repo.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Restaurant> get(@PathVariable UUID id) {
        return repo.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
