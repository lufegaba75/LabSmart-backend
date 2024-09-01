package com.lufegaba.labsmart.repositories;

import com.lufegaba.labsmart.auth.entities.LabUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IUserRepository extends JpaRepository<LabUser, Long> {

    Optional<LabUser> findByEmail (String email);
}
