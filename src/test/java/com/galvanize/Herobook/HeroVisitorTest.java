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

    @Test
    public void getVisitorTest(){
        Visitor firstVisitor = this.visitorService.findFirstVisitor();
        assertThat(firstVisitor).isEqualTo(null);

        Visitor visitor = Visitor.builder().visitorName("Authorized").build();
        this.visitorService.addVisitor(visitor);

        Visitor v1 = Visitor.builder().visitorId(1l).visitorName("Authorized").build();
        when(this.visitorRepository.findByVisitorName("Authorized")).thenReturn(
                v1
        );

        Visitor visitor1=this.visitorService.getVisitor("Authorized");
        assertThat(visitor1).isEqualTo(Visitor.builder().visitorId(1l).visitorName("Authorized").build());
    }
}
