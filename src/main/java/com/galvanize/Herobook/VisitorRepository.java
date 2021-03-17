package com.galvanize.Herobook;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface VisitorRepository extends JpaRepository<Visitor, Long> {
    @Query("select v from Visitor v where v.visitorName = ?1")
    Visitor findByVisitorName(String visitorName);
}
