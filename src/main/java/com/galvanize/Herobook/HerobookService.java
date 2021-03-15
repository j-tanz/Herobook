package com.galvanize.Herobook;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HerobookService {
    private final HerobookRepository herobookRepository;

    @Autowired
    public HerobookService(HerobookRepository herobookRepository) {
        this.herobookRepository = herobookRepository;
    }

    public void createHerobook(HeroBook heroBook){
        this.herobookRepository.save(heroBook);
    }
}
