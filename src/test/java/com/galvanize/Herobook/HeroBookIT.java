package com.galvanize.Herobook;


import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class HeroBookIT {

    @Autowired
    MockMvc mockMvc;

    ObjectMapper objectMapper = new ObjectMapper();

    @Test
    public void addHero() throws Exception {
        HeroBook hero = HeroBook.builder()
                .heroName("Hulk")
                .image("http://blah.com")
                .specialPower("Rage")
                .build();

        mockMvc.perform(post("/heroBook")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(hero))
        )
                .andExpect(status().isCreated());

        mockMvc.perform(get("/heroBook"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("[0].heroName").value(hero.getHeroName()))
                .andExpect(jsonPath("[0].image").value(hero.getImage()))
                .andExpect(jsonPath("[0].specialPower").value(hero.getSpecialPower()));
    }
}
