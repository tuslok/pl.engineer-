package navigation;


import configuration.AppProperties;

public class ApplicationURLs {

    public static final String APPLICATION_URL = AppProperties.getAllUrl();
    public static final String LOGIN_URL = APPLICATION_URL + "?controller=authentication&back=my-account";
    public static final String PASSWORD_URL = APPLICATION_URL + "?controller=password";
    public static final String ACCOUNT_CREATION = APPLICATION_URL + "?controller=authentication&back=my-account#account-creation";

}
