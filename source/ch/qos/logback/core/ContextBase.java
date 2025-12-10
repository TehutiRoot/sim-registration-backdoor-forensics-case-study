package ch.qos.logback.core;

import ch.qos.logback.core.spi.LifeCycle;
import ch.qos.logback.core.spi.LogbackLock;
import ch.qos.logback.core.status.StatusManager;
import ch.qos.logback.core.util.ExecutorServiceUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;

/* loaded from: classes.dex */
public class ContextBase implements Context, LifeCycle {

    /* renamed from: b */
    public String f39711b;

    /* renamed from: g */
    public ScheduledExecutorService f39716g;

    /* renamed from: h */
    public LifeCycleManager f39717h;

    /* renamed from: i */
    public boolean f39718i;

    /* renamed from: a */
    public long f39710a = System.currentTimeMillis();

    /* renamed from: c */
    public StatusManager f39712c = new BasicStatusManager();

    /* renamed from: d */
    public Map f39713d = new HashMap();

    /* renamed from: e */
    public Map f39714e = new HashMap();

    /* renamed from: f */
    public LogbackLock f39715f = new LogbackLock();
    protected List<ScheduledFuture<?>> scheduledFutures = new ArrayList(1);

    public ContextBase() {
        initCollisionMaps();
    }

    /* renamed from: a */
    public synchronized LifeCycleManager m51545a() {
        try {
            if (this.f39717h == null) {
                this.f39717h = new LifeCycleManager();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f39717h;
    }

    @Override // ch.qos.logback.core.Context
    public void addScheduledFuture(ScheduledFuture<?> scheduledFuture) {
        this.scheduledFutures.add(scheduledFuture);
    }

    /* renamed from: b */
    public final void m51544b() {
        Thread thread = (Thread) getObject(CoreConstants.SHUTDOWN_HOOK_THREAD);
        if (thread != null) {
            removeObject(CoreConstants.SHUTDOWN_HOOK_THREAD);
            try {
                Runtime.getRuntime().removeShutdownHook(thread);
            } catch (IllegalStateException unused) {
            }
        }
    }

    /* renamed from: c */
    public final synchronized void m51543c() {
        ScheduledExecutorService scheduledExecutorService = this.f39716g;
        if (scheduledExecutorService != null) {
            ExecutorServiceUtil.shutdown(scheduledExecutorService);
            this.f39716g = null;
        }
    }

    @Override // ch.qos.logback.core.Context
    public long getBirthTime() {
        return this.f39710a;
    }

    @Override // ch.qos.logback.core.Context
    public Object getConfigurationLock() {
        return this.f39715f;
    }

    @Override // ch.qos.logback.core.Context, ch.qos.logback.core.spi.PropertyContainer
    public Map<String, String> getCopyOfPropertyMap() {
        return new HashMap(this.f39713d);
    }

    @Override // ch.qos.logback.core.Context
    public synchronized ExecutorService getExecutorService() {
        return getScheduledExecutorService();
    }

    @Override // ch.qos.logback.core.Context
    public String getName() {
        return this.f39711b;
    }

    @Override // ch.qos.logback.core.Context
    public Object getObject(String str) {
        return this.f39714e.get(str);
    }

    @Override // ch.qos.logback.core.Context, ch.qos.logback.core.spi.PropertyContainer
    public String getProperty(String str) {
        return CoreConstants.CONTEXT_NAME_KEY.equals(str) ? getName() : (String) this.f39713d.get(str);
    }

    @Override // ch.qos.logback.core.Context
    public synchronized ScheduledExecutorService getScheduledExecutorService() {
        try {
            if (this.f39716g == null) {
                this.f39716g = ExecutorServiceUtil.newScheduledExecutorService();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f39716g;
    }

    public List<ScheduledFuture<?>> getScheduledFutures() {
        return new ArrayList(this.scheduledFutures);
    }

    @Override // ch.qos.logback.core.Context
    public StatusManager getStatusManager() {
        return this.f39712c;
    }

    public void initCollisionMaps() {
        putObject(CoreConstants.FA_FILENAME_COLLISION_MAP, new HashMap());
        putObject(CoreConstants.RFA_FILENAME_PATTERN_COLLISION_MAP, new HashMap());
    }

    @Override // ch.qos.logback.core.spi.LifeCycle
    public boolean isStarted() {
        return this.f39718i;
    }

    @Override // ch.qos.logback.core.Context
    public void putObject(String str, Object obj) {
        this.f39714e.put(str, obj);
    }

    @Override // ch.qos.logback.core.Context
    public void putProperty(String str, String str2) {
        this.f39713d.put(str, str2);
    }

    @Override // ch.qos.logback.core.Context
    public void register(LifeCycle lifeCycle) {
        m51545a().register(lifeCycle);
    }

    public void removeObject(String str) {
        this.f39714e.remove(str);
    }

    public void reset() {
        m51544b();
        m51545a().reset();
        this.f39713d.clear();
        this.f39714e.clear();
    }

    @Override // ch.qos.logback.core.Context
    public void setName(String str) throws IllegalStateException {
        if (str == null || !str.equals(this.f39711b)) {
            String str2 = this.f39711b;
            if (str2 != null && !"default".equals(str2)) {
                throw new IllegalStateException("Context has been already given a name");
            }
            this.f39711b = str;
        }
    }

    public void setStatusManager(StatusManager statusManager) {
        if (statusManager == null) {
            throw new IllegalArgumentException("null StatusManager not allowed");
        }
        this.f39712c = statusManager;
    }

    public void start() {
        this.f39718i = true;
    }

    public void stop() {
        m51543c();
        this.f39718i = false;
    }

    public String toString() {
        return this.f39711b;
    }
}
