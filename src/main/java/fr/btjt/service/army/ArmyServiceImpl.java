package fr.btjt.service.army;

import fr.btjt.domain.Army;
import fr.btjt.repository.ArmyRepository;
import fr.btjt.repository.OptionRepository;
import fr.btjt.service.AbstractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by mini-bibi on 11/06/2017.
 */
@Service
public class ArmyServiceImpl extends AbstractService implements ArmyService {

    @Autowired
    private ArmyRepository optionRepository;

    @Override
    public Army save(Army army) {
        optionRepository.save(army);
        return army;
    }

    @Override
    public List<Army> getAll() {
        return toList(optionRepository.findAll());
    }

    @Override
    public Army update(Army army) {
        return optionRepository.save(army);
    }

    @Override
    public void delete(Integer ipArmy) {
        optionRepository.delete(ipArmy);
    }
}
