package com.roadmap.sh.AdvancedTodoAPI.dto;


import com.roadmap.sh.AdvancedTodoAPI.entity.BaseEntity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
@Data
public class TodoDto {
        private UUID id;
        private String title;
        private String description;
}
