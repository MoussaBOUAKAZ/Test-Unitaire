import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class UserServiceTest {

    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private UserService userService;

    @Test
    void getUserById_ShouldReturnUser_WhenUserExists() {
        // Arrange
        User expectedUser = new User(1L, "John Doe", "john@example.com");
        when(userRepository.findUserById(1L)).thenReturn(expectedUser);

        // Act
        User actualUser = userService.getUserById(1L);

        // Assert
        assertEquals(expectedUser, actualUser);
        verify(userRepository).findUserById(1L);
    }

    @Test
    void getUserById_ShouldReturnNull_WhenUserDoesNotExist() {
        // Arrange
        when(userRepository.findUserById(anyLong())).thenReturn(null);

        // Act
        User actualUser = userService.getUserById(999L);

        // Assert
        assertNull(actualUser);
        verify(userRepository).findUserById(999L);
    }
}