package fr.btjt.controller;

import fr.btjt.domain.Unit;
import fr.btjt.service.unit.UnitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by mini-bibi on 11/06/2017.
 */
@RestController
@RequestMapping(value =  "/w40k/unit")
public class UnitController {

    @Autowired
    UnitService unitService;

    @RequestMapping(method = RequestMethod.POST)
    public Unit saveUnit(@RequestBody Unit unit){
        return unitService.save(unit);
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Unit> getAll(){
        return unitService.getAll();
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/{idUnit}")
    public Unit update(@RequestBody Unit unit, @PathVariable("idUnit") Integer idUnit){
        return unitService.update(unit);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{idUnit}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable("idUnit") Integer idUnit){
        unitService.delete(idUnit);
    }
}
