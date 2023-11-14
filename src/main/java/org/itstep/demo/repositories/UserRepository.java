package org.itstep.demo.repositories;

import org.itstep.demo.entities.DbUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<DbUser, Long> {
}
