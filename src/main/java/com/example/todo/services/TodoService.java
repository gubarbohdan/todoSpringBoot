package com.example.todo.services;

import com.example.todo.entities.Todo;
import com.example.todo.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {

    private TodoRepository todoRepository;

    @Autowired
    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public List<Todo> getAllTodos() {
        return todoRepository.findAll();
    }

    public Todo saveTodo(Todo todo) {
        return todoRepository.save(todo);
    }

    public Todo getTodoById(Long id) {
        return todoRepository.findOne(id);
    }

    public List<Todo> getTodoListByStatus(boolean status) {
        return todoRepository.findByStatus(status);
    }

    public void deleteTodoById(Long id) {
        todoRepository.delete(id);
    }

    public Todo toogleTodoStatusById(Long id) {
        Todo todo = getTodoById(id);
        todo.setStatus(!todo.isStatus());
        return todoRepository.save(todo);
    }
}
