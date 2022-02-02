package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.People;

@Repository
public interface PeopleRepository extends JpaRepository<People,Long> {
	
	@Query(value="select s.id,s.peoplename,c.animaltype from people s Inner Join Animal c ON s.favanimal=c.id",nativeQuery=true)
	List<Object[]> getone();
}
