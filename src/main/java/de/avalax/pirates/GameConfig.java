package de.avalax.pirates;

import javax.ws.rs.client.Entity;
import java.io.Serializable;

public class GameConfig implements Serializable {
    private String token;

    private String red;

    private String green;

    private String blue;

    private String yellow;

    // JSRX MAGIC
    private GameConfig() {

    }

    public GameConfig(String red, String green, String blue, String yellow) {
        this.red = red;
        this.green = green;
        this.blue = blue;
        this.yellow = yellow;
    }

    public String getToken() {
        return token;
    }

    public String getRed() {
        return red;
    }

    public String getGreen() {
        return green;
    }

    public String getBlue() {
        return blue;
    }


    public String getYellow() {
        return yellow;
    }
}
