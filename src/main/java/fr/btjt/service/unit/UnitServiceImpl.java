package fr.btjt.service.unit;

import fr.btjt.domain.Unit;
import fr.btjt.repository.UnitRepository;
import fr.btjt.service.AbstractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by mini-bibi on 11/06/2017.
 */
@Service
public class UnitServiceImpl extends AbstractService implements UnitService {

    @Autowired
    private UnitRepository unitRepository;

    @Override
    public Unit save(Unit unit) {
        unitRepository.save(unit);
        return unit;
    }

    @Override
    public List<Unit> getAll() {
        return toList(unitRepository.findAll());
    }

    @Override
    public Unit update(Unit unit) {
        return unitRepository.save(unit);
    }

    @Override
    public void delete(Integer ipUnit) {
        unitRepository.delete(ipUnit);
    }
}
