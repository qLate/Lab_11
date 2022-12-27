import Task3.ImageProxy;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ImageTest {
    @Test
    public void TestProxy() {
        ImageProxy proxy = new ImageProxy("img.png");
        proxy.display();
        assertNotNull(proxy.getImage());
    }
}
