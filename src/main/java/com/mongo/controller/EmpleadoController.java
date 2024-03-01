package com.mongo.controller;

import com.mongo.service.IEmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmpleadoController {

    @Autowired
    private IEmpleadoService iEmpleadoService;

    @GetMapping
    @RequestMapping("/")
    public String index(Model model){
        model.addAttribute("list", iEmpleadoService.buscar());
        return "index";
    }


}
