package fr.btjt.repository;

import fr.btjt.domain.Options;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by mini-bibi on 11/06/2017.
 */

public interface OptionRepository extends JpaRepository<Options, Integer> {

    @Query("select o from Options o join fetch o.armyOptions ao where ao.idArmy = :idArmy")
    List<Options> findByidArmy(@Param("idArmy") Integer idArmy);
}
