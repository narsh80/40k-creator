package fr.btjt.service.figurine;

import fr.btjt.domain.TypeFigurine;

import java.util.List;

/**
 * Created by mini-bibi on 11/06/2017.
 */
public interface TypeFigurineService {

    public TypeFigurine save(TypeFigurine typeFigurine);

    List<TypeFigurine> getAll();

    TypeFigurine update(TypeFigurine typeFigurine);

    void delete(String idTypeFigurine);
}
