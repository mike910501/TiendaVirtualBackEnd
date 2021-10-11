package tiendavirtual.DAO;

import java.util.ArrayList;
import java.util.Collection;

import javax.swing.JOptionPane;

import tiendavirtual.DAO.*;
import tiendavirtual.DTO.Estudiante;
import java.sql.*;

//Aquí crearemos los meotodos listar y registrar estudiantes
public class EstudianteDAO {
	//Aquí permite consultar a los estudiantes
	
	public ArrayList <Estudiante> listaDeEstudiantes(){
		ArrayList<Estudiante> misEstudiantes = new ArrayList<Estudiante>();
		conexion Conex = new conexion();
		try {
			PreparedStatement consulta = Conex.getConnection().prepareStatement("SELECT * FROM usuarios");	
			ResultSet res = consulta.executeQuery();
			while(res.next()) {
				int cedula_usuario= Integer.parseInt(res.getString("cedula_usuario"));
				String email_usuario= res.getString("email_usuario");
				String nombre_usuario= res.getString("nombre_uruario");
				String password=res.getNString("password");
				String usuario=res.getNString("usuario");
				
				Estudiante persona = new Estudiante (cedula_usuario, email_usuario, nombre_usuario, password, usuario);
				
			}
					res.close();
					consulta.close();
					Conex.desconectar();
			}
		catch(Exception e) {
			JOptionPane.showMessageDialog(null, "No se puedo consultar"+ e);
		}
		return misEstudiantes;
	}
	public Estudiante registrarEstudiante(Estudiante persona) {
		
	
		conexion conex = new conexion();
		
		try {
			Statement estatuto= conex.getConnection().createStatement();
			estatuto.executeUpdate("INSET INTO usuarios VALUES ('" + persona.getCedula_usuario() + "' , '" + persona.getEmail_usuario() 
									+ "' , '" + persona.getNombre_usuario() + "' , '" 
									+ persona.getPassword()+ "' , '" + persona.getUsuario() +"' )");
			estatuto.close();
			conex.desconectar();
		}catch(SQLException e) {
			persona=null;
			System.out.print(e.getMessage());
		}
		return persona;
	}
}