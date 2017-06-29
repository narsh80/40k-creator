package fr.btjt.controller;

import fr.btjt.domain.Army;
import fr.btjt.service.army.ArmyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by mini-bibi on 11/06/2017.
 */
@RestController
@RequestMapping(value =  "/w40k/army")
public class ArmyController {

    @Autowired
    ArmyService armyService;

    @RequestMapping(method = RequestMethod.POST)
    public Army saveArmy(@RequestBody Army army){
        return armyService.save(army);
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Army> getAll(){
        return armyService.getAll();
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/{idTypeOption}")
    public Army update(@RequestBody Army army, @PathVariable("idTypeOption") Integer idTypeOption){
        return armyService.update(army);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{idOption}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable("idOption") Integer idOption){
        armyService.delete(idOption);
    }
}
