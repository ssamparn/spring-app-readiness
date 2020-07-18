package com.actuator.springappreadiness.converter;

import com.actuator.springappreadiness.entity.ToDoItemEntity;
import com.actuator.springappreadiness.model.ToDoItem;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class ToDoItemConverter implements Converter<ToDoItemEntity, ToDoItem> {

    @Override
    public ToDoItem convert(ToDoItemEntity itemEntity) {
        return new ToDoItem(itemEntity.getItem(), itemEntity.isComplete());
    }
}
