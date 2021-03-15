package com.galvanize.Herobook;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

public class HerobookServiceTest {
    @Mock
    HerobookRepository herobookRepository;

    @InjectMocks
    HerobookService herobookService;

    @Test
    public void CreateHeroBook(){
        HeroBook heros=new HeroBook();

    }
}
