package com.actuator.springappreadiness.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "TODO_ITEM")
public class ToDoItemEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TODO_ITEM_ID")
    private Long id;

    @Column(nullable = false)
    private String item;

    @Column(nullable = false)
    private boolean complete;

    @ManyToOne
    @JoinColumn(name = "TODO_LIST_ID", insertable = false, updatable = false)
    private ToDoItemListEntity toDoItemListEntity;

}
