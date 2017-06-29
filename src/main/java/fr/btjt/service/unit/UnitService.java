package fr.btjt.service.unit;

import fr.btjt.domain.Unit;

import java.util.List;

/**
 * Created by mini-bibi on 11/06/2017.
 */
public interface UnitService {

    public Unit save(Unit unit);

    List<Unit> getAll();

    Unit update(Unit unit);

    void delete(Integer idUnit);
}
