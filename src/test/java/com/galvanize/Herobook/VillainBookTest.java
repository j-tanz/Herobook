package com.galvanize.Herobook;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class VillainBookTest {
    @Autowired
    MockMvc mockMvc;

    ObjectMapper objectMapper = new ObjectMapper();

    @Test
    public void addVillainTest() throws Exception {
//        VillainBook villain = VillainBook.builder()
//                .villainName("Hulk")
//                .image("http://blah.com")
//                .specialPower("Rage")
//                .build();
//
//        mockMvc.perform(post("/villainBook")
//                .contentType(MediaType.APPLICATION_JSON)
//                .content(objectMapper.writeValueAsString(villain))
//        )
//                .andExpect(status().isCreated());
//    }
//        mockMvc.perform(get("/villainBook"))
//                .andExpect(status().isOk())
//                .andExpect(jsonPath("[0].villianName").value(villain.getVillainName()))
//                .andExpect(jsonPath("[0].image").value(villain.getImage()))
//                .andExpect(jsonPath("[0].specialPower").value(villain.getSpecialPower()));
//
//        VillainBook villain1 = VillainBook.builder()
//                .villainName("Batman")
//                .image("http://blah.com")
//                .specialPower("None")
//                .build();
//
//        mockMvc.perform(post("/villainBook")
//                .contentType(MediaType.APPLICATION_JSON)
//                .content(objectMapper.writeValueAsString(villain1))
//        )
//                .andExpect(status().isCreated());
//
//        mockMvc.perform(get("/villainBook"))
//                .andExpect(status().isOk())
//                .andExpect(jsonPath("[1].villianName").value(villain1.getVillainName()))
//                .andExpect(jsonPath("[1].image").value(villain1.getImage()))
//                .andExpect(jsonPath("[1].specialPower").value(villain1.getSpecialPower()));
    }
}
