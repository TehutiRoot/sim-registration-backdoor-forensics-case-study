package ch.qos.logback.classic.selector;

import ch.qos.logback.classic.LoggerContext;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public class DefaultContextSelector implements ContextSelector {

    /* renamed from: a */
    public LoggerContext f39634a;

    public DefaultContextSelector(LoggerContext loggerContext) {
        this.f39634a = loggerContext;
    }

    @Override // ch.qos.logback.classic.selector.ContextSelector
    public LoggerContext detachLoggerContext(String str) {
        return this.f39634a;
    }

    @Override // ch.qos.logback.classic.selector.ContextSelector
    public List<String> getContextNames() {
        return Arrays.asList(this.f39634a.getName());
    }

    @Override // ch.qos.logback.classic.selector.ContextSelector
    public LoggerContext getDefaultLoggerContext() {
        return this.f39634a;
    }

    @Override // ch.qos.logback.classic.selector.ContextSelector
    public LoggerContext getLoggerContext() {
        return getDefaultLoggerContext();
    }

    @Override // ch.qos.logback.classic.selector.ContextSelector
    public LoggerContext getLoggerContext(String str) {
        if (this.f39634a.getName().equals(str)) {
            return this.f39634a;
        }
        return null;
    }
}
