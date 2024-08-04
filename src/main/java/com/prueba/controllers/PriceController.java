package com.prueba.controllers;

import java.sql.Timestamp;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.prueba.models.Price;
import com.prueba.services.PriceServiceImpl;

@RestController
public class PriceController {

	@Autowired
	public PriceServiceImpl priceService;
	
	//Llamada de ejemplo http://localhost:8080/getPrice?fecha=2020-06-14%2021:00:00&productId=35455&brandId=1
	@GetMapping("/getPrice")
    public String getPrice(@RequestParam String fecha, @RequestParam String productId, @RequestParam String brandId) {
		
		Optional<Price> price = priceService.recuperarPrecios(Timestamp.valueOf(fecha), Integer.parseInt(brandId), Integer.parseInt(productId));
        
        if (price.isPresent()) {
            return "Peecio: " + price.get().getPrice() + " " + price.get().getCurr();
        } else {
            return "Precio no encontrado";
        }
	}        
}
