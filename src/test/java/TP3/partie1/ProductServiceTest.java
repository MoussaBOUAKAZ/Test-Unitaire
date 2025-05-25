import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class ProductServiceTest {

    @Mock
    private ProductApiClient productApiClient;

    @InjectMocks
    private ProductService productService;

    @Test
    void getProduct_ShouldReturnProduct_WhenApiCallSucceeds() throws ApiException {
        // Arrange
        Product expectedProduct = new Product("prod123", "Laptop", "High-end gaming laptop", 1299.99);
        when(productApiClient.getProduct("prod123")).thenReturn(expectedProduct);

        // Act
        Product actualProduct = productService.getProduct("prod123");

        // Assert
        assertEquals(expectedProduct, actualProduct);
        verify(productApiClient).getProduct("prod123");
    }

    @Test
    void getProduct_ShouldThrowApiException_WhenApiCallFails() throws ApiException {
        // Arrange
        when(productApiClient.getProduct("invalid123"))
                .thenThrow(new ApiException("Product not found"));

        // Act & Assert
        assertThrows(ApiException.class, () -> productService.getProduct("invalid123"));
        verify(productApiClient).getProduct("invalid123");
    }

    @Test
    void getProduct_ShouldHandleNullResponse() throws ApiException {
        // Arrange
        when(productApiClient.getProduct("nullProd")).thenReturn(null);

        // Act
        Product result = productService.getProduct("nullProd");

        // Assert
        assertNull(result);
        verify(productApiClient).getProduct("nullProd");
    }
}