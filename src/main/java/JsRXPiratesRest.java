import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class JsRxPiratesRest implements PiratesRest {

    public static final String REST_TARGET = "http://silex.avalax.de";
    public static final String REST_PATH = "/pirates";
    private static final String REST_REPORT_PATH = "/pirates/report";

    @Override
    public GameConfig createNewGame(GameConfig gameConfig) {
        WebTarget target = ClientBuilder.newClient().target(REST_TARGET).path(REST_PATH);
        Response response = target.request().post(Entity.entity(gameConfig, MediaType.APPLICATION_JSON));
        return response.readEntity(GameConfig.class);
    }

    @Override
    public GameResult reportGame(GameResult gameResult) {
        WebTarget target = ClientBuilder.newClient().target(REST_TARGET).path(REST_REPORT_PATH);
        Response response = target.request().post(Entity.entity(gameResult, MediaType.APPLICATION_JSON));
        return response.readEntity(GameResult.class);
    }
}
