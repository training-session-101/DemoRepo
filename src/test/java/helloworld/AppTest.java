package helloworld;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class AppTest {
  @Test
  public void successfulResponse() {
    App app = new App();
    GatewayResponse result = (GatewayResponse) app.handleRequest(new User("Iftekhar"), null);
    assertEquals(result.getStatusCode(), 200);
    assertEquals(result.getHeaders().get("Content-Type"), "application/json");
    String content = result.getBody();
    assertNotNull(content);
    assertTrue(content.contains("\"message\""));
  }
}
