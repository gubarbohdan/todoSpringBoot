package com.example.todo.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Todo {

    @Id
    @GeneratedValue
    private Long id;
    private String description;
    private boolean status;
}
