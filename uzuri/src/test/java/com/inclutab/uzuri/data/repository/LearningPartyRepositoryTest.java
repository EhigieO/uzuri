package com.inclutab.uzuri.data.repository;

import com.inclutab.uzuri.data.model.Authority;
import com.inclutab.uzuri.data.model.LearningParty;
import com.inclutab.uzuri.data.model.Role;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Slf4j
class LearningPartyRepositoryTest {

    @Autowired
    LearningPartyRepository learningPartyRepository;

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {

    }

    @Test
    @Transactional
    void createStudentLearningPartyWithStudentRole(){
        LearningParty learningParty =
                new LearningParty("yomi@gmail.com",
                        "123321",
                        new Authority(Role.ROLE_STUDENT));

        learningPartyRepository.save(learningParty);
        assertThat(learningParty.getId()).isNotNull();
        assertThat(learningParty.getEmailAddress()).isEqualTo("yomi@gmail.com");
        assertThat(learningParty.getAuthorities().get(0).getAuthority()).isEqualTo(Role.ROLE_STUDENT);
        log.info("After saving -> {}", learningParty);
    }
}