package com.cursoapi_francisco.repositorio;
import com.cursoapi_francisco.model.Estudiante;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EstudianteRepositorio {
    private final List<Estudiante> estudiantes = new ArrayList<>(
            List.of(
                    new Estudiante("max", "garcia", 12345,19),
                    new Estudiante("Manuel", "Riveros",6719, 20),
                    new Estudiante("Mariana", "Flores",6739, 19)
            )
    );

    public List<Estudiante> buscarTodo(){
        return estudiantes;
    }

}
