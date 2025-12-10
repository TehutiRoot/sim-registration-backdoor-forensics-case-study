package ch.qos.logback.core.util;

import ch.qos.logback.core.Context;
import ch.qos.logback.core.spi.ContextAwareBase;

/* loaded from: classes.dex */
public class InterruptUtil extends ContextAwareBase {

    /* renamed from: c */
    public final boolean f40180c;

    public InterruptUtil(Context context) {
        setContext(context);
        this.f40180c = Thread.currentThread().isInterrupted();
    }

    public void maskInterruptFlag() {
        if (this.f40180c) {
            Thread.interrupted();
        }
    }

    public void unmaskInterruptFlag() {
        if (this.f40180c) {
            try {
                Thread.currentThread().interrupt();
            } catch (SecurityException e) {
                addError("Failed to intrreupt current thread", e);
            }
        }
    }
}
