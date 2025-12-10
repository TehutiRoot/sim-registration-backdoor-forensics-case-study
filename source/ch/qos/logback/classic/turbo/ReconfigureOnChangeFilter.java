package ch.qos.logback.classic.turbo;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;
import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.joran.JoranConfigurator;
import ch.qos.logback.core.android.AndroidContextUtil;
import ch.qos.logback.core.joran.GenericConfigurator;
import ch.qos.logback.core.joran.event.SaxEvent;
import ch.qos.logback.core.joran.spi.ConfigurationWatchList;
import ch.qos.logback.core.joran.spi.JoranException;
import ch.qos.logback.core.joran.util.ConfigurationWatchListUtil;
import ch.qos.logback.core.spi.ContextAwareBase;
import ch.qos.logback.core.spi.FilterReply;
import ch.qos.logback.core.status.StatusUtil;
import java.io.File;
import java.net.URL;
import java.util.List;
import okhttp3.internal.p026ws.WebSocketProtocol;
import org.slf4j.Marker;

/* loaded from: classes.dex */
public class ReconfigureOnChangeFilter extends TurboFilter {
    public static final long DEFAULT_REFRESH_PERIOD = 60000;

    /* renamed from: f */
    public URL f39680f;

    /* renamed from: g */
    public ConfigurationWatchList f39681g;
    protected volatile long nextCheck;

    /* renamed from: e */
    public long f39679e = 60000;

    /* renamed from: h */
    public long f39682h = 0;

    /* renamed from: i */
    public volatile long f39683i = 15;

    /* renamed from: j */
    public volatile long f39684j = System.currentTimeMillis();

    /* renamed from: ch.qos.logback.classic.turbo.ReconfigureOnChangeFilter$a */
    /* loaded from: classes.dex */
    public class RunnableC5465a implements Runnable {
        public RunnableC5465a() {
        }

        /* renamed from: a */
        public final void m51561a(LoggerContext loggerContext, List list, URL url) {
            JoranConfigurator joranConfigurator = new JoranConfigurator();
            joranConfigurator.setContext(loggerContext);
            if (list == null) {
                ReconfigureOnChangeFilter.this.addWarn("No previous configuration to fall back on.");
                return;
            }
            ReconfigureOnChangeFilter.this.addWarn("Falling back to previously registered safe configuration.");
            try {
                loggerContext.reset();
                new AndroidContextUtil().setupProperties(loggerContext);
                GenericConfigurator.informContextOfURLUsedForConfiguration(loggerContext, url);
                joranConfigurator.doConfigure(list);
                ReconfigureOnChangeFilter.this.addInfo("Re-registering previous fallback configuration once more as a fallback configuration point");
                joranConfigurator.registerSafeConfiguration(list);
            } catch (JoranException e) {
                ReconfigureOnChangeFilter.this.addError("Unexpected exception thrown by a configuration considered safe.", e);
            }
        }

        /* renamed from: b */
        public final void m51560b(LoggerContext loggerContext) {
            JoranConfigurator joranConfigurator = new JoranConfigurator();
            joranConfigurator.setContext(loggerContext);
            StatusUtil statusUtil = new StatusUtil(loggerContext);
            List<SaxEvent> recallSafeConfiguration = joranConfigurator.recallSafeConfiguration();
            URL mainWatchURL = ConfigurationWatchListUtil.getMainWatchURL(loggerContext);
            loggerContext.reset();
            new AndroidContextUtil().setupProperties(loggerContext);
            long currentTimeMillis = System.currentTimeMillis();
            try {
                joranConfigurator.doConfigure(ReconfigureOnChangeFilter.this.f39680f);
                if (statusUtil.hasXMLParsingErrors(currentTimeMillis)) {
                    m51561a(loggerContext, recallSafeConfiguration, mainWatchURL);
                }
            } catch (JoranException unused) {
                m51561a(loggerContext, recallSafeConfiguration, mainWatchURL);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            ReconfigureOnChangeFilter reconfigureOnChangeFilter = ReconfigureOnChangeFilter.this;
            if (reconfigureOnChangeFilter.f39680f == null) {
                reconfigureOnChangeFilter.addInfo("Due to missing top level configuration file, skipping reconfiguration");
                return;
            }
            LoggerContext loggerContext = (LoggerContext) ((ContextAwareBase) reconfigureOnChangeFilter).context;
            ReconfigureOnChangeFilter reconfigureOnChangeFilter2 = ReconfigureOnChangeFilter.this;
            reconfigureOnChangeFilter2.addInfo("Will reset and reconfigure context named [" + ((ContextAwareBase) ReconfigureOnChangeFilter.this).context.getName() + "]");
            if (ReconfigureOnChangeFilter.this.f39680f.toString().endsWith("xml")) {
                m51560b(loggerContext);
            }
        }
    }

    public boolean changeDetected(long j) {
        if (j >= this.nextCheck) {
            m51562k(j);
            return this.f39681g.changeDetected();
        }
        return false;
    }

    @Override // ch.qos.logback.classic.turbo.TurboFilter
    public FilterReply decide(Marker marker, Logger logger, Level level, String str, Object[] objArr, Throwable th2) {
        if (isStarted()) {
            long j = this.f39682h;
            this.f39682h = 1 + j;
            if ((j & this.f39683i) != this.f39683i) {
                return FilterReply.NEUTRAL;
            }
            long currentTimeMillis = System.currentTimeMillis();
            synchronized (this.f39681g) {
                try {
                    m51563j(currentTimeMillis);
                    if (changeDetected(currentTimeMillis)) {
                        m51564i();
                        m51565g();
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            return FilterReply.NEUTRAL;
        }
        return FilterReply.NEUTRAL;
    }

    /* renamed from: g */
    public void m51565g() {
        addInfo("Detected change in [" + this.f39681g.getCopyOfFileWatchList() + "]");
        this.context.getScheduledExecutorService().submit(new RunnableC5465a());
    }

    public long getRefreshPeriod() {
        return this.f39679e;
    }

    /* renamed from: i */
    public void m51564i() {
        this.nextCheck = Long.MAX_VALUE;
    }

    /* renamed from: j */
    public final void m51563j(long j) {
        long j2;
        long j3 = j - this.f39684j;
        this.f39684j = j;
        if (j3 < 100 && this.f39683i < WebSocketProtocol.PAYLOAD_SHORT_MAX) {
            j2 = (this.f39683i << 1) | 1;
        } else if (j3 <= 800) {
            return;
        } else {
            j2 = this.f39683i >>> 2;
        }
        this.f39683i = j2;
    }

    /* renamed from: k */
    public void m51562k(long j) {
        this.nextCheck = j + this.f39679e;
    }

    public void setRefreshPeriod(long j) {
        this.f39679e = j;
    }

    @Override // ch.qos.logback.classic.turbo.TurboFilter, ch.qos.logback.core.spi.LifeCycle
    public void start() {
        ConfigurationWatchList configurationWatchList = ConfigurationWatchListUtil.getConfigurationWatchList(this.context);
        this.f39681g = configurationWatchList;
        if (configurationWatchList == null) {
            addWarn("Empty ConfigurationWatchList in context");
            return;
        }
        URL mainURL = configurationWatchList.getMainURL();
        this.f39680f = mainURL;
        if (mainURL == null) {
            addWarn("Due to missing top level configuration file, automatic reconfiguration is impossible.");
            return;
        }
        List<File> copyOfFileWatchList = this.f39681g.getCopyOfFileWatchList();
        addInfo("Will scan for changes in [" + copyOfFileWatchList + "] every " + (this.f39679e / 1000) + " seconds. ");
        synchronized (this.f39681g) {
            m51562k(System.currentTimeMillis());
        }
        super.start();
    }

    public String toString() {
        return "ReconfigureOnChangeFilter{invocationCounter=" + this.f39682h + '}';
    }
}
