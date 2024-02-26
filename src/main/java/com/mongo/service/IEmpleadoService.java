package com.mongo.service;

import com.mongo.model.Empleado;
import org.springframework.stereotype.Service;

import java.util.List;

public interface IEmpleadoService {

    List<Empleado> buscar();
    Empleado buscarPorId(String id);
    Empleado guardar(Empleado empleado);
    void eliminar(String id);

}
