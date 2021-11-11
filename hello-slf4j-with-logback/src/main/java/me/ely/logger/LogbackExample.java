package me.ely.logger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author <a href="mailto:xiaochunyong@gmail.com">ely</a>
 * @since 2021/11/10
 */
public class LogbackExample {

    private static final Logger logger = LoggerFactory.getLogger(LogbackExample.class);

    public static void main(String[] args) throws InterruptedException {
        int i = 0;
        while (true) {
            logger.info("hello world 第" + i + "次!");
            logger.warn("hello world 第" + i + "次!");
            logger.error("hello world 第" + i + "次!");
            Thread.sleep(1000L);
            i++;
        }
    }

}
