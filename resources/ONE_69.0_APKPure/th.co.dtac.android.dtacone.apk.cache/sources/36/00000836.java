package p000;

import java.util.logging.Level;
import org.bson.diagnostics.Logger;

/* renamed from: Ig0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C17822Ig0 implements Logger {

    /* renamed from: a */
    public final java.util.logging.Logger f2742a;

    public C17822Ig0(String str) {
        this.f2742a = java.util.logging.Logger.getLogger(str);
    }

    /* renamed from: a */
    public final boolean m67998a(Level level) {
        return this.f2742a.isLoggable(level);
    }

    /* renamed from: b */
    public final void m67997b(Level level, String str) {
        this.f2742a.log(level, str);
    }

    /* renamed from: c */
    public void m67996c(Level level, String str, Throwable th2) {
        this.f2742a.log(level, str, th2);
    }

    @Override // org.bson.diagnostics.Logger
    public void debug(String str) {
        m67997b(Level.FINE, str);
    }

    @Override // org.bson.diagnostics.Logger
    public void error(String str) {
        m67997b(Level.SEVERE, str);
    }

    @Override // org.bson.diagnostics.Logger
    public String getName() {
        return this.f2742a.getName();
    }

    @Override // org.bson.diagnostics.Logger
    public void info(String str) {
        m67997b(Level.INFO, str);
    }

    @Override // org.bson.diagnostics.Logger
    public boolean isDebugEnabled() {
        return m67998a(Level.FINE);
    }

    @Override // org.bson.diagnostics.Logger
    public boolean isErrorEnabled() {
        return this.f2742a.isLoggable(Level.SEVERE);
    }

    @Override // org.bson.diagnostics.Logger
    public boolean isInfoEnabled() {
        return this.f2742a.isLoggable(Level.INFO);
    }

    @Override // org.bson.diagnostics.Logger
    public boolean isTraceEnabled() {
        return m67998a(Level.FINER);
    }

    @Override // org.bson.diagnostics.Logger
    public boolean isWarnEnabled() {
        return this.f2742a.isLoggable(Level.WARNING);
    }

    @Override // org.bson.diagnostics.Logger
    public void trace(String str) {
        m67997b(Level.FINER, str);
    }

    @Override // org.bson.diagnostics.Logger
    public void warn(String str) {
        m67997b(Level.WARNING, str);
    }

    @Override // org.bson.diagnostics.Logger
    public void debug(String str, Throwable th2) {
        m67996c(Level.FINE, str, th2);
    }

    @Override // org.bson.diagnostics.Logger
    public void error(String str, Throwable th2) {
        m67996c(Level.SEVERE, str, th2);
    }

    @Override // org.bson.diagnostics.Logger
    public void info(String str, Throwable th2) {
        m67996c(Level.INFO, str, th2);
    }

    @Override // org.bson.diagnostics.Logger
    public void trace(String str, Throwable th2) {
        m67996c(Level.FINER, str, th2);
    }

    @Override // org.bson.diagnostics.Logger
    public void warn(String str, Throwable th2) {
        m67996c(Level.WARNING, str, th2);
    }
}