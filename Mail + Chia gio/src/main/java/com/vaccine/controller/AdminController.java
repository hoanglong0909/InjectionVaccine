package com.vaccine.controller;


import com.vaccine.model.User;
import com.vaccine.service.user.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping(value = "/admin", produces = "application/x-www-form-urlencoded;charset=UTF-8")
public class AdminController {

    @Autowired
    IUserService userService;


    @GetMapping
    public ModelAndView showForm() {
        ModelAndView modelAndView = new ModelAndView("/admin/ListVaccine");
        List<User> userList = userService.getUserListIsDone("01-08-2021 ");
        modelAndView.addObject("userList", userList);
        return modelAndView;
    }






}

