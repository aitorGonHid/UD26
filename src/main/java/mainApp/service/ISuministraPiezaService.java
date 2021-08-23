package mainApp.service;

import java.util.List;

import mainApp.dto.SuministraPieza;

public interface ISuministraPiezaService {
	
	//Metodos del crud
	public List<SuministraPieza> listarSuministraPieza();
	
	public SuministraPieza guardarSuministraPieza(SuministraPieza suministraPieza);
	
	public SuministraPieza suministraPiezaXID(int id);
	
	public SuministraPieza actualizarSuministraPieza(SuministraPieza suministraPieza);
	
	public void eliminarSuministraPieza(int id);
	
	public List<SuministraPieza> listarXPrecio(Double precio);
	
}
