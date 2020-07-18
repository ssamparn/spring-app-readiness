package com.actuator.springappreadiness.web.controller;

import java.util.List;
import lombok.RequiredArgsConstructor;
import com.actuator.springappreadiness.model.ToDoItemList;
import com.actuator.springappreadiness.service.ToDoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/todo")
public class ToDoController {

    private final ToDoService toDoService;

    @GetMapping("/lists")
    public List<ToDoItemList> getToDoLists() {
        return toDoService.getToDoLists();
    }
}
