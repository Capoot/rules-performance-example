package junit;

import org.junit.Rule;
import org.junit.Test;

import static junit.TestLogic.prepareMockServer;
import static junit.TestLogic.sendTestRequest;
import static junit.framework.TestCase.assertEquals;

public class MockServerWithRuleTest {

    private static final int PORT = 8080;

    @Rule public MockServerRule mockServerRule = new MockServerRule(PORT);

    @Test
    public void one() throws Exception {
        prepareMockServer(mockServerRule.getMockServer());
        assertEquals(200, sendTestRequest(PORT));
    }

    @Test
    public void two() throws Exception {
        prepareMockServer(mockServerRule.getMockServer());
        assertEquals(200, sendTestRequest(PORT));
    }

    @Test
    public void three() throws Exception {
        prepareMockServer(mockServerRule.getMockServer());
        assertEquals(200, sendTestRequest(PORT));
    }

    @Test
    public void four() throws Exception {
        prepareMockServer(mockServerRule.getMockServer());
        assertEquals(200, sendTestRequest(PORT));
    }

    @Test
    public void five() throws Exception {
        prepareMockServer(mockServerRule.getMockServer());
        assertEquals(200, sendTestRequest(PORT));
    }

    @Test
    public void six() throws Exception {
        prepareMockServer(mockServerRule.getMockServer());
        assertEquals(200, sendTestRequest(PORT));
    }

    @Test
    public void seven() throws Exception {
        prepareMockServer(mockServerRule.getMockServer());
        assertEquals(200, sendTestRequest(PORT));
    }

    @Test
    public void eight() throws Exception {
        prepareMockServer(mockServerRule.getMockServer());
        assertEquals(200, sendTestRequest(PORT));
    }

    @Test
    public void nine() throws Exception {
        prepareMockServer(mockServerRule.getMockServer());
        assertEquals(200, sendTestRequest(PORT));
    }

    @Test
    public void ten() throws Exception {
        prepareMockServer(mockServerRule.getMockServer());
        assertEquals(200, sendTestRequest(PORT));
    }
}
