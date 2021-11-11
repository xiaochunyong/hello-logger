package me.ely.logger;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;
import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.spi.LoggerContextListener;
import ch.qos.logback.core.spi.ContextAwareBase;
import ch.qos.logback.core.spi.LifeCycle;

/**
 * @author <a href="mailto:xiaochunyong@gmail.com">ely</a>
 * @since 2021/11/11
 */
public class MyLogContextListener extends ContextAwareBase implements LoggerContextListener, LifeCycle {
    @Override
    public boolean isResetResistant() {
        return false;
    }

    @Override
    public void onStart(LoggerContext loggerContext) {

    }

    @Override
    public void onReset(LoggerContext loggerContext) {

    }

    @Override
    public void onStop(LoggerContext loggerContext) {

    }

    @Override
    public void onLevelChange(Logger logger, Level level) {

    }

    private static final String LOG_PAHT_KEY = "LOG_PATH";

    @Override
    public void start() {
        // String logPath = System.getProperty("user.dir") + "/logs/";
        // System.setProperty(LOG_PAHT_KEY, logPath);
        String logPath = "/Users/Ely/Projects/IdeaProjects/Ely/hello-logger/hello-slf4j-with-logback";
        getContext().putProperty(LOG_PAHT_KEY, logPath);
    }

    @Override
    public void stop() {

    }

    @Override
    public boolean isStarted() {
        return false;
    }
}
