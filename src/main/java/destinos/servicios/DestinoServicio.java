package destinos.servicios;

import java.util.List;

import destinos.modelo.Destino;

public interface DestinoServicio {
	
	public List<Destino> listarDestino();
	
	public Destino crearDestino(Destino destino);
	
	public Destino editarDestino(Destino destino);
	
	public Destino buscarDestino(int Id_Destino);
	
	public void eliminarDestino(int Id_Destino);
	
}
