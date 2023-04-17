package com.megalab.test.repo;

import com.megalab.test.models.Classes;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClassesRepo extends CrudRepository<Classes, String> {
     @Query(value = "Select class from ships\n" +
         "where name IN (select ship from outcomes where result =?)\n" +
         "union\n" +
         "select class from classes \n" +
         "join outcomes on class = ship \n" +
         "where result=?", nativeQuery = true)
     List<String> classes(String res, String result);

}
