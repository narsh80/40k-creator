package fr.btjt.service.abilities;

import fr.btjt.domain.Abilities;

import java.util.List;

/**
 * Created by mini-bibi on 11/06/2017.
 */
public interface AbilitiesService {

    public Abilities save(Abilities abilities);

    List<Abilities> getAll();

    Abilities update(Abilities abilities);

    void delete(Integer idAbilities);
}
