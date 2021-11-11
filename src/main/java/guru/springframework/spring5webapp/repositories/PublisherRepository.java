package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.domain.Publisher;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.repository.CrudRepository;

/**
 * @author rejaul.reaj
 * @since 11/11/21
 */
public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}