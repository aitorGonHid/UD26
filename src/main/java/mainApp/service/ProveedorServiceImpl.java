package mainApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mainApp.dao.IProveedorDao;
import mainApp.dto.Proveedor;

@Service
public class ProveedorServiceImpl implements IProveedorService {

	@Autowired
	IProveedorDao iProveedorDao;
	
	@Override
	public List<Proveedor> listarProveedores() {
		
		return iProveedorDao.findAll();
	}

	@Override
	public Proveedor guardarProveedor(Proveedor proveedor) {
		
		return iProveedorDao.save(proveedor);
	}

	@Override
	public Proveedor proveedorXID(int id) {
		
		return iProveedorDao.findById(id).get();
	}

	@Override
	public Proveedor actualizarProveedor(Proveedor proveedor) {
		
		return iProveedorDao.save(proveedor);
	}

	@Override
	public void eliminarProveedor(int id) {
		
		iProveedorDao.deleteById(id);
	}

}
