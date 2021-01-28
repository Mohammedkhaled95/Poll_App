package com.khaled.poll.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.khaled.poll.model.Role;
import com.khaled.poll.model.RoleName;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

	Optional<Role> findByName(RoleName roleName);
}
