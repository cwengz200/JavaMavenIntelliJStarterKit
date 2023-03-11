package za.ac.cput;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import static org.junit.jupiter.api.Assertions.*;

public class ProductTest {

    @Test
    void testObjectEquality() {
        Product product1 = new Product("1", "Product 1", 100.0);
        Product product2 = new Product("1", "Product 1", 100.0);

        assertEquals(product1, product2);
    }

    @Test
    void testObjectIdentity() {
        Product product1 = new Product("1", "Product 1", 100.0);
        Product product2 = new Product("1", "Product 1", 100.0);

        assertNotSame(product1, product2);
    }

    @Test
    void testInequality() {
        Product product1 = new Product("1", "Product 1", 100.0);
        Product product2 = new Product("2", "Product 2", 200.0);

        assertNotEquals(product1, product2); // This test will pass
    }

    @Test
    @Timeout(100)
    void testTimeout() {
        Product product = new Product("1", "Product 1", 100.0);

        // This loop will run for more than 100ms, causing the test to fail
        for (int i = 0; i < 1000000000; i++) {
            product.setName("Product " + i);
        }
    }

    @Test
    @Disabled("Not implemented yet")
    void testDisabled() {
        // This test is currently disabled
    }
}