package Mc.rentACar.dataAccess.abstracts;

import Mc.rentACar.entities.concretes.Model;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ModelRepository extends JpaRepository <Model, Integer> {
}
