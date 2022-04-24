package com.m3.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.m3.domain.Dollars;

public interface DollarsRepository extends JpaRepository<Dollars, Integer> {

}
