package com.roadmap.sh.AdvancedTodoAPI.service;

import com.roadmap.sh.AdvancedTodoAPI.dto.TodoDto;

import java.util.List;
import java.util.UUID;

public interface TodoService {
     List<TodoDto> getAll();
     TodoDto getById(UUID id);
     boolean update(UUID id, TodoDto todoDto);
     boolean delete(UUID id);
    boolean create(TodoDto todoDto);
}
