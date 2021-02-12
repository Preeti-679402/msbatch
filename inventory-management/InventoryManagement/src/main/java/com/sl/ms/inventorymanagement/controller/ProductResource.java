package com.sl.ms.inventorymanagement.controller;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
@RequestMapping("/api/v1")
public class ProductResource {
    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private InventoryRepository inventoryRepository;


    @GetMapping("/products")
    public List<Products> retrieveAllProducts() {
        return productRepository.findAll();
    }

    @GetMapping("/inventories")
    public List<Inventory> retrieveAllInventories() {
        return inventoryRepository.findAll();
    }


    @GetMapping("/products/{id}")
    public Products retrieveProducts(@PathVariable long id) {
        Optional<Products> products = productRepository.findById(id);

        if (!products.isPresent())
            throw new ProductNotFoundException("id-" + id);

        return products.get();
    }

    @DeleteMapping("/products/{id}")
    public void deleteProduct(@PathVariable long id) {
        productRepository.deleteById(id);
    }

    @PostMapping("/products")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Object> createProduct(@RequestBody Products product) {
        Products savedProduct = productRepository.save(product);

        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(savedProduct.getId()).toUri();

        return ResponseEntity.created(location).build();

    }

    @PutMapping("/products/{id}")
    public ResponseEntity<Object> updateProduct(@RequestBody Products products, @PathVariable long id) {

        Optional<Products> productOptional = productRepository.findById(id);

        if (!productOptional.isPresent())
            return ResponseEntity.notFound().build();

        products.setId(id);

        productRepository.save(products);

        return ResponseEntity.noContent().build();
    }


}
