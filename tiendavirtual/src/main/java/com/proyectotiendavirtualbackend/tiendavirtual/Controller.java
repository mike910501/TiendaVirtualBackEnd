package com.proyectotiendavirtualbackend.tiendavirtual;
import java.util.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;
import tiendavirtual.DAO.*;
import tiendavirtual.DTO.*;

//Aquí crearemos el control de la tienda
@RestController
public class Controller {
	//Aquí permite consultar la lista de estudiantes
	@RequestMapping("/listarEstudiantes")
	public ArrayList<Estudiante> listaDeEstudiantes(){
		EstudianteDAO objDAO=new EstudianteDAO();
		return objDAO.listaDeEstudiantes();
	}
	@PostMapping("/resgistrarEstudiante")
	public Estudiante registrarEstudiante(@RequestBody Estudiante persona) {
		EstudianteDAO dao =new EstudianteDAO();
		return dao.registrarEstudiante(persona);
	}
}
