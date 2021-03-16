package com.galvanize.Herobook;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class HerobookServiceTest {
    @Mock
    HerobookRepository herobookRepository;

    @InjectMocks
    HerobookService herobookService;

    @Test
    public void CreateHeroBook(){
        HeroBook heros=new HeroBook(null,"Bruce Wayne","Batman","6'5\"","200","he does not possess any superpowers","high","high","90","25","good","I am batman","I am batman");
        this.herobookService.createHerobook(heros);
        verify(this.herobookRepository).save(
                new HeroBook(null,"Bruce Wayne","Batman","6'5\"","200","he does not possess any superpowers","high","high","90","25","good","I am batman","I am batman")
        );
    }
}
