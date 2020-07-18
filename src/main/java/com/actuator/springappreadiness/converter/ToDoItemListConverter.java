package com.actuator.springappreadiness.converter;

import java.util.List;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import com.actuator.springappreadiness.entity.ToDoItemListEntity;
import com.actuator.springappreadiness.model.ToDoItem;
import com.actuator.springappreadiness.model.ToDoItemList;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ToDoItemListConverter implements Converter<ToDoItemListEntity, ToDoItemList> {

    private final ToDoItemConverter converter;

    @Override
    public ToDoItemList convert(ToDoItemListEntity toDoItemListEntity) {

        final List<ToDoItem> toDoItems = toDoItemListEntity.getItems().stream()
                .map(converter::convert)
                .collect(Collectors.toList());

        return new ToDoItemList(toDoItemListEntity.getName(), toDoItems);
    }
}
