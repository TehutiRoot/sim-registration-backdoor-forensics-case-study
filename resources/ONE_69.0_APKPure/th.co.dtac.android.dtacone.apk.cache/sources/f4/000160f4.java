package p000;

import org.bson.diagnostics.Logger;
import org.slf4j.LoggerFactory;

/* renamed from: xD1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C22996xD1 implements Logger {

    /* renamed from: a */
    public final org.slf4j.Logger f108681a;

    public C22996xD1(String str) {
        this.f108681a = LoggerFactory.getLogger(str);
    }

    @Override // org.bson.diagnostics.Logger
    public void debug(String str) {
        this.f108681a.debug(str);
    }

    @Override // org.bson.diagnostics.Logger
    public void error(String str) {
        this.f108681a.error(str);
    }

    @Override // org.bson.diagnostics.Logger
    public String getName() {
        return this.f108681a.getName();
    }

    @Override // org.bson.diagnostics.Logger
    public void info(String str) {
        this.f108681a.info(str);
    }

    @Override // org.bson.diagnostics.Logger
    public boolean isDebugEnabled() {
        return this.f108681a.isDebugEnabled();
    }

    @Override // org.bson.diagnostics.Logger
    public boolean isErrorEnabled() {
        return this.f108681a.isErrorEnabled();
    }

    @Override // org.bson.diagnostics.Logger
    public boolean isInfoEnabled() {
        return this.f108681a.isInfoEnabled();
    }

    @Override // org.bson.diagnostics.Logger
    public boolean isTraceEnabled() {
        return this.f108681a.isTraceEnabled();
    }

    @Override // org.bson.diagnostics.Logger
    public boolean isWarnEnabled() {
        return this.f108681a.isWarnEnabled();
    }

    @Override // org.bson.diagnostics.Logger
    public void trace(String str) {
        this.f108681a.trace(str);
    }

    @Override // org.bson.diagnostics.Logger
    public void warn(String str) {
        this.f108681a.warn(str);
    }

    @Override // org.bson.diagnostics.Logger
    public void debug(String str, Throwable th2) {
        this.f108681a.debug(str, th2);
    }

    @Override // org.bson.diagnostics.Logger
    public void error(String str, Throwable th2) {
        this.f108681a.error(str, th2);
    }

    @Override // org.bson.diagnostics.Logger
    public void info(String str, Throwable th2) {
        this.f108681a.info(str, th2);
    }

    @Override // org.bson.diagnostics.Logger
    public void trace(String str, Throwable th2) {
        this.f108681a.trace(str, th2);
    }

    @Override // org.bson.diagnostics.Logger
    public void warn(String str, Throwable th2) {
        this.f108681a.warn(str, th2);
    }
}