package com.galvanize.Herobook;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/heroBook")
public class HeroBookController {
    @Autowired
    HerobookService herobookService;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public void addHero(@RequestBody HeroBook hero) {
        this.herobookService.createHerobook(hero);
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public List<HeroBook> getAllHeroes() {
        return this.herobookService.findAllHeroes();
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE, path = "/hero")
    @ResponseStatus(HttpStatus.OK)
    public HeroBook getHeroByName(@RequestParam(name = "heroName") String heroName) {
        return this.herobookService.findAllHeroes().stream().filter(hero ->
                hero.getHeroName().equals(heroName))
                .findFirst()
                .orElse(null);
    }
}
