package com.cursoapi_francisco.controlador1;
import com.cursoapi_francisco.model.Estudiante;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/estudiantes")
public class EstudianteControlador {

    @GetMapping
    public String getEstudiante(){
        return "Hola estudiantes";
    }

    @PostMapping
    public ResponseEntity<String> postEstudiante(@RequestBody Estudiante estudiante){
        return new ResponseEntity<> ("Hola nuevo estudiante" +estudiante.getNombre(), HttpStatus.CREATED);
    }

    @DeleteMapping("{matricula}")
    public String deleteEstudiante(@PathVariable String matricula){
        return "Hola estudiante eliminado";
    }
}
