package com.example.todo.controllers;

import com.example.todo.entities.Todo;
import com.example.todo.services.TodoService;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TodoControllerTest {

    @Autowired
    private TodoService todoService;
    private Todo todo;

    @Before
    public void setUp() {
        todo = new Todo();
        todo.setDescription("Test1");
        todo.setStatus(false);
        todoService.saveTodo(todo);
    }

    @Test
    public void getTodoList() {
    }

    @Test
    public void saveTodo() {
        todoService.saveTodo(todo);
        assertEquals(2, todoService.getAllTodos().size());
    }

    @Test
    public void getTodoById() {
    }

    @Test
    public void getTodoListByStatus() {
    }

    @Test
    public void deleteTodoById() {
    }

    @Test
    public void updateStatusById() {
    }
}