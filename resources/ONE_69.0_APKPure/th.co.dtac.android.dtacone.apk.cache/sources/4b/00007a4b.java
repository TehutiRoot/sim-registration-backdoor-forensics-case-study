package ch.qos.logback.core.joran.util;

import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class MethodDescriptor {

    /* renamed from: a */
    public String f39828a;

    /* renamed from: b */
    public Method f39829b;

    public MethodDescriptor(String str, Method method) {
        this.f39828a = str;
        this.f39829b = method;
    }

    public Method getMethod() {
        return this.f39829b;
    }

    public String getName() {
        return this.f39828a;
    }
}