package com.qa.dfe.persistence;

import com.qa.dfe.domain.Marsupial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MarsupialRepository extends JpaRepository<Marsupial, Integer> {

}
