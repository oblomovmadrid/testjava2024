package com.prueba.services;

import java.sql.Timestamp;
import java.util.Optional;

import com.prueba.models.Price;

public interface PriceService {

	Optional<Price> recuperarPrecios(Timestamp fecha, int productId, int brandId);
}
