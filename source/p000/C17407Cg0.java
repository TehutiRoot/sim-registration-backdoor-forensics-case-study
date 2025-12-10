package p000;

import java.util.logging.Level;
import org.bson.diagnostics.Logger;

/* renamed from: Cg0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C17407Cg0 implements Logger {

    /* renamed from: a */
    public final java.util.logging.Logger f794a;

    public C17407Cg0(String str) {
        this.f794a = java.util.logging.Logger.getLogger(str);
    }

    /* renamed from: a */
    public final boolean m68749a(Level level) {
        return this.f794a.isLoggable(level);
    }

    /* renamed from: b */
    public final void m68748b(Level level, String str) {
        this.f794a.log(level, str);
    }

    /* renamed from: c */
    public void m68747c(Level level, String str, Throwable th2) {
        this.f794a.log(level, str, th2);
    }

    @Override // org.bson.diagnostics.Logger
    public void debug(String str) {
        m68748b(Level.FINE, str);
    }

    @Override // org.bson.diagnostics.Logger
    public void error(String str) {
        m68748b(Level.SEVERE, str);
    }

    @Override // org.bson.diagnostics.Logger
    public String getName() {
        return this.f794a.getName();
    }

    @Override // org.bson.diagnostics.Logger
    public void info(String str) {
        m68748b(Level.INFO, str);
    }

    @Override // org.bson.diagnostics.Logger
    public boolean isDebugEnabled() {
        return m68749a(Level.FINE);
    }

    @Override // org.bson.diagnostics.Logger
    public boolean isErrorEnabled() {
        return this.f794a.isLoggable(Level.SEVERE);
    }

    @Override // org.bson.diagnostics.Logger
    public boolean isInfoEnabled() {
        return this.f794a.isLoggable(Level.INFO);
    }

    @Override // org.bson.diagnostics.Logger
    public boolean isTraceEnabled() {
        return m68749a(Level.FINER);
    }

    @Override // org.bson.diagnostics.Logger
    public boolean isWarnEnabled() {
        return this.f794a.isLoggable(Level.WARNING);
    }

    @Override // org.bson.diagnostics.Logger
    public void trace(String str) {
        m68748b(Level.FINER, str);
    }

    @Override // org.bson.diagnostics.Logger
    public void warn(String str) {
        m68748b(Level.WARNING, str);
    }

    @Override // org.bson.diagnostics.Logger
    public void debug(String str, Throwable th2) {
        m68747c(Level.FINE, str, th2);
    }

    @Override // org.bson.diagnostics.Logger
    public void error(String str, Throwable th2) {
        m68747c(Level.SEVERE, str, th2);
    }

    @Override // org.bson.diagnostics.Logger
    public void info(String str, Throwable th2) {
        m68747c(Level.INFO, str, th2);
    }

    @Override // org.bson.diagnostics.Logger
    public void trace(String str, Throwable th2) {
        m68747c(Level.FINER, str, th2);
    }

    @Override // org.bson.diagnostics.Logger
    public void warn(String str, Throwable th2) {
        m68747c(Level.WARNING, str, th2);
    }
}
