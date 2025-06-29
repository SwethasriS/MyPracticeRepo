package mockitotest;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

public class MyServiceTest {

    @Test
    public void testVerifyInteraction() {
        // Step 1: Create a mock
        ExternalApi mockApi = mock(ExternalApi.class);

        // Step 2: Inject into service
        MyService service = new MyService(mockApi);

        // Step 3: Call method
        service.fetchData();

        // Step 4: Verify interaction
        verify(mockApi).getData();  // ✅ Test will fail if this method is not called
    }
}

