package de.avalax.pirates;

public class GameResult {
    private String token;
    private String winner;
    private String turns;
    private String ranking;

    // JSRX MAGIC
    private GameResult() {

    }

    public GameResult(String token, String winner, String turns) {
        this.token = token;
        this.winner = winner;
        this.turns = turns;
    }

    public String getToken() {
        return token;
    }

    public String getWinner() {
        return winner;
    }

    public String getTurns() {
        return turns;
    }

    public String getRanking() {
        return ranking;
    }
}
