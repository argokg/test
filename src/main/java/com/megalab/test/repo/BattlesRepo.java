package com.megalab.test.repo;

import com.megalab.test.models.Battles;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BattlesRepo extends CrudRepository<Battles, String> {
}
