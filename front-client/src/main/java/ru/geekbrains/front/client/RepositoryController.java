package ru.geekbrains.front.client;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.geekbrains.repository.client.model.Product;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class RepositoryController {
    private final RepositoryClient repositoryClient;

    @GetMapping
    public List<Product> getProducts() {
        return repositoryClient.findAllProducts();
    }
}
