package mainApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mainApp.dao.ISuministraPiezaDao;
import mainApp.dto.SuministraPieza;

@Service
public class SuministraPiezaServiceImpl implements ISuministraPiezaService {
	
	@Autowired
	ISuministraPiezaDao iSuministraPiezaDao;
	
	
	@Override
	public List<SuministraPieza> listarSuministraPieza() {
		
		return iSuministraPiezaDao.findAll();
	}

	@Override
	public SuministraPieza guardarSuministraPieza(SuministraPieza suministraPieza) {
		
		return iSuministraPiezaDao.save(suministraPieza);
	}

	@Override
	public SuministraPieza suministraPiezaXID(int id) {
		
		return iSuministraPiezaDao.findById(id).get();
	}

	@Override
	public SuministraPieza actualizarSuministraPieza(SuministraPieza suministraPieza) {
		
		return iSuministraPiezaDao.save(suministraPieza);
	}

	@Override
	public void eliminarSuministraPieza(int id) {
		
		iSuministraPiezaDao.deleteById(id);
	}

}
