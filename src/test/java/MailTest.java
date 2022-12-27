import Task2.Client;
import Task2.MailBox;
import Task2.MailCode;
import Task2.MailInfo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MailTest {
    @Test
    public void testClient() {
        Client client = new Client(0, "Bob", 19, true);
        assertEquals(client.getId(), 0);
        assertEquals(client.getName(), "Bob");
        assertEquals(client.getAge(), 19);
        assertTrue(client.isSex());
    }
    @Test
    public void testMailBox() {
        Client client = new Client(0, "Bob", 19, true);
        MailBox box = new MailBox();
        box.addMailInfo(new MailInfo(client, MailCode.Gift));
        box.addMailInfo(new MailInfo(client, MailCode.Birthday));
        assertEquals(box.getInfos().size(), 2);
    }
}

