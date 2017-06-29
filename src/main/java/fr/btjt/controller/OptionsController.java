package fr.btjt.controller;

import fr.btjt.domain.Options;
import fr.btjt.service.options.OptionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by mini-bibi on 11/06/2017.
 */
@RestController
@RequestMapping(value =  "/w40k/options")
public class OptionsController {

    @Autowired
    OptionsService optionsService;

    @RequestMapping(method = RequestMethod.POST)
    public Options saveOptions(@RequestBody Options options){
        return optionsService.save(options);
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Options> getAll(){
        return optionsService.getAll();
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/{idTypeOption}")
    public Options update(@RequestBody Options options, @PathVariable("idTypeOption") Integer idTypeOption){
        return optionsService.update(options);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{idOption}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable("idOption") Integer idOption){
        optionsService.delete(idOption);
    }
}
