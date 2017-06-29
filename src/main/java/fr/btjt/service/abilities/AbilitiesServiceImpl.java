package fr.btjt.service.abilities;

import fr.btjt.domain.Abilities;
import fr.btjt.repository.AbilitiesRepository;
import fr.btjt.service.AbstractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by mini-bibi on 11/06/2017.
 */
@Service
public class AbilitiesServiceImpl extends AbstractService implements AbilitiesService {

    @Autowired
    private AbilitiesRepository abilitiesRepository;

    @Override
    public Abilities save(Abilities abilities) {
        abilitiesRepository.save(abilities);
        return abilities;
    }

    @Override
    public List<Abilities> getAll() {
        return toList(abilitiesRepository.findAll());
    }

    @Override
    public Abilities update(Abilities abilities) {
        return abilitiesRepository.save(abilities);
    }

    @Override
    public void delete(Integer ipAbilities) {
        abilitiesRepository.delete(ipAbilities);
    }
}
