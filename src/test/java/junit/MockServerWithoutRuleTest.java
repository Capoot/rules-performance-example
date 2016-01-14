package junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockserver.integration.ClientAndServer;

import static junit.TestLogic.prepareMockServer;
import static junit.TestLogic.sendTestRequest;
import static junit.framework.TestCase.assertEquals;

public class MockServerWithoutRuleTest {

    private static final int PORT = 8080;

    private ClientAndServer mockServer;

    @Before
    public void setup() {
        mockServer = ClientAndServer.startClientAndServer(PORT);
    }

    @After
    public void tearDown() {
        mockServer.stop();
    }

    @Test
    public void one() throws Exception {
        prepareMockServer(mockServer);
        assertEquals(200, sendTestRequest(PORT));
    }

    @Test
    public void two() throws Exception {
        prepareMockServer(mockServer);
        assertEquals(200, sendTestRequest(PORT));
    }

    @Test
    public void three() throws Exception {
        prepareMockServer(mockServer);
        assertEquals(200, sendTestRequest(PORT));
    }

    @Test
    public void four() throws Exception {
        prepareMockServer(mockServer);
        assertEquals(200, sendTestRequest(PORT));
    }

    @Test
    public void five() throws Exception {
        prepareMockServer(mockServer);
        assertEquals(200, sendTestRequest(PORT));
    }

    @Test
    public void six() throws Exception {
        prepareMockServer(mockServer);
        assertEquals(200, sendTestRequest(PORT));
    }

    @Test
    public void seven() throws Exception {
        prepareMockServer(mockServer);
        assertEquals(200, sendTestRequest(PORT));
    }

    @Test
    public void eight() throws Exception {
        prepareMockServer(mockServer);
        assertEquals(200, sendTestRequest(PORT));
    }

    @Test
    public void nine() throws Exception {
        prepareMockServer(mockServer);
        assertEquals(200, sendTestRequest(PORT));
    }

    @Test
    public void ten() throws Exception {
        prepareMockServer(mockServer);
        assertEquals(200, sendTestRequest(PORT));
    }
}
