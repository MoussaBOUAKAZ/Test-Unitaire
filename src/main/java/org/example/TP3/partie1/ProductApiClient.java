public interface ProductApiClient {
    Product getProduct(String productId) throws ApiException;
}

public class ApiException extends Exception {
    public ApiException(String message) {
        super(message);
    }
}