package ch.qos.logback.core.joran.util;

import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class PropertyDescriptor {

    /* renamed from: a */
    public Method f39832a;

    /* renamed from: b */
    public Method f39833b;

    /* renamed from: c */
    public String f39834c;

    /* renamed from: d */
    public Class f39835d;

    public PropertyDescriptor(String str) {
        this.f39834c = str;
    }

    public String getName() {
        return this.f39834c;
    }

    public Class<?> getPropertyType() {
        return this.f39835d;
    }

    public Method getReadMethod() {
        return this.f39833b;
    }

    public Method getWriteMethod() {
        return this.f39832a;
    }

    public void setPropertyType(Class<?> cls) {
        this.f39835d = cls;
    }

    public void setReadMethod(Method method) {
        this.f39833b = method;
    }

    public void setWriteMethod(Method method) {
        this.f39832a = method;
    }
}
