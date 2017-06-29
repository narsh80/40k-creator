package fr.btjt.service.figurine;

import fr.btjt.domain.Keyword;
import fr.btjt.repository.KeywordRepository;
import fr.btjt.service.AbstractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by mini-bibi on 11/06/2017.
 */
@Service
public class KeywordServiceImpl extends AbstractService implements KeywordService {

    @Autowired
    private KeywordRepository keywordRepository;

    @Override
    public Keyword save(Keyword keyword) {
        keywordRepository.save(keyword);
        return keyword;
    }

    @Override
    public List<Keyword> getAll() {
        return toList(keywordRepository.findAll());
    }

    @Override
    public Keyword update(Keyword keyword) {
        return keywordRepository.save(keyword);
    }

    @Override
    public void delete(String ipKeyword) {
        keywordRepository.delete(ipKeyword);
    }
}
