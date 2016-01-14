package junit;

import org.junit.rules.ExternalResource;
import org.mockserver.integration.ClientAndServer;

public class MockServerRule extends ExternalResource {

    private ClientAndServer mockServer;
    private final Integer port;

    public MockServerRule(Integer port) {
        this.port = port;
    }

    @Override
    protected void before() throws Throwable {
        mockServer = ClientAndServer.startClientAndServer(port);
    }

    @Override
    protected void after() {

        if(!mockServer.isRunning()) {
            return;
        }

        mockServer.stop();
    }

    public ClientAndServer getMockServer() {
        if(mockServer == null) {
            throw new IllegalStateException("Illegal access to mock server before starting. Please note: this class " +
                    "is intended to be used as a JUnit @Rule exclusively.");
        }
        if(!mockServer.isRunning()) {
            throw new IllegalStateException("Mock server has been accessed while not running. Please note: This class " +
                    "is intended to be used as a JUnit @Rule exclusively.");
        }
        return mockServer;
    }
}
