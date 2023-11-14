import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

public class Main {
    public static void main(String[] args) {
        try {
            TelegramBotsApi botsApi = new TelegramBotsApi(DefaultBotSession.class);
            botsApi.registerBot(new simpleBot());
        } catch (TelegramApiException run) {
            run.printStackTrace();
        }

        try {
            TelegramBotsApi botsApi2 = new TelegramBotsApi(DefaultBotSession.class);
            botsApi2.registerBot(new simpleBot());
        } catch (TelegramApiException run2) {
            run2.printStackTrace();
        }
    }
}
