package com.mongo.service.impl;

import com.mongo.dao.IEmpleadoDao;
import com.mongo.model.Empleado;
import com.mongo.service.IEmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpleadoServiceImpl implements IEmpleadoService {

    @Autowired
    private IEmpleadoDao iEmpleadoDao;

    @Override
    public List<Empleado> buscar() {
        return null;
    }

    @Override
    public Empleado buscarPorId(String id) {
        return null;
    }

    @Override
    public Empleado guardar(Empleado empleado) {
        return null;
    }

    @Override
    public void eliminar(String id) {

    }
}
