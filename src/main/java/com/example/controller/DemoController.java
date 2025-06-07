package com.example.controller;

import com.example.entity.Todo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class DemoController {

    @GetMapping("/todos")  // Add this to expose it via URL
    public ModelAndView getTodos() {
        ModelAndView modelAndView = new ModelAndView("soumita"); // soumita.html in templates

        List<Todo> lst = new ArrayList<>();
        lst.add(new Todo("Learn Spring MVC", "Understand how MVC works in Spring", true));
        lst.add(new Todo("Build Todo App", "Create an app to manage todos", false));
        lst.add(new Todo("Test the app", "Check if the todo list displays properly", false));

        modelAndView.addObject("todos", lst);
        return modelAndView;
    }
}
