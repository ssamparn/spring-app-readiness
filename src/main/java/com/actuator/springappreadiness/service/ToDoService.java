package com.actuator.springappreadiness.service;

import com.actuator.springappreadiness.converter.ToDoItemListConverter;
import com.actuator.springappreadiness.model.ToDoItemList;
import com.actuator.springappreadiness.repository.ToDoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
@RequiredArgsConstructor
public class ToDoService {

    private final ToDoItemListConverter converter;
    private final ToDoRepository repository;

    public List<ToDoItemList> getToDoLists() {
        return StreamSupport
                .stream(repository.findAll().spliterator(), false)
                .map(converter::convert)
                .collect(Collectors.toList());
    }
}
