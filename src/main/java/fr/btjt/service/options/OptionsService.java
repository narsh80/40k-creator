package fr.btjt.service.options;

import fr.btjt.domain.Options;

import java.util.List;

/**
 * Created by mini-bibi on 11/06/2017.
 */
public interface OptionsService {

    public Options save(Options options);

    List<Options> getAll();

    Options update(Options options);

    void delete(Integer idoption);
}
