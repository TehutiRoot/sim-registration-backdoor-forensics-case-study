package p000;

import org.bson.diagnostics.Logger;
import org.slf4j.LoggerFactory;

/* renamed from: AC1 */
/* loaded from: classes6.dex */
public class AC1 implements Logger {

    /* renamed from: a */
    public final org.slf4j.Logger f43a;

    public AC1(String str) {
        this.f43a = LoggerFactory.getLogger(str);
    }

    @Override // org.bson.diagnostics.Logger
    public void debug(String str) {
        this.f43a.debug(str);
    }

    @Override // org.bson.diagnostics.Logger
    public void error(String str) {
        this.f43a.error(str);
    }

    @Override // org.bson.diagnostics.Logger
    public String getName() {
        return this.f43a.getName();
    }

    @Override // org.bson.diagnostics.Logger
    public void info(String str) {
        this.f43a.info(str);
    }

    @Override // org.bson.diagnostics.Logger
    public boolean isDebugEnabled() {
        return this.f43a.isDebugEnabled();
    }

    @Override // org.bson.diagnostics.Logger
    public boolean isErrorEnabled() {
        return this.f43a.isErrorEnabled();
    }

    @Override // org.bson.diagnostics.Logger
    public boolean isInfoEnabled() {
        return this.f43a.isInfoEnabled();
    }

    @Override // org.bson.diagnostics.Logger
    public boolean isTraceEnabled() {
        return this.f43a.isTraceEnabled();
    }

    @Override // org.bson.diagnostics.Logger
    public boolean isWarnEnabled() {
        return this.f43a.isWarnEnabled();
    }

    @Override // org.bson.diagnostics.Logger
    public void trace(String str) {
        this.f43a.trace(str);
    }

    @Override // org.bson.diagnostics.Logger
    public void warn(String str) {
        this.f43a.warn(str);
    }

    @Override // org.bson.diagnostics.Logger
    public void debug(String str, Throwable th2) {
        this.f43a.debug(str, th2);
    }

    @Override // org.bson.diagnostics.Logger
    public void error(String str, Throwable th2) {
        this.f43a.error(str, th2);
    }

    @Override // org.bson.diagnostics.Logger
    public void info(String str, Throwable th2) {
        this.f43a.info(str, th2);
    }

    @Override // org.bson.diagnostics.Logger
    public void trace(String str, Throwable th2) {
        this.f43a.trace(str, th2);
    }

    @Override // org.bson.diagnostics.Logger
    public void warn(String str, Throwable th2) {
        this.f43a.warn(str, th2);
    }
}
