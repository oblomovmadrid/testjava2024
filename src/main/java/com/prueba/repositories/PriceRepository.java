package com.prueba.repositories;

import java.sql.Timestamp;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.prueba.models.Price;

@Repository
public interface PriceRepository extends CrudRepository<Price, Integer>{

	@Query("select c from Price c where c.startDate <= ?1 and c.endDate >= ?2 and c.productId = ?3 and c.brandId = ?4 order by c.priority desc limit 1")
    Optional<Price> findByStartDateAndEndDateAndProductIdAndBrandId(Timestamp startDate, Timestamp endDate, int productId, int brandId);
}
