package com.sara.servicios;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.sara.entities.Pedido;
import com.sara.entities.Producto;


@Service
@Qualifier("insular")
public class ServiceInsular implements IService{
	
	@Override
	public Double calcularIva(Pedido pedido) {
		
		Double precioTotal = 0.0;
		for(Producto producto : pedido.getProductos()) {
		
			precioTotal += producto.getPvd();
		}
		
		return precioTotal*1.04;
		
	}
	
}
