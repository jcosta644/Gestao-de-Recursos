package prototype;

import chain.*;

import java.util.HashMap;

/**
 * Created by HP on 09/09/2017.
 */
public class Factory {
    private static HashMap<String, Handler> prototypes = new HashMap<>();
    private static String[] types = new String[4];

    static {
        prototypes.put("Auditory", new AuditoryHandler("Auditory"));
        prototypes.put("ClassRoom", new ClassRoomHandler("ClassRoom"));
        prototypes.put("Laboratory", new LaboratoryHandler("Laboratory"));
        prototypes.put("Projector", new ProjectorHandler("Projector"));
        types[0] = "Laboratory";
        types[1] = "Auditory";
        types[2] = "ClassRoom";
        types[3] = "Projector";
    }

    public static Handler getHandler(int type) {
        return prototypes.get(types[type]);
    }
}
