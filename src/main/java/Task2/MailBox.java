package Task2;

import com.mailjet.client.errors.MailjetException;
import com.mailjet.client.errors.MailjetSocketTimeoutException;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class MailBox {
    private final List<MailInfo> infos = new ArrayList<>();


    public void addMailInfo(MailInfo info) {
        infos.add(info);
    }

    public void sendAll() throws MailjetSocketTimeoutException, MailjetException {
        var sender = new MailSender();
        for (var info : infos) {
            sender.sendMail(info);
        }
        infos.clear();
    }
}
