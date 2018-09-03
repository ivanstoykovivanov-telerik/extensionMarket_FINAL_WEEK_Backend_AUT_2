package telerikacademy.extensionrepository.areas.ivan.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import telerikacademy.extensionrepository.areas.ivan.domain.User;


public interface LoginUserRepository extends CrudRepository<User, Long> {

    User findByUsername(String username);

    User save(User user);

}
