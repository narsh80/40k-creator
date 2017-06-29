package fr.btjt.repository;

import fr.btjt.domain.Keyword;
import fr.btjt.domain.TypeFigurine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by mini-bibi on 11/06/2017.
 */

public interface KeywordRepository extends JpaRepository<Keyword, String> {
}
