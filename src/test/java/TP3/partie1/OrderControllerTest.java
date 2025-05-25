import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class OrderControllerTest {

    @Mock
    private OrderService orderService;

    @Mock
    private OrderDao orderDao;

    @InjectMocks
    private OrderController orderController;

    @Test
    void createOrder_ShouldCallServiceAndDao() {
        // Arrange
        Order testOrder = new Order("123", "cust456", List.of("prod1", "prod2"), 99.99);
        OrderService realOrderService = new OrderService(orderDao);
        OrderController controllerWithRealService = new OrderController(realOrderService);

        // Act
        controllerWithRealService.createOrder(testOrder);

        // Assert
        verify(orderDao).saveOrder(testOrder);
    }

    @Test
    void createOrder_ShouldPropagateOrderToService() {
        // Arrange
        Order testOrder = new Order("123", "cust456", List.of("prod1", "prod2"), 99.99);

        // Act
        orderController.createOrder(testOrder);

        // Assert
        verify(orderService).createOrder(testOrder);
    }
}