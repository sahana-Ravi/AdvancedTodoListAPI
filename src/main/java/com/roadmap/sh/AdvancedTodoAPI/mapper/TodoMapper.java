package com.roadmap.sh.AdvancedTodoAPI.mapper;


import com.roadmap.sh.AdvancedTodoAPI.dto.TodoDto;
import com.roadmap.sh.AdvancedTodoAPI.entity.Todo;
import org.springframework.stereotype.Component;

@Component
public class TodoMapper {
    public TodoDto toDto(Todo todo){
        TodoDto todoDto = new TodoDto();
        todoDto.setId(todo.getId());
        todoDto.setTitle(todo.getTitle());
        todoDto.setDescription(todo.getDescription());
        return todoDto;
    }
    public Todo toEntity(TodoDto todoDto){
        Todo todo = new Todo();
        todo.setTitle(todoDto.getTitle());
        todo.setDescription(todoDto.getDescription());
        return todo;
    }
}
