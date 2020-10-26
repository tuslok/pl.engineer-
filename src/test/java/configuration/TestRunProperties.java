package configuration;

import driver.manager.BrowserType;

public class TestRunProperties {

    public static BrowserType getBrowserToRun(){
        return BrowserType.valueOf(ConfigurationProperties.getProperties().getProperty("browser"));
    }

    public static boolean getIsRemoteRun(){
        return Boolean.parseBoolean(ConfigurationProperties.getProperties().getProperty("is.remote.run"));
    }

}