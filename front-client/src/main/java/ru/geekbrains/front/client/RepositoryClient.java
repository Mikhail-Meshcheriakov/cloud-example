package ru.geekbrains.front.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import ru.geekbrains.repository.client.model.Product;

import java.util.List;

@FeignClient("repository-client")
public interface RepositoryClient {
    @GetMapping
    List<Product> findAllProducts();
}
