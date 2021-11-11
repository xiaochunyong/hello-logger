package me.ely.logger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author <a href="mailto:xiaochunyong@gmail.com">ely</a>
 * @since 2021/11/10
 */
public class Log4jExample {

    private static final Logger logger = LoggerFactory.getLogger(Log4jExample.class);

    public static void main(String[] args) throws InterruptedException {
        int i = 0;
        while (true) {
            logger.info("hello world 第" + i + "次!");
            Thread.sleep(1000L);
            i++;
        }
    }

}
