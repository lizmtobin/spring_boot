package com.qa.dfe;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MarsupialRepo extends JpaRepository<Marsupial, Integer> {

}
