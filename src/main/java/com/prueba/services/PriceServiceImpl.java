package com.prueba.services;

import java.sql.Timestamp;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.models.Price;
import com.prueba.repositories.PriceRepository;

@Service
public class PriceServiceImpl implements PriceService {

	@Autowired
	private PriceRepository repository;
	
	@Override
	public Optional<Price> recuperarPrecios(Timestamp fecha, int productId, int brandId) {
		return repository.findByStartDateAndEndDateAndProductIdAndBrandId(fecha, fecha, brandId, productId);
	}

}
