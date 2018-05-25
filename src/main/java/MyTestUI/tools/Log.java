package MyTestUI.tools;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

/**
 * Created by mac on 2017/9/24.
 */
public class Log {

    private static Logger log = LogManager.getLogger(Log.class.getName());

    public static void startTestCase(String testCaseName){

        log.info("======" +testCaseName +"开始执行======");
    }

    public static void endTestCase(String testCaseName){

        log.info("======" + testCaseName +"执行结束======");
    }

    public static void info(String message){
        log.info(message);
    }

    public static void debug(String message){
        log.debug(message);
    }

    public static void error(String message){
        log.error(message);
    }

}
