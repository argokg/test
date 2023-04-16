package com.megalab.test.repo;

import com.megalab.test.models.Ships;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShipsRepo extends CrudRepository<Ships, String> {
}
