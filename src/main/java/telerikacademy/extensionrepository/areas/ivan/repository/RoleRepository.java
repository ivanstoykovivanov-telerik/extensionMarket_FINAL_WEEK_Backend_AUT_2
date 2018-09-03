package telerikacademy.extensionrepository.areas.ivan.repository;

import org.springframework.data.repository.CrudRepository;
import telerikacademy.extensionrepository.areas.ivan.domain.Role;

public interface RoleRepository extends CrudRepository<Role, Long> {
}
