package fr.btjt.controller;

import fr.btjt.domain.Keyword;
import fr.btjt.service.figurine.KeywordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by mini-bibi on 11/06/2017.
 */
@RestController
@RequestMapping(value =  "/w40k/keyword")
public class KeywordController {

    @Autowired
    KeywordService keywordService;

    @RequestMapping(method = RequestMethod.POST)
    public Keyword saveKeyword(@RequestBody Keyword keyword){
        return keywordService.save(keyword);
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Keyword> getAll(){
        return keywordService.getAll();
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/{codeKeyword}")
    public Keyword update(@RequestBody Keyword keyword, @PathVariable("codeKeyword") String codeKeyword){
        return keywordService.update(keyword);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{codeKeyword}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable("codeKeyword") String codeKeyword){
        keywordService.delete(codeKeyword);
    }
}
