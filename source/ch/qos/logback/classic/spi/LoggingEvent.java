package ch.qos.logback.classic.spi;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;
import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.util.LogbackMDCAdapter;
import java.util.Collections;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.slf4j.MDC;
import org.slf4j.Marker;
import org.slf4j.helpers.MessageFormatter;
import org.slf4j.spi.MDCAdapter;

/* loaded from: classes.dex */
public class LoggingEvent implements ILoggingEvent {

    /* renamed from: a */
    public transient String f39640a;

    /* renamed from: b */
    public String f39641b;

    /* renamed from: c */
    public String f39642c;

    /* renamed from: d */
    public LoggerContext f39643d;

    /* renamed from: e */
    public LoggerContextVO f39644e;

    /* renamed from: f */
    public transient Level f39645f;

    /* renamed from: g */
    public String f39646g;

    /* renamed from: h */
    public transient String f39647h;

    /* renamed from: i */
    public transient Object[] f39648i;

    /* renamed from: j */
    public ThrowableProxy f39649j;

    /* renamed from: k */
    public StackTraceElement[] f39650k;

    /* renamed from: l */
    public Marker f39651l;

    /* renamed from: m */
    public Map f39652m;

    /* renamed from: n */
    public long f39653n;

    public LoggingEvent() {
    }

    /* renamed from: a */
    public final Throwable m51583a(Object[] objArr) {
        Throwable extractThrowable = EventArgUtil.extractThrowable(objArr);
        if (EventArgUtil.successfulExtraction(extractThrowable)) {
            this.f39648i = EventArgUtil.trimmedCopy(objArr);
        }
        return extractThrowable;
    }

    @Override // ch.qos.logback.classic.spi.ILoggingEvent
    public Object[] getArgumentArray() {
        return this.f39648i;
    }

    @Override // ch.qos.logback.classic.spi.ILoggingEvent
    public StackTraceElement[] getCallerData() {
        if (this.f39650k == null) {
            this.f39650k = CallerData.extract(new Throwable(), this.f39640a, this.f39643d.getMaxCallerDataDepth(), this.f39643d.getFrameworkPackages());
        }
        return this.f39650k;
    }

    public long getContextBirthTime() {
        return this.f39644e.getBirthTime();
    }

    @Override // ch.qos.logback.classic.spi.ILoggingEvent
    public String getFormattedMessage() {
        String str = this.f39647h;
        if (str != null) {
            return str;
        }
        Object[] objArr = this.f39648i;
        this.f39647h = objArr != null ? MessageFormatter.arrayFormat(this.f39646g, objArr).getMessage() : this.f39646g;
        return this.f39647h;
    }

    @Override // ch.qos.logback.classic.spi.ILoggingEvent
    public Level getLevel() {
        return this.f39645f;
    }

    @Override // ch.qos.logback.classic.spi.ILoggingEvent
    public LoggerContextVO getLoggerContextVO() {
        return this.f39644e;
    }

    @Override // ch.qos.logback.classic.spi.ILoggingEvent
    public String getLoggerName() {
        return this.f39642c;
    }

    @Override // ch.qos.logback.classic.spi.ILoggingEvent
    public Map<String, String> getMDCPropertyMap() {
        if (this.f39652m == null) {
            MDCAdapter mDCAdapter = MDC.getMDCAdapter();
            this.f39652m = mDCAdapter instanceof LogbackMDCAdapter ? ((LogbackMDCAdapter) mDCAdapter).getPropertyMap() : mDCAdapter.getCopyOfContextMap();
        }
        if (this.f39652m == null) {
            this.f39652m = Collections.emptyMap();
        }
        return this.f39652m;
    }

    @Override // ch.qos.logback.classic.spi.ILoggingEvent
    public Marker getMarker() {
        return this.f39651l;
    }

    @Override // ch.qos.logback.classic.spi.ILoggingEvent
    public Map<String, String> getMdc() {
        return getMDCPropertyMap();
    }

    @Override // ch.qos.logback.classic.spi.ILoggingEvent
    public String getMessage() {
        return this.f39646g;
    }

    @Override // ch.qos.logback.classic.spi.ILoggingEvent
    public String getThreadName() {
        if (this.f39641b == null) {
            this.f39641b = Thread.currentThread().getName();
        }
        return this.f39641b;
    }

    @Override // ch.qos.logback.classic.spi.ILoggingEvent
    public IThrowableProxy getThrowableProxy() {
        return this.f39649j;
    }

    @Override // ch.qos.logback.classic.spi.ILoggingEvent
    public long getTimeStamp() {
        return this.f39653n;
    }

    @Override // ch.qos.logback.classic.spi.ILoggingEvent
    public boolean hasCallerData() {
        return this.f39650k != null;
    }

    @Override // ch.qos.logback.classic.spi.ILoggingEvent, ch.qos.logback.core.spi.DeferredProcessingAware
    public void prepareForDeferredProcessing() {
        getFormattedMessage();
        getThreadName();
        getMDCPropertyMap();
    }

    public void setArgumentArray(Object[] objArr) {
        if (this.f39648i != null) {
            throw new IllegalStateException("argArray has been already set");
        }
        this.f39648i = objArr;
    }

    public void setCallerData(StackTraceElement[] stackTraceElementArr) {
        this.f39650k = stackTraceElementArr;
    }

    public void setLevel(Level level) {
        if (this.f39645f != null) {
            throw new IllegalStateException("The level has been already set for this event.");
        }
        this.f39645f = level;
    }

    public void setLoggerContextRemoteView(LoggerContextVO loggerContextVO) {
        this.f39644e = loggerContextVO;
    }

    public void setLoggerName(String str) {
        this.f39642c = str;
    }

    public void setMDCPropertyMap(Map<String, String> map) {
        if (this.f39652m != null) {
            throw new IllegalStateException("The MDCPropertyMap has been already set for this event.");
        }
        this.f39652m = map;
    }

    public void setMarker(Marker marker) {
        if (this.f39651l != null) {
            throw new IllegalStateException("The marker has been already set for this event.");
        }
        this.f39651l = marker;
    }

    public void setMessage(String str) {
        if (this.f39646g != null) {
            throw new IllegalStateException("The message for this event has been set already.");
        }
        this.f39646g = str;
    }

    public void setThreadName(String str) throws IllegalStateException {
        if (this.f39641b != null) {
            throw new IllegalStateException("threadName has been already set");
        }
        this.f39641b = str;
    }

    public void setThrowableProxy(ThrowableProxy throwableProxy) {
        if (this.f39649j != null) {
            throw new IllegalStateException("ThrowableProxy has been already set.");
        }
        this.f39649j = throwableProxy;
    }

    public void setTimeStamp(long j) {
        this.f39653n = j;
    }

    public String toString() {
        return AbstractJsonLexerKt.BEGIN_LIST + this.f39645f + "] " + getFormattedMessage();
    }

    public LoggingEvent(String str, Logger logger, Level level, String str2, Throwable th2, Object[] objArr) {
        this.f39640a = str;
        this.f39642c = logger.getName();
        LoggerContext loggerContext = logger.getLoggerContext();
        this.f39643d = loggerContext;
        this.f39644e = loggerContext.getLoggerContextRemoteView();
        this.f39645f = level;
        this.f39646g = str2;
        this.f39648i = objArr;
        th2 = th2 == null ? m51583a(objArr) : th2;
        if (th2 != null) {
            this.f39649j = new ThrowableProxy(th2);
            if (logger.getLoggerContext().isPackagingDataEnabled()) {
                this.f39649j.calculatePackagingData();
            }
        }
        this.f39653n = System.currentTimeMillis();
    }
}
