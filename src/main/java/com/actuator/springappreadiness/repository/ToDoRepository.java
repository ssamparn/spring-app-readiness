package com.actuator.springappreadiness.repository;

import com.actuator.springappreadiness.entity.ToDoItemListEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToDoRepository extends JpaRepository<ToDoItemListEntity, Long> {

}
