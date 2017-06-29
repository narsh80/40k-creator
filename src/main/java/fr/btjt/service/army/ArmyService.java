package fr.btjt.service.army;

import fr.btjt.domain.Army;

import java.util.List;

/**
 * Created by mini-bibi on 11/06/2017.
 */
public interface ArmyService {

    public Army save(Army army);

    List<Army> getAll();

    Army update(Army army);

    void delete(Integer idArmy);
}
