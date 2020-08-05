package com.chentsov.hw4.services;

import com.chentsov.hw4.entities.Product;
import com.chentsov.hw4.repositories.ProductIdentityMap;
import com.chentsov.hw4.repositories.ProductsPaginationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    private ProductsPaginationRepository productRepository;
    private ProductIdentityMap productsCache;

    @Autowired
    public void setProductRepository(ProductsPaginationRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Autowired
    public void setProductsCache(ProductIdentityMap productsCache) {
        this.productsCache = productsCache;
    }

    public List<Product> getAllProducts(int pageNumber, int pagesAmount) {
        Page<Product> productsPage = productRepository.findAll(PageRequest.of(pageNumber, pagesAmount));
        return productsPage.getContent();
    }

    public List<Product> getProductsWithGreaterPrice(Long price) {
        return productRepository.findAllByPriceGreaterThan(price);
    }

    public List<Product> getProductsWithLessPrice(Long price) {
        return productRepository.findAllByPriceLessThan(price);
    }

    public List<Product> getProductsWithPriceBetween(Long floor, Long ceil) {
        return productRepository.findAllByPriceBetween(floor, ceil);
    }

    @Nullable
    public Product findById(Long id) {
        final Product cached = productsCache.tryGet(id);
        if (cached != null) return cached;

        final Product actual = productRepository.findById(id).orElse(null);
        if (actual != null) productsCache.store(actual);

        return actual;
    }

}
