package com.Transaccion.services;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Transaccion.model.transaccionfinal;
import com.Transaccion.repository.ServicioTransaccion;


@Service 
public class ServicioTransaction {
	@Autowired
	private ServicioTransaccion transacctionResporitory;
	
	public String create (transaccionfinal persona) {
		persona.setEstado((int)(Math.random()*3 + 1));
		transacctionResporitory.save(persona);
		String estado="En proceso";
		switch (persona.getEstado()) {
		case 1:
			estado="Aprobado";
			break;
		case 2:
			estado="Reprobado";
			break;
		case 3:
			estado="En proceso";
	break;

		
		}
		return estado;
	}
	
	public List<transaccionfinal> getAllPersonas (){
		return transacctionResporitory.findAll();
	}
//	@PersistenceContext
//	EntityManager em;
//	public  List<proveedores> getBancos(){
//		
//		TypedQuery<proveedores> query = em.createQuery("select b.id_banco,b.nombre_banco, from transaccionfinal  tr,bancos  b where b.id_banco=tr", proveedores.class);
//		
//	    List<proveedores> resultList = query.getResultList();
//	    return resultList;
//	}	
	}

