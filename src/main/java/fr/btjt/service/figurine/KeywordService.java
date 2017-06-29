package fr.btjt.service.figurine;

import fr.btjt.domain.Keyword;

import java.util.List;

/**
 * Created by mini-bibi on 11/06/2017.
 */
public interface KeywordService {

    public Keyword save(Keyword keyword);

    List<Keyword> getAll();

    Keyword update(Keyword keyword);

    void delete(String idKeyword);
}
