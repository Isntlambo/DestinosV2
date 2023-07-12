package destinos.controller;

import java.util.List;

import org.apache.catalina.connector.Response;
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

import destinos.modelo.Destino;
import destinos.servicios.imp.DestinoServiceImp;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class DestinoController {
	
	@Autowired
	private DestinoServiceImp service;
	
	@GetMapping("api/destino")
	@CrossOrigin(origins = "http://localhost:4200")
	public ResponseEntity<?> listarDestino(){
		List<Destino> listaDestino=service.listarDestino();
		return ResponseEntity.ok(listaDestino);
	}
	
	@PostMapping("api/destino")
	@CrossOrigin(origins = "http://localhost:4200")
	public ResponseEntity<?> crearDestino(@RequestBody Destino destino){
		try {
			Destino destinoCreado = service.crearDestino(destino);
			return ResponseEntity.status(HttpStatus.CREATED).body(destinoCreado);
		} catch (Exception ex) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Ocurrió un error al crear el destino.");
		}
	}
	
	@PutMapping("api/destino")
	@CrossOrigin(origins = "http://localhost:4200")
	public ResponseEntity<?> editarDestino(@RequestBody Destino destino){
		try {
			Destino destinoEditado = service.editarDestino(destino);
			return ResponseEntity.status(HttpStatus.CREATED).body(destinoEditado);
		} catch (Exception ex) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Ocurrio un error al editar el destino.");
		}
	}
	
	@GetMapping("api/destino/{id_Destinos}")
	@CrossOrigin(origins = "http://localhost:4200")
	public ResponseEntity<?> buscarDestino(@PathVariable int Id_Destino){
		Destino destino=service.buscarDestino(Id_Destino);
		return ResponseEntity.ok(destino);
	}
	@DeleteMapping("api/destino/{id_Destinos}")
	@CrossOrigin(origins = "http://localhost:4200")
	public ResponseEntity<?> eliminarDestino(@PathVariable int Id_Destino){
		service.eliminarDestino(Id_Destino);
		return ResponseEntity.ok().build();
	}
	
}
