package tiendavirtual.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*aqui conectaremos a la base de datos
 * en local con mysql y dejaremos comentariada la conexion con mia db aws
 * */
public class conexion {
	static String bd="tiendagenerica";
	static String login="root";
	static String password="Maikolpower01";
	static String url="jdbc:mysql://localhost:3306";
	
	/*static String bd="tiendagenerica";
	 * static String login="admin";
	 * static String password="xxxxx";
	 * static String url="jdbc:mariadb//nombre de direccion que se me haya otrogado";
	 * 
	 * */
	Connection connection = null;
	//Contructo a la base de datos
	public conexion() {
		try {
			//aqio obtenemos el driver mysql
			Class.forName("com.mysql.cj.jdbc.Driver");
			//Class.forname(org.mariadb.jdbc.Driver);
			//Obteniendo la conexion
			connection=DriverManager.getConnection(url, login, password);
			if(connection !=null) {
				
				System.out.println("Conexion a la base de datos "+bd + "ok\n");
			}
			
		}catch(SQLException e) {
			System.out.println(e);
		}catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	//Retorneme la conexion
	public Connection getConnection() {
		return connection;
	}
	//Aqui metodo para descoenctar a la base de datos
	public void desconectar() {
		connection=null;
		
	}
}
