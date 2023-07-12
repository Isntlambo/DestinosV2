package destinos.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "destino")
public class Destino {
	
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private	int Id_Destino;
	@Column
	private int Nro_Aeropuerto;
	@Column
	private String Ciudad;
	@Column
	private String Cod_Ciudad;
	@Column
	private int estado;
	public int getId_Destino() {
		return Id_Destino;
	}
	public void setId_Destino(int id_Destino) {
		Id_Destino = id_Destino;
	}
	public int getNro_Aeropuerto() {
		return Nro_Aeropuerto;
	}
	public void setNro_Aeropuerto(int nro_Aeropuerto) {
		Nro_Aeropuerto = nro_Aeropuerto;
	}
	public String getCiudad() {
		return Ciudad;
	}
	public void setCiudad(String ciudad) {
		Ciudad = ciudad;
	}
	public String getCod_Ciudad() {
		return Cod_Ciudad;
	}
	public void setCod_Ciudad(String cod_Ciudad) {
		Cod_Ciudad = cod_Ciudad;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
	
	

}