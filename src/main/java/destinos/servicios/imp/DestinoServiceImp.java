package destinos.servicios.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import destinos.repositorio.DestinoRepositorio;
import destinos.servicios.DestinoServicio;
import destinos.modelo.Destino;

@Service

public class DestinoServiceImp implements DestinoServicio{
	
	@Autowired
	private DestinoRepositorio repositorio;
	
	@Override
	public List<Destino> listarDestino() {
		
		return (List<Destino>) repositorio.findAll();
	}

	@Override
	public Destino crearDestino(Destino destino) {
		destino.setId_Destino(destino.getId_Destino());
		return repositorio.save(destino);
	}

	@Override
	public Destino editarDestino(Destino destino) {
		
		return repositorio.save(destino);
	}

	@Override
	public Destino buscarDestino(int Id_Destino) {
		
		return repositorio.findById(Id_Destino).get();
	}

	@Override
	public void eliminarDestino(int Id_Destino) {
		repositorio.deleteById(Id_Destino);
		
	}
	
}
