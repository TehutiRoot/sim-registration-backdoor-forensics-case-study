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
    public PatternLayout f39595o = new PatternLayout();

    /* renamed from: p */
    public String f39596p = DEFAULT_STACKTRACE_PATTERN;

    /* renamed from: q */
    public boolean f39597q = false;

    @Override // ch.qos.logback.core.net.SyslogAppenderBase
    public Layout<ILoggingEvent> buildLayout() {
        PatternLayout patternLayout = new PatternLayout();
        patternLayout.getInstanceConverterMap().put("syslogStart", SyslogStartConverter.class.getName());
        if (this.suffixPattern == null) {
            this.suffixPattern = DEFAULT_SUFFIX_PATTERN;
        }
        patternLayout.setPattern(m51605d() + this.suffixPattern);
        patternLayout.setContext(getContext());
        patternLayout.start();
        return patternLayout;
    }

    @Override // ch.qos.logback.core.net.SyslogAppenderBase
    public SyslogOutputStream createOutputStream() throws SocketException, UnknownHostException {
        return new SyslogOutputStream(getSyslogHost(), getPort());
    }

    /* renamed from: d */
    public String m51605d() {
        return "%syslogStart{" + getFacility() + "}%nopex{}";
    }

    /* renamed from: g */
    public final void m51604g(OutputStream outputStream, IThrowableProxy iThrowableProxy, String str, boolean z) {
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
        return this.f39596p;
    }

    /* renamed from: i */
    public final void m51603i() {
        this.f39595o.getInstanceConverterMap().put("syslogStart", SyslogStartConverter.class.getName());
        PatternLayout patternLayout = this.f39595o;
        patternLayout.setPattern(m51605d() + this.f39596p);
        this.f39595o.setContext(getContext());
        this.f39595o.start();
    }

    public boolean isThrowableExcluded() {
        return this.f39597q;
    }

    @Override // ch.qos.logback.core.net.SyslogAppenderBase
    public void postProcess(Object obj, OutputStream outputStream) {
        ILoggingEvent iLoggingEvent;
        IThrowableProxy throwableProxy;
        if (this.f39597q || (throwableProxy = (iLoggingEvent = (ILoggingEvent) obj).getThrowableProxy()) == null) {
            return;
        }
        String doLayout = this.f39595o.doLayout(iLoggingEvent);
        boolean z = true;
        while (throwableProxy != null) {
            StackTraceElementProxy[] stackTraceElementProxyArray = throwableProxy.getStackTraceElementProxyArray();
            try {
                m51604g(outputStream, throwableProxy, doLayout, z);
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
        this.f39596p = str;
    }

    public void setThrowableExcluded(boolean z) {
        this.f39597q = z;
    }

    @Override // ch.qos.logback.core.net.SyslogAppenderBase, ch.qos.logback.core.AppenderBase, ch.qos.logback.core.spi.LifeCycle
    public void start() {
        super.start();
        m51603i();
    }
}
