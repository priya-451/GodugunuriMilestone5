package com.godugunuriClasses.DMS.repository;
 
import org.springframework.data.repository.CrudRepository;
 
import com.godugunuriClasses.DMS.Models.Dog;
 
public interface DogRepository extends CrudRepository<Dog, Integer> {
 
}
