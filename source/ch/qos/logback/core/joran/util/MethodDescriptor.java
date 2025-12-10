package ch.qos.logback.core.joran.util;

import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class MethodDescriptor {

    /* renamed from: a */
    public String f39830a;

    /* renamed from: b */
    public Method f39831b;

    public MethodDescriptor(String str, Method method) {
        this.f39830a = str;
        this.f39831b = method;
    }

    public Method getMethod() {
        return this.f39831b;
    }

    public String getName() {
        return this.f39830a;
    }
}
