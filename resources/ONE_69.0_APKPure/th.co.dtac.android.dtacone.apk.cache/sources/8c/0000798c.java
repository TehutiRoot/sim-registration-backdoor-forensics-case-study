package ch.qos.logback.classic.jul;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;
import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.spi.LoggerContextListener;
import ch.qos.logback.core.spi.ContextAwareBase;
import ch.qos.logback.core.spi.LifeCycle;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.LogManager;

@Deprecated
/* loaded from: classes.dex */
public class LevelChangePropagator extends ContextAwareBase implements LoggerContextListener, LifeCycle {

    /* renamed from: c */
    public Set f39554c = new HashSet();

    /* renamed from: d */
    public boolean f39555d = false;

    /* renamed from: e */
    public boolean f39556e = false;

    /* renamed from: b */
    public final void m51609b(Logger logger, Level level) {
        addInfo("Propagating " + level + " level on " + logger + " onto the JUL framework");
        java.util.logging.Logger asJULLogger = JULHelper.asJULLogger(logger);
        this.f39554c.add(asJULLogger);
        asJULLogger.setLevel(JULHelper.asJULLevel(level));
    }

    /* renamed from: d */
    public final void m51608d() {
        for (Logger logger : ((LoggerContext) this.context).getLoggerList()) {
            if (logger.getLevel() != null) {
                m51609b(logger, logger.getLevel());
            }
        }
    }

    @Override // ch.qos.logback.classic.spi.LoggerContextListener
    public boolean isResetResistant() {
        return false;
    }

    @Override // ch.qos.logback.core.spi.LifeCycle
    public boolean isStarted() {
        return this.f39555d;
    }

    @Override // ch.qos.logback.classic.spi.LoggerContextListener
    public void onLevelChange(Logger logger, Level level) {
        m51609b(logger, level);
    }

    @Override // ch.qos.logback.classic.spi.LoggerContextListener
    public void onReset(LoggerContext loggerContext) {
    }

    @Override // ch.qos.logback.classic.spi.LoggerContextListener
    public void onStart(LoggerContext loggerContext) {
    }

    @Override // ch.qos.logback.classic.spi.LoggerContextListener
    public void onStop(LoggerContext loggerContext) {
    }

    public void resetJULLevels() {
        LogManager logManager = LogManager.getLogManager();
        Enumeration<String> loggerNames = logManager.getLoggerNames();
        while (loggerNames.hasMoreElements()) {
            String nextElement = loggerNames.nextElement();
            java.util.logging.Logger logger = logManager.getLogger(nextElement);
            if (JULHelper.isRegularNonRootLogger(logger) && logger.getLevel() != null) {
                addInfo("Setting level of jul logger [" + nextElement + "] to null");
                logger.setLevel(null);
            }
        }
    }

    public void setResetJUL(boolean z) {
        this.f39556e = z;
    }

    @Override // ch.qos.logback.core.spi.LifeCycle
    public void start() {
        if (this.f39556e) {
            resetJULLevels();
        }
        m51608d();
        this.f39555d = true;
    }

    @Override // ch.qos.logback.core.spi.LifeCycle
    public void stop() {
        this.f39555d = false;
    }
}