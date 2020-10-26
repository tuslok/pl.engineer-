package utils.testng.listeners;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {

    private int counter = 0;
    private static final int MAX_NUMBER_OF_RETRIES = 2;
    private Logger logger = LogManager.getLogger(RetryAnalyzer.class);

    @Override
    public boolean retry(ITestResult iTestResult) {

        if (!iTestResult.isSuccess()){
            if (counter < MAX_NUMBER_OF_RETRIES){
                counter++;
                logger.info("Retrying test method {} ", iTestResult.getName());
                return true;
            }
        }

        logger.info("Test method {} will be not retried:", iTestResult.getName());
        return false;
    }
}
