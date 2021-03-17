package com.galvanize.Herobook;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VisitorService {

   private final VisitorRepository visitorRepository;

    @Autowired
    public VisitorService(VisitorRepository visitorRepository) {
        this.visitorRepository = visitorRepository;
    }

    public void addVisitor(Visitor visitor) {
        visitorRepository.save(visitor);
    }

    public Visitor findFirstVisitor() {
        List<Visitor> visitorList=this.visitorRepository.findAll();
        return (((visitorList!=null)&&(!visitorList.isEmpty()))?visitorList.get(0):null);
    }

    public Visitor getVisitor(String authorized) {
        return this.visitorRepository.findByVisitorName(authorized);
    }
}
