package fr.btjt.repository;

import fr.btjt.domain.ArmyOptions;
import fr.btjt.domain.ArmyOptionsPK;
import fr.btjt.domain.Options;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by mini-bibi on 11/06/2017.
 */

public interface ArmyOptionRepository extends CrudRepository<ArmyOptions, ArmyOptionsPK>{
}
