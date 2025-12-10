package org.apache.commons.logging.impl;

import org.apache.avalon.framework.logger.Logger;
import org.apache.commons.logging.Log;

/* loaded from: classes6.dex */
public class AvalonLogger implements Log {

    /* renamed from: b */
    public static volatile Logger f73599b;

    /* renamed from: a */
    public final transient Logger f73600a;

    public AvalonLogger(Logger logger) {
        this.f73600a = logger;
    }

    public static void setDefaultLogger(Logger logger) {
        f73599b = logger;
    }

    @Override // org.apache.commons.logging.Log
    public void debug(Object obj, Throwable th2) {
        if (getLogger().isDebugEnabled()) {
            getLogger().debug(String.valueOf(obj), th2);
        }
    }

    @Override // org.apache.commons.logging.Log
    public void error(Object obj, Throwable th2) {
        if (getLogger().isErrorEnabled()) {
            getLogger().error(String.valueOf(obj), th2);
        }
    }

    @Override // org.apache.commons.logging.Log
    public void fatal(Object obj, Throwable th2) {
        if (getLogger().isFatalErrorEnabled()) {
            getLogger().fatalError(String.valueOf(obj), th2);
        }
    }

    public Logger getLogger() {
        return this.f73600a;
    }

    @Override // org.apache.commons.logging.Log
    public void info(Object obj, Throwable th2) {
        if (getLogger().isInfoEnabled()) {
            getLogger().info(String.valueOf(obj), th2);
        }
    }

    @Override // org.apache.commons.logging.Log
    public boolean isDebugEnabled() {
        return getLogger().isDebugEnabled();
    }

    @Override // org.apache.commons.logging.Log
    public boolean isErrorEnabled() {
        return getLogger().isErrorEnabled();
    }

    @Override // org.apache.commons.logging.Log
    public boolean isFatalEnabled() {
        return getLogger().isFatalErrorEnabled();
    }

    @Override // org.apache.commons.logging.Log
    public boolean isInfoEnabled() {
        return getLogger().isInfoEnabled();
    }

    @Override // org.apache.commons.logging.Log
    public boolean isTraceEnabled() {
        return getLogger().isDebugEnabled();
    }

    @Override // org.apache.commons.logging.Log
    public boolean isWarnEnabled() {
        return getLogger().isWarnEnabled();
    }

    @Override // org.apache.commons.logging.Log
    public void trace(Object obj, Throwable th2) {
        if (getLogger().isDebugEnabled()) {
            getLogger().debug(String.valueOf(obj), th2);
        }
    }

    @Override // org.apache.commons.logging.Log
    public void warn(Object obj, Throwable th2) {
        if (getLogger().isWarnEnabled()) {
            getLogger().warn(String.valueOf(obj), th2);
        }
    }

    public AvalonLogger(String str) {
        if (f73599b != null) {
            this.f73600a = f73599b.getChildLogger(str);
            return;
        }
        throw new NullPointerException("default logger has to be specified if this constructor is used!");
    }

    @Override // org.apache.commons.logging.Log
    public void debug(Object obj) {
        if (getLogger().isDebugEnabled()) {
            getLogger().debug(String.valueOf(obj));
        }
    }

    @Override // org.apache.commons.logging.Log
    public void error(Object obj) {
        if (getLogger().isErrorEnabled()) {
            getLogger().error(String.valueOf(obj));
        }
    }

    @Override // org.apache.commons.logging.Log
    public void fatal(Object obj) {
        if (getLogger().isFatalErrorEnabled()) {
            getLogger().fatalError(String.valueOf(obj));
        }
    }

    @Override // org.apache.commons.logging.Log
    public void info(Object obj) {
        if (getLogger().isInfoEnabled()) {
            getLogger().info(String.valueOf(obj));
        }
    }

    @Override // org.apache.commons.logging.Log
    public void trace(Object obj) {
        if (getLogger().isDebugEnabled()) {
            getLogger().debug(String.valueOf(obj));
        }
    }

    @Override // org.apache.commons.logging.Log
    public void warn(Object obj) {
        if (getLogger().isWarnEnabled()) {
            getLogger().warn(String.valueOf(obj));
        }
    }
}
