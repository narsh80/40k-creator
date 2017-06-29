package fr.btjt.controller;

import fr.btjt.domain.Abilities;
import fr.btjt.service.abilities.AbilitiesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by mini-bibi on 11/06/2017.
 */
@RestController
@RequestMapping(value =  "/w40k/abilities")
public class AbilitiesController {

    @Autowired
    AbilitiesService abilitiesService;

    @RequestMapping(method = RequestMethod.POST)
    public Abilities saveAbilities(@RequestBody Abilities abilities){
        return abilitiesService.save(abilities);
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Abilities> getAll(){
        return abilitiesService.getAll();
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/{idAbilties}")
    public Abilities update(@RequestBody Abilities abilities, @PathVariable("idAbilties") Integer idAbilties){
        return abilitiesService.update(abilities);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{idAbilties}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable("idAbilties") Integer idAbilties){
        abilitiesService.delete(idAbilties);
    }
}
