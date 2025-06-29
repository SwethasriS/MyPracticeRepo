package mockitotest;

public class MyService {
    private ExternalApi externalApi;

    public MyService(ExternalApi externalApi) {
        this.externalApi = externalApi;
    }

    public void fetchData() {
        // Some logic, maybe logging, validation, etc.
        externalApi.getData();  // This should be called during the test
    }
}

