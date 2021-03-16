package com.galvanize.Herobook;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/heroBook")
public class HeroBookController {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void addHero(@RequestBody HeroBook hero) {

    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<HeroBook> getAllHeroes() {
        return List.of(HeroBook.builder()
                .heroName("Hulk")
                .image("http://blah.com")
                .specialPower("Rage")
                .build());
    }
}
