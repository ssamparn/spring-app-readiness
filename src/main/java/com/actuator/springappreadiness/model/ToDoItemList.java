package com.actuator.springappreadiness.model;

import lombok.Data;
import lombok.AllArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
public class ToDoItemList {

    private final String name;
    private final List<ToDoItem> items;

}
