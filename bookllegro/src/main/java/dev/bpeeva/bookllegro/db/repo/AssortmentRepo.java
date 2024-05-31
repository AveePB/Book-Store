package dev.bpeeva.bookllegro.db.repo;

import dev.bpeeva.bookllegro.db.model.Assortment;
import dev.bpeeva.bookllegro.db.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AssortmentRepo extends JpaRepository<Assortment, Integer> {

    List<Assortment> findAllBySeller(User seller);
    Optional<Assortment> findByTitleAndSeller(String title, User seller);
}
