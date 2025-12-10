package ch.qos.logback.classic;

import ch.qos.logback.classic.spi.LoggerComparator;
import ch.qos.logback.classic.spi.LoggerContextListener;
import ch.qos.logback.classic.spi.LoggerContextVO;
import ch.qos.logback.classic.spi.TurboFilterList;
import ch.qos.logback.classic.turbo.TurboFilter;
import ch.qos.logback.classic.util.LoggerNameUtil;
import ch.qos.logback.core.ContextBase;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.spi.FilterReply;
import ch.qos.logback.core.spi.LifeCycle;
import ch.qos.logback.core.status.StatusListener;
import ch.qos.logback.core.status.StatusManager;
import ch.qos.logback.core.status.WarnStatus;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledFuture;
import org.slf4j.ILoggerFactory;
import org.slf4j.Marker;

/* loaded from: classes.dex */
public class LoggerContext extends ContextBase implements ILoggerFactory, LifeCycle {
    public static final boolean DEFAULT_PACKAGING_DATA = false;

    /* renamed from: j */
    public final Logger f39506j;

    /* renamed from: k */
    public int f39507k;

    /* renamed from: t */
    public List f39516t;

    /* renamed from: l */
    public int f39508l = 0;

    /* renamed from: m */
    public final List f39509m = new ArrayList();

    /* renamed from: p */
    public final TurboFilterList f39512p = new TurboFilterList();

    /* renamed from: q */
    public boolean f39513q = false;

    /* renamed from: r */
    public int f39514r = 8;

    /* renamed from: s */
    public int f39515s = 0;

    /* renamed from: n */
    public Map f39510n = new ConcurrentHashMap();

    /* renamed from: o */
    public LoggerContextVO f39511o = new LoggerContextVO(this);

    public LoggerContext() {
        Logger logger = new Logger(org.slf4j.Logger.ROOT_LOGGER_NAME, null, this);
        this.f39506j = logger;
        logger.setLevel(Level.DEBUG);
        this.f39510n.put(org.slf4j.Logger.ROOT_LOGGER_NAME, logger);
        m51652m();
        this.f39507k = 1;
        this.f39516t = new ArrayList();
    }

    public void addListener(LoggerContextListener loggerContextListener) {
        this.f39509m.add(loggerContextListener);
    }

    public void addTurboFilter(TurboFilter turboFilter) {
        this.f39512p.add(turboFilter);
    }

    /* renamed from: d */
    public final void m51661d() {
        for (ScheduledFuture<?> scheduledFuture : this.scheduledFutures) {
            scheduledFuture.cancel(false);
        }
        this.scheduledFutures.clear();
    }

    /* renamed from: e */
    public void m51660e(Logger logger, Level level) {
        for (LoggerContextListener loggerContextListener : this.f39509m) {
            loggerContextListener.onLevelChange(logger, level);
        }
    }

    public Logger exists(String str) {
        return (Logger) this.f39510n.get(str);
    }

    /* renamed from: f */
    public final void m51659f() {
        for (LoggerContextListener loggerContextListener : this.f39509m) {
            loggerContextListener.onReset(this);
        }
    }

    /* renamed from: g */
    public final void m51658g() {
        for (LoggerContextListener loggerContextListener : this.f39509m) {
            loggerContextListener.onStart(this);
        }
    }

    public List<LoggerContextListener> getCopyOfListenerList() {
        return new ArrayList(this.f39509m);
    }

    public List<String> getFrameworkPackages() {
        return this.f39516t;
    }

    public final Logger getLogger(Class<?> cls) {
        return getLogger(cls.getName());
    }

    public LoggerContextVO getLoggerContextRemoteView() {
        return this.f39511o;
    }

    public List<Logger> getLoggerList() {
        ArrayList arrayList = new ArrayList(this.f39510n.values());
        Collections.sort(arrayList, new LoggerComparator());
        return arrayList;
    }

    public int getMaxCallerDataDepth() {
        return this.f39514r;
    }

    public TurboFilterList getTurboFilterList() {
        return this.f39512p;
    }

    /* renamed from: h */
    public final void m51657h() {
        for (LoggerContextListener loggerContextListener : this.f39509m) {
            loggerContextListener.onStop(this);
        }
    }

    /* renamed from: i */
    public final FilterReply m51656i(Marker marker, Logger logger, Level level, String str, Object[] objArr, Throwable th2) {
        return this.f39512p.size() == 0 ? FilterReply.NEUTRAL : this.f39512p.getTurboFilterChainDecision(marker, logger, level, str, objArr, th2);
    }

    public boolean isPackagingDataEnabled() {
        return this.f39513q;
    }

    /* renamed from: j */
    public final FilterReply m51655j(Marker marker, Logger logger, Level level, String str, Object obj, Throwable th2) {
        return this.f39512p.size() == 0 ? FilterReply.NEUTRAL : this.f39512p.getTurboFilterChainDecision(marker, logger, level, str, new Object[]{obj}, th2);
    }

    /* renamed from: k */
    public final FilterReply m51654k(Marker marker, Logger logger, Level level, String str, Object obj, Object obj2, Throwable th2) {
        return this.f39512p.size() == 0 ? FilterReply.NEUTRAL : this.f39512p.getTurboFilterChainDecision(marker, logger, level, str, new Object[]{obj, obj2}, th2);
    }

    /* renamed from: l */
    public final void m51653l() {
        this.f39507k++;
    }

    /* renamed from: m */
    public void m51652m() {
        putObject(CoreConstants.EVALUATOR_MAP, new HashMap());
    }

    /* renamed from: n */
    public final void m51651n(Logger logger) {
        int i = this.f39508l;
        this.f39508l = i + 1;
        if (i == 0) {
            StatusManager statusManager = getStatusManager();
            statusManager.add(new WarnStatus("No appenders present in context [" + getName() + "] for logger [" + logger.getName() + "].", logger));
        }
    }

    /* renamed from: o */
    public final void m51650o() {
        this.f39509m.clear();
    }

    /* renamed from: p */
    public final void m51649p() {
        ArrayList arrayList = new ArrayList();
        for (LoggerContextListener loggerContextListener : this.f39509m) {
            if (loggerContextListener.isResetResistant()) {
                arrayList.add(loggerContextListener);
            }
        }
        this.f39509m.retainAll(arrayList);
    }

    public void putProperties(Properties properties) {
        for (String str : properties.stringPropertyNames()) {
            super.putProperty(str, properties.getProperty(str));
        }
        m51647r();
    }

    @Override // ch.qos.logback.core.ContextBase, ch.qos.logback.core.Context
    public void putProperty(String str, String str2) {
        super.putProperty(str, str2);
        m51647r();
    }

    /* renamed from: q */
    public final void m51648q() {
        StatusManager statusManager = getStatusManager();
        for (StatusListener statusListener : statusManager.getCopyOfStatusListenerList()) {
            statusManager.remove(statusListener);
        }
    }

    /* renamed from: r */
    public final void m51647r() {
        this.f39511o = new LoggerContextVO(this);
    }

    public void removeListener(LoggerContextListener loggerContextListener) {
        this.f39509m.remove(loggerContextListener);
    }

    @Override // ch.qos.logback.core.ContextBase
    public void reset() {
        this.f39515s++;
        super.reset();
        m51652m();
        initCollisionMaps();
        this.f39506j.recursiveReset();
        resetTurboFilterList();
        m51661d();
        m51659f();
        m51649p();
        m51648q();
    }

    public void resetTurboFilterList() {
        Iterator<TurboFilter> it = this.f39512p.iterator();
        while (it.hasNext()) {
            it.next().stop();
        }
        this.f39512p.clear();
    }

    public void setMaxCallerDataDepth(int i) {
        this.f39514r = i;
    }

    @Override // ch.qos.logback.core.ContextBase, ch.qos.logback.core.Context
    public void setName(String str) {
        super.setName(str);
        m51647r();
    }

    public void setPackagingDataEnabled(boolean z) {
        this.f39513q = z;
    }

    @Override // ch.qos.logback.core.ContextBase, ch.qos.logback.core.spi.LifeCycle
    public void start() {
        super.start();
        m51658g();
    }

    @Override // ch.qos.logback.core.ContextBase, ch.qos.logback.core.spi.LifeCycle
    public void stop() {
        reset();
        m51657h();
        m51650o();
        super.stop();
    }

    @Override // ch.qos.logback.core.ContextBase
    public String toString() {
        return getClass().getName() + "[" + getName() + "]";
    }

    @Override // org.slf4j.ILoggerFactory
    public Logger getLogger(String str) {
        Logger childByName;
        if (str == null) {
            throw new IllegalArgumentException("name argument cannot be null");
        }
        if (org.slf4j.Logger.ROOT_LOGGER_NAME.equalsIgnoreCase(str)) {
            return this.f39506j;
        }
        Logger logger = this.f39506j;
        Logger logger2 = (Logger) this.f39510n.get(str);
        if (logger2 != null) {
            return logger2;
        }
        int i = 0;
        while (true) {
            int separatorIndexOf = LoggerNameUtil.getSeparatorIndexOf(str, i);
            String substring = separatorIndexOf == -1 ? str : str.substring(0, separatorIndexOf);
            int i2 = separatorIndexOf + 1;
            synchronized (logger) {
                try {
                    childByName = logger.getChildByName(substring);
                    if (childByName == null) {
                        childByName = logger.createChildByName(substring);
                        this.f39510n.put(substring, childByName);
                        m51653l();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (separatorIndexOf == -1) {
                return childByName;
            }
            i = i2;
            logger = childByName;
        }
    }
}
