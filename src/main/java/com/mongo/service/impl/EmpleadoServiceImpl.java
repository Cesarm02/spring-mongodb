package com.mongo.service.impl;

import com.mongo.dao.IEmpleadoDao;
import com.mongo.model.Empleado;
import com.mongo.service.IEmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpleadoServiceImpl implements IEmpleadoService {

    @Autowired
    private IEmpleadoDao iEmpleadoDao;

    @Override
    public List<Empleado> buscar() {
        return iEmpleadoDao.findAll();
    }

    @Override
    public Empleado buscarPorId(String id) {
        Optional<Empleado> response = iEmpleadoDao.findById(id);
        if(response.isPresent()){
            return response.get();
        }
        return null;
    }

    @Override
    public Empleado guardar(Empleado empleado) {
        return iEmpleadoDao.save(empleado);
    }

    @Override
    public void eliminar(String id) {
        iEmpleadoDao.deleteById(id);
    }
}
