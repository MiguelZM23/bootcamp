package com.example.ioc;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Component
@Service
public class ServicioImpl implements Servicio {
	private Dependencia dependencia;
	
		
@Override
public void run() {
	System.out.println("Soy el servicio");
}

}