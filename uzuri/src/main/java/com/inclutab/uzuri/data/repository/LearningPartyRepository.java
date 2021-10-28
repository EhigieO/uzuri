package com.inclutab.uzuri.data.repository;

import com.inclutab.uzuri.data.model.LearningParty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LearningPartyRepository extends JpaRepository<LearningParty, Long>{
}
