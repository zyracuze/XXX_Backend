package com.example.shopping;

import com.example.shopping.domain.Toy;
import com.example.shopping.repository.ToyRepository;
import com.example.shopping.service.impl.ProductServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Optional;

@RunWith(MockitoJUnitRunner.class)
public class ProductServiceTest {

    @InjectMocks
    private ProductServiceImpl productservice;

    @Mock
    private ToyRepository toyRepository;

    @Test
    public void getProductByToyIdShouldReturnToy() {
        Toy expectedToy  = new Toy();
        expectedToy.setId(15);
        expectedToy.setBrand("Coolkidz");
        expectedToy.setGender("Male");
        expectedToy.setAge("over 8");
        expectedToy.setPrice(24.95);
        expectedToy.setAvailability("Instock");

        Mockito.when(toyRepository.findById(ArgumentMatchers.anyInt())).thenReturn(Optional.of(expectedToy));

        Toy actualToy = productservice.getProduct(15);

        Assertions.assertThat(actualToy).isNotNull();
        Assertions.assertThat(actualToy).isEqualTo(expectedToy);
    }

    @Test
    public void whenSearchByInvalidToyIdShouldReturnNull() {
        Mockito.when(toyRepository.findById(ArgumentMatchers.anyInt())).thenReturn(Optional.empty());

        Toy actualToy = productservice.getProduct(-1);

        Assertions.assertThat(actualToy).isNull();
    }
}
