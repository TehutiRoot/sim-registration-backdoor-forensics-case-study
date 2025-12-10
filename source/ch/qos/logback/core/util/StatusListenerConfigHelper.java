package ch.qos.logback.core.util;

import ch.qos.logback.core.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.spi.ContextAware;
import ch.qos.logback.core.spi.LifeCycle;
import ch.qos.logback.core.status.OnConsoleStatusListener;
import ch.qos.logback.core.status.StatusListener;

/* loaded from: classes.dex */
public class StatusListenerConfigHelper {
    /* renamed from: a */
    public static void m51318a(Context context, String str) {
        m51316c(context, m51317b(context, str));
    }

    public static void addOnConsoleListenerInstance(Context context, OnConsoleStatusListener onConsoleStatusListener) {
        onConsoleStatusListener.setContext(context);
        if (context.getStatusManager().add(onConsoleStatusListener)) {
            onConsoleStatusListener.start();
        }
    }

    /* renamed from: b */
    public static StatusListener m51317b(Context context, String str) {
        try {
            return (StatusListener) OptionHelper.instantiateByClassName(str, StatusListener.class, context);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: c */
    public static void m51316c(Context context, StatusListener statusListener) {
        if (statusListener != null) {
            if (statusListener instanceof ContextAware) {
                ((ContextAware) statusListener).setContext(context);
            }
            if (context.getStatusManager().add(statusListener) && (statusListener instanceof LifeCycle)) {
                ((LifeCycle) statusListener).start();
            }
        }
    }

    public static void installIfAsked(Context context) {
        String systemProperty = OptionHelper.getSystemProperty(CoreConstants.STATUS_LISTENER_CLASS);
        if (OptionHelper.isEmpty(systemProperty)) {
            return;
        }
        m51318a(context, systemProperty);
    }
}
