public interface PiratesRest {
    GameConfig createNewGame(GameConfig gameConfig);

    GameResult reportGame(GameResult gameResult);
}
