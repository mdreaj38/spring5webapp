package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

/**
 * @author rejaul.reaj
 * @since 11/11/21
 */
public interface AuthorRepository extends CrudRepository<Author, Long> {
}