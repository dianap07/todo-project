package org.todo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.todo.model.Todo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

@Service
public class TodoService {
    private static Logger logger = Logger.getLogger(TodoService.class.getName());

    public List<Todo> getMyTodoList() {
        List<Todo> todoList = new ArrayList<>();

        Todo todo = new Todo();
        todo.setId(1);
        todo.setTodoTitle("Test title");
        todo.setTodoDescription("Test Description");

        todoList.add(todo);
        return todoList;
    }

    public List<Todo> addItemToThelist() {
        List<Todo> todoList = new ArrayList<>();

        Todo todo = new Todo();
        todo.setId(1);
        todo.setTodoTitle("Test title2");
        todo.setTodoDescription("Test Description2");

        todoList.add(todo);
        return todoList;

    }

    public List<Todo> updateTodoId() {
        List<Todo> todoList = new ArrayList<>();

        Todo todo = new Todo();
        todo.setId(1);
        todo.setTodoTitle("Test title3");
        todo.setTodoDescription("Test Description3");

        todoList.add(todo);
        return todoList;

    }

    public List<Todo> deleteTodoId() {
        List<Todo> todoList = new ArrayList<>();

        Todo todo = new Todo();
        todo.setId(1);
        todo.setTodoTitle("Test title4");
        todo.setTodoDescription("Test Description4");

        todoList.add(todo);
        return todoList;

    }



//    public Optional<Todo> GetTodoByID(long todoId){
//        return todoRepository.findById(todoId);
//    }
//
//    public long AddItemToThelist(Todo todo){
//        long todoId=0;
//        todoRepository.save(todo);
//        todoId=todo.getTodoId();
//
//        return todoId;
//
//
//    }
//
//
//    public void DeleteItem(long id){
//        long itemId=0;
//        todoRepository.deleteById(id);
//        logger.info("Item removed from the list");
//    }
//
//    public long UpdateTodoItem(long todoId, Todo todo){
//
//        long updateTodoId=0;
//        //Retrieve the value you want to update
//        try {
//            Todo updatedTodo=todoRepository.findById(todoId).get();
//
//            updatedTodo.setTodoTitle(todo.getTodoTitle());
//            updatedTodo.setTodoDescription(todo.getTodoDescription());
//            updatedTodo.setTodoDate(todo.getTodoDate());
//            updatedTodo.setComplete(todo.isComplete());
//            todoRepository.save(updatedTodo);
//            updateTodoId=updatedTodo.getTodoId();
//            return updateTodoId;
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return updateTodoId;
//
//    }
//
//
//    public boolean isTodoItemIdValid(long todoId){
//        return todoRepository.findById(todoId).isPresent();
//    }
//
//
//    public long getNumberTodoItem(){
//        return todoRepository.count();
//    }


}
