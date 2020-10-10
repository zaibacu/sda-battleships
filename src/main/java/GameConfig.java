
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.InputStream;
import java.io.Serializable;

public class GameConfig implements Serializable {
    public static GameConfig load(){
        ObjectMapper objectMapper = new ObjectMapper();
        InputStream is = GameConfig.class.getClassLoader().getResourceAsStream("config.json");
        try {
            return objectMapper.readValue(is, GameConfig.class);
        }
        catch(Exception ex){
            ex.printStackTrace();
            return null;
        }
    }


    private int resources;
    private int width;
    private int height;

    public GameConfig(){

    }

    public GameConfig(int resources, int width, int height) {
        this.resources = resources;
        this.width = width;
        this.height = height;
    }

    public int getResources() {
        return resources;
    }

    public void setResources(int resources) {
        this.resources = resources;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
