package ch.qos.logback.classic.net;

import ch.qos.logback.classic.PatternLayout;
import ch.qos.logback.classic.pattern.SyslogStartConverter;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.classic.spi.IThrowableProxy;
import ch.qos.logback.classic.spi.StackTraceElementProxy;
import ch.qos.logback.classic.util.LevelToSyslogSeverity;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.Layout;
import ch.qos.logback.core.net.SyslogAppenderBase;
import ch.qos.logback.core.net.SyslogOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.SocketException;
import java.net.UnknownHostException;

/* loaded from: classes.dex */
public class SyslogAppender extends SyslogAppenderBase<ILoggingEvent> {
    public static final String DEFAULT_STACKTRACE_PATTERN = "\t";
    public static final String DEFAULT_SUFFIX_PATTERN = "[%thread] %logger %msg";

    /* renamed from: o */
    public PatternLayout f39593o = new PatternLayout();

    /* renamed from: p */
    public String f39594p = DEFAULT_STACKTRACE_PATTERN;

    /* renamed from: q */
    public boolean f39595q = false;

    @Override // ch.qos.logback.core.net.SyslogAppenderBase
    public Layout<ILoggingEvent> buildLayout() {
        PatternLayout patternLayout = new PatternLayout();
        patternLayout.getInstanceConverterMap().put("syslogStart", SyslogStartConverter.class.getName());
        if (this.suffixPattern == null) {
            this.suffixPattern = DEFAULT_SUFFIX_PATTERN;
        }
        patternLayout.setPattern(m51600d() + this.suffixPattern);
        patternLayout.setContext(getContext());
        patternLayout.start();
        return patternLayout;
    }

    @Override // ch.qos.logback.core.net.SyslogAppenderBase
    public SyslogOutputStream createOutputStream() throws SocketException, UnknownHostException {
        return new SyslogOutputStream(getSyslogHost(), getPort());
    }

    /* renamed from: d */
    public String m51600d() {
        return "%syslogStart{" + getFacility() + "}%nopex{}";
    }

    /* renamed from: g */
    public final void m51599g(OutputStream outputStream, IThrowableProxy iThrowableProxy, String str, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        if (!z) {
            sb.append(CoreConstants.CAUSED_BY);
        }
        sb.append(iThrowableProxy.getClassName());
        sb.append(": ");
        sb.append(iThrowableProxy.getMessage());
        outputStream.write(sb.toString().getBytes());
        outputStream.flush();
    }

    @Override // ch.qos.logback.core.net.SyslogAppenderBase
    public int getSeverityForEvent(Object obj) {
        return LevelToSyslogSeverity.convert((ILoggingEvent) obj);
    }

    public String getStackTracePattern() {
        return this.f39594p;
    }

    /* renamed from: i */
    public final void m51598i() {
        this.f39593o.getInstanceConverterMap().put("syslogStart", SyslogStartConverter.class.getName());
        PatternLayout patternLayout = this.f39593o;
        patternLayout.setPattern(m51600d() + this.f39594p);
        this.f39593o.setContext(getContext());
        this.f39593o.start();
    }

    public boolean isThrowableExcluded() {
        return this.f39595q;
    }

    @Override // ch.qos.logback.core.net.SyslogAppenderBase
    public void postProcess(Object obj, OutputStream outputStream) {
        ILoggingEvent iLoggingEvent;
        IThrowableProxy throwableProxy;
        if (this.f39595q || (throwableProxy = (iLoggingEvent = (ILoggingEvent) obj).getThrowableProxy()) == null) {
            return;
        }
        String doLayout = this.f39593o.doLayout(iLoggingEvent);
        boolean z = true;
        while (throwableProxy != null) {
            StackTraceElementProxy[] stackTraceElementProxyArray = throwableProxy.getStackTraceElementProxyArray();
            try {
                m51599g(outputStream, throwableProxy, doLayout, z);
                for (StackTraceElementProxy stackTraceElementProxy : stackTraceElementProxyArray) {
                    outputStream.write((doLayout + stackTraceElementProxy).getBytes());
                    outputStream.flush();
                }
                throwableProxy = throwableProxy.getCause();
                z = false;
            } catch (IOException unused) {
                return;
            }
        }
    }

    public void setStackTracePattern(String str) {
        this.f39594p = str;
    }

    public void setThrowableExcluded(boolean z) {
        this.f39595q = z;
    }

    @Override // ch.qos.logback.core.net.SyslogAppenderBase, ch.qos.logback.core.AppenderBase, ch.qos.logback.core.spi.LifeCycle
    public void start() {
        super.start();
        m51598i();
    }
}