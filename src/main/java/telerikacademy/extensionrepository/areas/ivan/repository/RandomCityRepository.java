package telerikacademy.extensionrepository.areas.ivan.repository;

import org.springframework.data.repository.CrudRepository;
import telerikacademy.extensionrepository.areas.ivan.domain.RandomCity;

public interface RandomCityRepository extends CrudRepository<RandomCity, Long> {
}
