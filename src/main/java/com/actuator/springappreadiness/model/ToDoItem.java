package com.actuator.springappreadiness.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ToDoItem {

    private final String value;
    private final boolean complete;

}
