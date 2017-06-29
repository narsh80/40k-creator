package fr.btjt.service.options;

import fr.btjt.domain.Options;
import fr.btjt.repository.ArmyOptionRepository;
import fr.btjt.repository.OptionRepository;
import fr.btjt.service.AbstractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by mini-bibi on 11/06/2017.
 */
@Service
public class OptionsServiceImpl extends AbstractService implements OptionsService {

    @Autowired
    private OptionRepository optionRepository;
    @Autowired
    private ArmyOptionRepository armyOptionRepository;

    @Override
    public Options save(Options options) {
        optionRepository.save(options);
        return options;
    }

    @Override
    public List<Options> getAll() {
        return toList(optionRepository.findAll());
    }

    @Override
    public List<Options> findByIdArmy(Integer idArmy) {
        return optionRepository.findByidArmy(idArmy);
    }

    @Override
    public Options update(Options options) {
        options.getArmyOptions().stream().forEach(armyOptions -> {
            armyOptionRepository.save(armyOptions);
        });
        return optionRepository.save(options);
    }

    @Override
    public void delete(Integer idoption) {
        optionRepository.delete(idoption);
    }
}
