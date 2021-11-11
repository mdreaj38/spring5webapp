package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

/**
 * @author rejaul.reaj
 * @since 11/11/21
 */
public interface BookRepository extends CrudRepository<Book, Long> {
}