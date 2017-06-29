package fr.btjt.controller;

import fr.btjt.domain.TypeFigurine;
import fr.btjt.service.figurine.TypeFigurineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by mini-bibi on 11/06/2017.
 */
@RestController
@RequestMapping(value =  "/w40k/typeFigurine")
public class TypeFigurineController {

    @Autowired
    TypeFigurineService typeFigurineService;

    @RequestMapping(method = RequestMethod.POST)
    public TypeFigurine saveTypeFigurine(@RequestBody TypeFigurine typeFigurine){
        return typeFigurineService.save(typeFigurine);
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<TypeFigurine> getAll(){
        return typeFigurineService.getAll();
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/{codeTypeFigurine}")
    public TypeFigurine update(@RequestBody TypeFigurine typeFigurine, @PathVariable("codeTypeFigurine") String codeTypeFigurine){
        return typeFigurineService.update(typeFigurine);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{codeTypeFigurine}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable("codeTypeFigurine") String codeTypeFigurine){
        typeFigurineService.delete(codeTypeFigurine);
    }
}
