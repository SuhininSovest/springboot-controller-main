package tv.lid.springboot.users.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tv.lid.springboot.users.repositories.ProductRepository;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;

}
