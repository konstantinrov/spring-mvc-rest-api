package guru.springframework.spring5mvcrest.repositories;

import guru.springframework.spring5mvcrest.domain.Category;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Konstantin Romanov
 * @created 18/06/2020 - 12:22
 * @project spring-mvc-rest-api
 */
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
