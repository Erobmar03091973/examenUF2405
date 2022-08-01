package dao;

import java.util.List;

import modelo.Centro;
import modelo.Empleado;

public interface CentroDAO {

	List<Centro> getCentros();
	Centro getCentro(int codCentro);
	int eliminarCentro(int codcentro);
	int insertarCentro(Centro centro);
	int actualizarCentro(Centro centro);
	
}
