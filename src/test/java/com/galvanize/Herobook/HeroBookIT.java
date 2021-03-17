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
    public void addHeroTest() throws Exception {
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

        HeroBook hero1 = HeroBook.builder()
                .heroName("Batman")
                .image("http://blah.com")
                .specialPower("None")
                .build();

        mockMvc.perform(post("/heroBook")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(hero1))
        )
                .andExpect(status().isCreated());

        mockMvc.perform(get("/heroBook"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("[1].heroName").value(hero1.getHeroName()))
                .andExpect(jsonPath("[1].image").value(hero1.getImage()))
                .andExpect(jsonPath("[1].specialPower").value(hero1.getSpecialPower()));
    }
}
