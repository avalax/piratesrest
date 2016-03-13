import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class JsRxPiratesRestIntegrationTest {
    @Test
    public void shouldCreateNewGame() throws Exception {
        PiratesRest piratesRest = new JsRxPiratesRest();

        GameConfig gameConfig = new GameConfig("Tom", "Agathe", "Peter", "Herrmann");
        GameConfig newGame = piratesRest.createNewGame(gameConfig);

        assertThat(newGame.getRed()).isEqualTo("Tom");
        assertThat(newGame.getGreen()).isEqualTo("Agathe");
        assertThat(newGame.getBlue()).isEqualTo("Peter");
        assertThat(newGame.getYellow()).isEqualTo("Herrmann");
        assertThat(newGame.getToken()).isEqualTo("42");
    }

    @Test
    public void shouldReportGame() throws Exception {
        PiratesRest piratesRest = new JsRxPiratesRest();

        GameResult gameResult = new GameResult("42", "Tom", "12");

        GameResult result = piratesRest.reportGame(gameResult);

        assertThat(result.getToken()).isEqualTo("42");
        assertThat(result.getWinner()).isEqualTo("Tom");
        assertThat(result.getTurns()).isEqualTo("12");
        assertThat(result.getRanking()).isEqualTo("1");
    }
}
