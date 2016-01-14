package junit;

import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.mockserver.integration.ClientAndServer;

import java.io.IOException;

import static org.mockserver.model.HttpRequest.request;
import static org.mockserver.model.HttpResponse.response;

public class TestLogic {

    /**
     * Sends <code>GET http://localhost:&lt;port&gt;/test</code> and returns the status code
     * @param toPort target port
     * @throws IOException if sending the requests fails
     */
    public static int sendTestRequest(int toPort) throws IOException {

        HttpClientBuilder builder = HttpClientBuilder.create();
        CloseableHttpClient client = builder.build();

        return client.execute(new HttpGet("http://localhost:" + toPort + "/test"))
                .getStatusLine().getStatusCode();
    }

    /**
     * Prepares the given mock server to respond 200 for the request <code>GET /test</code>
     * @param mockServer
     */
    public static void prepareMockServer(ClientAndServer mockServer) {
        mockServer.when(
                request().withMethod("GET").withPath("/test")).respond(
                response().withStatusCode(200));
    }
}
