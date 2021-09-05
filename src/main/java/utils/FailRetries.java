package utils;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class FailRetries implements IRetryAnalyzer {
    int retryAttempts = 0;

    @Override
    public boolean retry(ITestResult iTestResult) {
        if (retryAttempts < 3) {
            retryAttempts++;
          return true;
        }

        return false;
    }
}
