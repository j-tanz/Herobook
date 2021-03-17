package com.galvanize.Herobook;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class HeroVisitorTest {

    @Mock
    VisitorRepository visitorRepository;

    @InjectMocks
    VisitorService visitorService;


    @Test
    public void createVisitor() {

        Visitor visitor = Visitor.builder().visitorName("Authorized").build();
        visitorService.addVisitor(visitor);
        verify(visitorRepository).save(Visitor.builder().visitorName("Authorized").build());
    }
}
