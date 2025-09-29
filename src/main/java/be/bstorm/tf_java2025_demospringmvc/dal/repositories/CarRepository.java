package be.bstorm.tf_java2025_demospringmvc.dal.repositories;

import be.bstorm.tf_java2025_demospringmvc.dal.entities.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends JpaRepository<Car,Integer> {
}
