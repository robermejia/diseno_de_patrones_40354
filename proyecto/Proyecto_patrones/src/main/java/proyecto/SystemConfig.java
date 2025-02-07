package proyecto;

public class SystemConfig {
    private static SystemConfig instance;
    private final String appName = "Plataforma de Usuarios";
    private final String version = "1.0.0";

    private SystemConfig() {}

    public static SystemConfig getInstance() {
        if (instance == null) {
            instance = new SystemConfig();
        }
        return instance;
    }

    public String getAppName() {
        return appName;
    }

    public String getVersion() {
        return version;
    }
}
