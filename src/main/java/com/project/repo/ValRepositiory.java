package com.project.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.entity.Validations;

@Repository
public interface ValRepositiory extends JpaRepository<Validations, Integer> {
	

}
