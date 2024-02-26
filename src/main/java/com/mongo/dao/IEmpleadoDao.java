package com.mongo.dao;

import com.mongo.model.Empleado;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IEmpleadoDao extends MongoRepository<Empleado, String> {



}
