package Mc.rentACar.dataAccess.abstracts;

import Mc.rentACar.entities.concretes.Brand1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface BrandRepository2 extends JpaRepository<Brand1, Integer> {  // repository --> veri işleri yapıcak
    // markaları listeleyeceğiz.
}
