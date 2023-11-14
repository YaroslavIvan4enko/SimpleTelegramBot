import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class simpleBot extends TelegramLongPollingBot {
    @Override
    public void onUpdateReceived(Update update) {
        /*System.out.println(update.getMessage().getText());
        System.out.println(update.getMessage().getFrom().getFirstName());*/

        String command = update.getMessage().getText();

        if (command.equals("/run")) {
            String message = "Bot is running";
            SendMessage response = new SendMessage();
            response.setChatId(update.getMessage().getChatId().toString());
            response.setText(message);

            try {
                execute(response);
            } catch (TelegramApiException run) {
                run.printStackTrace();
            }
        }

            String command2 = update.getMessage().getText();

            if (command2.equals("/hello")) {
                String message2 = "Hi";
                SendMessage response2 = new SendMessage();
                response2.setChatId(update.getMessage().getChatId().toString());
                response2.setText(message2);

                try {
                    execute(response2);
                } catch (TelegramApiException run2) {
                    run2.printStackTrace();
                }
            }



    }

    @Override
    public String getBotUsername() {
        return "s1mple_tg_bot";
    }

    @Override
    public String getBotToken() {
        return "6817385832:AAFlQYCeSYz13hDuKJPNfx1WCG80MZh33oo";
    }
}
