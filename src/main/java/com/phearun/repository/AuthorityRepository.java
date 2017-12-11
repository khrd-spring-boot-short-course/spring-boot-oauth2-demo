package com.phearun.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.phearun.model.Authority;

public interface AuthorityRepository extends JpaRepository<Authority, String> {
}
