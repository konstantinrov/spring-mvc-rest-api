package guru.springframework.spring5mvcrest.bootstrap;

import guru.springframework.spring5mvcrest.domain.Category;
import guru.springframework.spring5mvcrest.repositories.CategoryRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @author Konstantin Romanov
 * @created 18/06/2020 - 12:35
 * @project spring-mvc-rest-api
 */
@Component
public class Bootstrap implements CommandLineRunner {
    private CategoryRepository categoryRepository;

    public Bootstrap(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Category fruits = new Category();
        fruits.setName("Fruits");

        Category dried = new Category();
        fruits.setName("Dried");

        Category exotic = new Category();
        fruits.setName("Exotic");

        Category nuts = new Category();
        fruits.setName("Nuts");

        categoryRepository.save(fruits);
        categoryRepository.save(dried);
        categoryRepository.save(exotic);
        categoryRepository.save(nuts);

        System.out.println("Date loaded : " + categoryRepository.count());

    }
}
