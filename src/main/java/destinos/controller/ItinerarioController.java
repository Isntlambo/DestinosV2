package destinos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import destinos.modelo.Itinerario;
import destinos.servicios.imp.ItinerarioServiceImp;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class ItinerarioController {

	@Autowired
	private ItinerarioServiceImp service;
	
	@GetMapping("api/itinerario")
	@CrossOrigin(origins = "http://localhost:4200")
	public ResponseEntity<?> listarItinerario(){
		List<Itinerario> listarItinerario=service.listarItinerario();
		return ResponseEntity.ok(listarItinerario);
	}
	
	
	@PostMapping("api/itinerario")
	@CrossOrigin(origins = "http://localhost:4200")
	public ResponseEntity<?> crearItinerario(@RequestBody Itinerario itinerario){
		Itinerario itinerarioCreado=service.crearItinerario(itinerario);
		return ResponseEntity.status(HttpStatus.CREATED).body(itinerarioCreado);
	}
	
	@PutMapping("api/itinerario")
	@CrossOrigin(origins = "http://localhost:4200")
	public ResponseEntity<?> editarItinerario(@RequestBody Itinerario itinerario){
		Itinerario editarItinerario=service.editarItinerario(itinerario);
		return ResponseEntity.status(HttpStatus.CREATED).body(editarItinerario);
	}
	
	@GetMapping("api/itinerario/{id_Itinerario}")
	@CrossOrigin(origins = "http://localhost:4200")
	public ResponseEntity<?> buscarItinerario(@PathVariable int Id_Itinerario){
		Itinerario itinerario=service.buscarItinerario(Id_Itinerario);
		return ResponseEntity.ok(itinerario);
	}
	
	@DeleteMapping("api/itinerario/{id_Itinerario}")
	@CrossOrigin(origins = "http://localhost:4200")
	public ResponseEntity<?> eliminarItinerario(@PathVariable int Id_Itinerario){
		service.eliminarItinerario(Id_Itinerario);
		return ResponseEntity.ok().build();
	}
	
}
