package fr.btjt.service.figurine;

import fr.btjt.domain.TypeFigurine;
import fr.btjt.repository.TypeFigurineRepository;
import fr.btjt.service.AbstractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by mini-bibi on 11/06/2017.
 */
@Service
public class TypeFigurineServiceImpl extends AbstractService implements TypeFigurineService {

    @Autowired
    private TypeFigurineRepository typeFigurineRepository;

    @Override
    public TypeFigurine save(TypeFigurine typeFigurine) {
        typeFigurineRepository.save(typeFigurine);
        return typeFigurine;
    }

    @Override
    public List<TypeFigurine> getAll() {
        return toList(typeFigurineRepository.findAll());
    }

    @Override
    public TypeFigurine update(TypeFigurine typeFigurine) {
        return typeFigurineRepository.save(typeFigurine);
    }

    @Override
    public void delete(String ipTypeFigurine) {
        typeFigurineRepository.delete(ipTypeFigurine);
    }
}
