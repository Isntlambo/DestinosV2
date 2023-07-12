package destinos.modelo;

import java.sql.Date;
import java.sql.Time;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Itinerario")
public class Itinerario {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int Id_Itinerario;
	
	@Column
	private Date Dia_Vuelo;
	
	@Column 
	private Time Hora_Despegue;
	
	@Column
	private Time Hora_Llegada;
	
	@Column
	private Boolean Servicio;
	
	@Column
	private Date Dia_Retorno;
	
	@Column
	private int Estado;

	public int getId_Itinerario() {
		return Id_Itinerario;
	}

	public void setId_Itinerario(int id_Itinerario) {
		Id_Itinerario = id_Itinerario;
	}

	public Date getDia_Vuelo() {
		return Dia_Vuelo;
	}

	public void setDia_Vuelo(Date dia_Vuelo) {
		Dia_Vuelo = dia_Vuelo;
	}

	public Time getHora_Despegue() {
		return Hora_Despegue;
	}

	public void setHora_Despegue(Time hora_Despegue) {
		Hora_Despegue = hora_Despegue;
	}

	public Time getHora_Llegada() {
		return Hora_Llegada;
	}

	public void setHora_Llegada(Time hora_Llegada) {
		Hora_Llegada = hora_Llegada;
	}

	public Boolean getServicio() {
		return Servicio;
	}

	public void setServicio(Boolean servicio) {
		Servicio = servicio;
	}

	public Date getDia_Retorno() {
		return Dia_Retorno;
	}

	public void setDia_Retorno(Date dia_Retorno) {
		Dia_Retorno = dia_Retorno;
	}

	public int getEstado() {
		return Estado;
	}

	public void setEstado(int estado) {
		Estado = estado;
	}
}
