package com.chentsov.hw4.repositories;

import com.chentsov.hw4.entities.Product;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Component
public class ProductIdentityMap {
    private final Map<Long, Product> cache = new ConcurrentHashMap<>();

    public void store(@NonNull Product product) {
        cache.put(product.getId(), product);
    }

    @Nullable
    public Product tryGet(@NonNull Long id) {
        return cache.get(id);
    }

}
