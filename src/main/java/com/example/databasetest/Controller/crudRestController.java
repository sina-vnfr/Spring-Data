package com.example.databasetest.Controller;

import com.example.databasetest.Repos.studentsRepository;
import com.example.databasetest.entity.students;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class crudRestController {

    @Autowired
    studentsRepository sturep;

    @GetMapping(value = "/allstudents")
    public List<students> getAllStudentsData(){
        return sturep.findAll();
    }

    @PostMapping(value = "/createRecord")
    public students createUser(@RequestBody students stu){
        return sturep.save(stu);
    }

}
