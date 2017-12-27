package com.example.todo.controllers;

import com.example.todo.entities.Todo;
import com.example.todo.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TodoController {

    private TodoService todoService;

    @Autowired
    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping(value = "/todos")
    public List<Todo> getTodoList() {
        return todoService.getAllTodos();
    }

    @PostMapping(value = "/todo")
    public Todo saveTodo(@RequestBody Todo todo) {
        return todoService.saveTodo(todo);
    }

    @GetMapping(value = "/todo/{id}")
    public Todo getTodoById(@PathVariable("id") Long id) {
        return todoService.getTodoById(id);
    }

    @GetMapping(value = "/todos/{status}")
    public List<Todo> getTodoListByStatus(@PathVariable("status") boolean status) {
        return todoService.getTodoListByStatus(status);
    }

    @DeleteMapping(value = "/todo/{id}")
    public void deleteTodoById(@PathVariable("id") Long id) {
        todoService.deleteTodoById(id);
    }

    @PutMapping(value = "/todo/{id}")
    public Todo updateStatusById(@PathVariable("id") Long id) {
        return todoService.toogleTodoStatusById(id);
    }
 }
