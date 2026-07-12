package com.roadmap.sh.AdvancedTodoAPI.service;


import com.roadmap.sh.AdvancedTodoAPI.dto.TodoDto;
import com.roadmap.sh.AdvancedTodoAPI.entity.Todo;
import com.roadmap.sh.AdvancedTodoAPI.mapper.TodoMapper;
import com.roadmap.sh.AdvancedTodoAPI.repository.TodoRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


@AllArgsConstructor
@Service
public class TodoServiceImpl implements TodoService {

    @Autowired
    TodoRepository todoRepository;
    @Autowired
    TodoMapper todoMapper;

    @Override
    public List<TodoDto> getAll() {
       List<Todo> todos = todoRepository.findAll();
       List<TodoDto> todoDtos = new ArrayList<>();
       for(Todo todo:todos){
           TodoDto dto = todoMapper.toDto(todo);
           todoDtos.add(dto);
       }
       return todoDtos;
    }

    @Override
    public TodoDto getById(UUID id) {
        Todo todo = todoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Todo not found with id: " + id));
        return todoMapper.toDto(todo);
    }

    @Override
    public boolean update(UUID id, TodoDto todoDto) {
        boolean isUpdate=false;
        Todo todo = todoRepository.findById(id).orElseThrow(()-> new RuntimeException("Todo not found with id: " + id));
        todo.setTitle(todoDto.getTitle());
        todo.setDescription(todoDto.getDescription());
        todoRepository.save(todo);
        isUpdate=true;
        return isUpdate;
    }

    @Override
    public boolean delete(UUID id) {
       boolean isDelete=false;
       Todo todo = todoRepository.findById(id).orElseThrow(()-> new RuntimeException("Todo not found with id: " + id));
       todoRepository.delete(todo);
       isDelete=true;
       return isDelete;
    }

    @Override
    public boolean create(TodoDto todoDto) {
        Todo todo = todoMapper.toEntity(todoDto);
        todoRepository.save(todo);
        return true;
    }
}
