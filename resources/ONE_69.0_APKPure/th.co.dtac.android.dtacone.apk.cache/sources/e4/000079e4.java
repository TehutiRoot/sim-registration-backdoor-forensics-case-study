package ch.qos.logback.classic.util;

import ch.qos.logback.classic.ClassicConstants;
import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.selector.ContextSelector;
import ch.qos.logback.classic.selector.DefaultContextSelector;
import ch.qos.logback.core.util.Loader;
import ch.qos.logback.core.util.OptionHelper;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public class ContextSelectorStaticBinder {

    /* renamed from: c */
    public static ContextSelectorStaticBinder f39688c = new ContextSelectorStaticBinder();

    /* renamed from: a */
    public ContextSelector f39689a;

    /* renamed from: b */
    public Object f39690b;

    /* renamed from: a */
    public static ContextSelector m51550a(LoggerContext loggerContext, String str) {
        return (ContextSelector) Loader.loadClass(str).getConstructor(LoggerContext.class).newInstance(loggerContext);
    }

    public static ContextSelectorStaticBinder getSingleton() {
        return f39688c;
    }

    public ContextSelector getContextSelector() {
        return this.f39689a;
    }

    public void init(LoggerContext loggerContext, Object obj) throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        Object obj2 = this.f39690b;
        if (obj2 == null) {
            this.f39690b = obj;
        } else if (obj2 != obj) {
            throw new IllegalAccessException("Only certain classes can access this method.");
        }
        String systemProperty = OptionHelper.getSystemProperty(ClassicConstants.LOGBACK_CONTEXT_SELECTOR);
        if (systemProperty == null) {
            this.f39689a = new DefaultContextSelector(loggerContext);
        } else if (systemProperty.equals("JNDI")) {
            throw new RuntimeException("JNDI not supported");
        } else {
            this.f39689a = m51550a(loggerContext, systemProperty);
        }
    }
}