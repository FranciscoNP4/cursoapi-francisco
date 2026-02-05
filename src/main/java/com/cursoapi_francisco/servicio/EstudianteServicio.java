package com.cursoapi_francisco.servicio;

import com.cursoapi_francisco.model.Estudiante;
import java.util.List;
import com.cursoapi_francisco.repositorio.EstudianteRepositorio;
import org.springframework.stereotype.Service;
@Service
public class EstudianteServicio {
 private final EstudianteRepositorio estudianteRepositorio;

 public EstudianteServicio(EstudianteRepositorio estudianteRepositorio){
     this.estudianteRepositorio =estudianteRepositorio;
 }
public List<Estudiante> buscarTodos(){
    return estudianteRepositorio.buscarTodo();
}

}
