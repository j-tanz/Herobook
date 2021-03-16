package com.galvanize.Herobook;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class HerobookServiceTest {
    @Mock
    HerobookRepository herobookRepository;

    @InjectMocks
    HerobookService herobookService;

    @Test
    public void CreateHeroBook() {
        HeroBook heros = new HeroBook(null, "Bruce Wayne", "Batman", "6'5\"", "200", "he does not possess any superpowers", "high", "high", "90", "25", "good", "I am batman", "I am batman");
        this.herobookService.createHerobook(heros);
        verify(this.herobookRepository).save(
                new HeroBook(null, "Bruce Wayne", "Batman", "6'5\"", "200", "he does not possess any superpowers", "high", "high", "90", "25", "good", "I am batman", "I am batman")
        );
    }

    @Test
    public void findAllHeroes() {
        HeroBook heros = new HeroBook(null, "Bruce Wayne", "Batman", "6'5\"", "200", "he does not possess any superpowers", "high", "high", "90", "25", "good", "I am batman", "I am batman");
        HeroBook hero2 = HeroBook.builder()
                .realName("Peter parker")
                .heroName("SpiderMan")
                .height("6'0")
                .description("Lame")
                .build();
        when(herobookRepository.findAll()).thenReturn(
                List.of(heros, hero2)
        );
        List<HeroBook> heroesList = herobookService.findAllHeroes();

        assertThat(heroesList).isEqualTo(List.of(
                new HeroBook(null, "Bruce Wayne", "Batman", "6'5\"", "200", "he does not possess any superpowers", "high", "high", "90", "25", "good", "I am batman", "I am batman"),
                HeroBook.builder()
                        .realName("Peter parker")
                        .heroName("SpiderMan")
                        .height("6'0")
                        .description("Lame")
                        .build()
        ));
    }
}
