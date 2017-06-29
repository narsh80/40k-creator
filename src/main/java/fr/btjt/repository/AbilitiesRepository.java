package fr.btjt.repository;

import fr.btjt.domain.Abilities;
import fr.btjt.domain.Army;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by mini-bibi on 11/06/2017.
 */

public interface AbilitiesRepository extends JpaRepository<Abilities, Integer> {
}
