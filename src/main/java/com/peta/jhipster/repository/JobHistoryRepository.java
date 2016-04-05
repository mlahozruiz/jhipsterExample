package com.peta.jhipster.repository;

import com.peta.jhipster.domain.JobHistory;

import org.springframework.data.jpa.repository.*;

import java.util.List;

/**
 * Spring Data JPA repository for the JobHistory entity.
 */
public interface JobHistoryRepository extends JpaRepository<JobHistory,Long> {

}
