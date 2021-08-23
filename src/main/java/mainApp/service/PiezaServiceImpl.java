package mainApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mainApp.dao.IPiezaDao;
import mainApp.dto.Pieza;

@Service
public class PiezaServiceImpl implements IPiezaService {

	@Autowired
	IPiezaDao iPiezaDao;
	
	@Override
	public List<Pieza> listarPiezas() {
		
		return iPiezaDao.findAll();
	}

	@Override
	public Pieza guardarPieza(Pieza pieza) {
		
		return iPiezaDao.save(pieza);
	}

	@Override
	public Pieza piezaXID(int id) {
		
		return iPiezaDao.findById(id).get();
	}

	@Override
	public Pieza actualizarPieza(Pieza pieza) {
		
		return iPiezaDao.save(pieza);
	}

	@Override
	public void eliminarPieza(int id) {
		
		iPiezaDao.deleteById(id);
	}

}
