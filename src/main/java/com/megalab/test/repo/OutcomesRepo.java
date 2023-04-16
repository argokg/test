package com.megalab.test.repo;

import com.megalab.test.models.Outcomes;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OutcomesRepo extends CrudRepository<Outcomes, String> {
}
