package com.peta.jhipster.repository;

import com.peta.jhipster.domain.Region;

import org.springframework.data.jpa.repository.*;

import java.util.List;

/**
 * Spring Data JPA repository for the Region entity.
 */
public interface RegionRepository extends JpaRepository<Region,Long> {

}
