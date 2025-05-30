package com.CinephileLog.repository;

import com.CinephileLog.domain.Grade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GradeRepository extends JpaRepository<Grade, Long> {
    Grade findFirstByOrderByGradeIdAsc();
}
