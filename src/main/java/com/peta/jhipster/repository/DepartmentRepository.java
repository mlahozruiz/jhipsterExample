package com.peta.jhipster.repository;

import com.peta.jhipster.domain.Department;

import org.springframework.data.jpa.repository.*;

import java.util.List;

/**
 * Spring Data JPA repository for the Department entity.
 */
public interface DepartmentRepository extends JpaRepository<Department,Long> {

}
