package com.roadmap.sh.AdvancedTodoAPI.repository;

import com.roadmap.sh.AdvancedTodoAPI.dto.TodoDto;
import com.roadmap.sh.AdvancedTodoAPI.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface TodoRepository extends JpaRepository<Todo, UUID> {

}
