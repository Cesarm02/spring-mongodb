package com.mongo.controller;

import com.mongo.service.IEmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class EmpleadoController {

    @Autowired
    private IEmpleadoService iEmpleadoService;



}
