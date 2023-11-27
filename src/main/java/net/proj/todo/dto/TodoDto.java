package net.proj.todo.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class TodoDto {

    private Long Id;
    private String title;
    private String description;
    private boolean completed;
}
