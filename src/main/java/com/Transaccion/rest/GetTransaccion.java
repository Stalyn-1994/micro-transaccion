package com.Transaccion.rest;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.Transaccion.model.transaccionfinal;
import com.Transaccion.services.ServicioTransaction;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
@RequestMapping(path="/")
public class GetTransaccion {
	
	@Autowired
	private ServicioTransaction servicio;

	@GetMapping
	private ResponseEntity<List<transaccionfinal>> listarTransacciones (){	
			return ResponseEntity.ok(servicio.getAllPersonas());			
	}

	
	@PostMapping
	private String guardarTransacciones (@RequestBody transaccionfinal persona){	
		
		String temporal = servicio.create(persona);
		try {
			
			return temporal;				
			
		}catch (Exception e) {
			return null;
		}
	}


	// @GetMapping(path="/new-endpoint")
	// private String newEndpoint (){	
	// 		return "Hi Everyone";			
	// }
	
}
