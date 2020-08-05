package com.chentsov.hw4.repositories;

import com.chentsov.hw4.entities.Product;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;
import java.util.Optional;

public interface ProductsPaginationRepository extends PagingAndSortingRepository<Product, Long> {
    List<Product> findAllByPriceGreaterThan(Long target);
    List<Product> findAllByPriceLessThan(Long target);
    List<Product> findAllByPriceBetween(Long floor, Long ceil);
    Optional<Product> findById(Long id);
}
