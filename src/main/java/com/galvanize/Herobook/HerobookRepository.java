package com.galvanize.Herobook;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HerobookRepository extends JpaRepository<HeroBook,Long> {
}
