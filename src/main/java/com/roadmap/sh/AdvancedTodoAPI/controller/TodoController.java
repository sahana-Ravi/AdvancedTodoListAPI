package com.roadmap.sh.AdvancedTodoAPI.controller;


import com.roadmap.sh.AdvancedTodoAPI.dto.TodoDto;
import com.roadmap.sh.AdvancedTodoAPI.service.TodoService;
import com.roadmap.sh.AdvancedTodoAPI.service.TodoServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;



@AllArgsConstructor
@RestController
@RequestMapping(path="/api", produces = {MediaType.APPLICATION_JSON_VALUE})
public class TodoController {
    @Autowired
    private TodoServiceImpl todoService;

    @GetMapping(value="/getAll")
    public ResponseEntity<List<TodoDto>> getAll(){
        return  ResponseEntity.ok(todoService.getAll());
    }
    @GetMapping(value="/get")
    public ResponseEntity<TodoDto> get(@RequestParam UUID id){
       return ResponseEntity.ok(todoService.getById(id));
    }

    @PostMapping(value="/add")
    public ResponseEntity<String> create(@RequestBody TodoDto todoDto){
        boolean isCreated = todoService.create(todoDto);
        if(isCreated) {
            return ResponseEntity
                    .status(HttpStatus.CREATED)
                    .body("Created Successfully");

        }
        return ResponseEntity.status(HttpStatus.CONFLICT).build();
    }
    @PutMapping(value="/update")
    public ResponseEntity<String> update(@RequestParam UUID id, @RequestBody TodoDto todoDto){
        boolean isUpdated = todoService.update(id,todoDto);
        if(isUpdated){
            return ResponseEntity.ok("Updated");
        }
        return ResponseEntity.notFound().build();
    }
    @DeleteMapping(value="/delete")
    public ResponseEntity<String> delete(@RequestParam UUID id){
        boolean isDeleted = todoService.delete(id);
        if(isDeleted){
            return ResponseEntity.ok("Deleted");
        }
        return ResponseEntity.notFound().build();
    }
}

