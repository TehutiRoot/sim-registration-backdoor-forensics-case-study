package org.bson.diagnostics;

/* loaded from: classes6.dex */
public interface Logger {
    void debug(String str);

    void debug(String str, Throwable th2);

    void error(String str);

    void error(String str, Throwable th2);

    String getName();

    void info(String str);

    void info(String str, Throwable th2);

    boolean isDebugEnabled();

    boolean isErrorEnabled();

    boolean isInfoEnabled();

    boolean isTraceEnabled();

    boolean isWarnEnabled();

    void trace(String str);

    void trace(String str, Throwable th2);

    void warn(String str);

    void warn(String str, Throwable th2);
}
