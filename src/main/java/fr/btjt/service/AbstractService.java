package fr.btjt.service;

import fr.btjt.domain.TypeOptions;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bibi on 12/06/2017.
 */
public abstract class AbstractService {

    public List toList(Iterable iterable){
        List list = new ArrayList<>();
        iterable.forEach(item -> list.add(item));
        return list;
    }
}
