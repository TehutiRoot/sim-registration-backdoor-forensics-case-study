package ch.qos.logback.core.joran.util;

import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class PropertyDescriptor {

    /* renamed from: a */
    public Method f39830a;

    /* renamed from: b */
    public Method f39831b;

    /* renamed from: c */
    public String f39832c;

    /* renamed from: d */
    public Class f39833d;

    public PropertyDescriptor(String str) {
        this.f39832c = str;
    }

    public String getName() {
        return this.f39832c;
    }

    public Class<?> getPropertyType() {
        return this.f39833d;
    }

    public Method getReadMethod() {
        return this.f39831b;
    }

    public Method getWriteMethod() {
        return this.f39830a;
    }

    public void setPropertyType(Class<?> cls) {
        this.f39833d = cls;
    }

    public void setReadMethod(Method method) {
        this.f39831b = method;
    }

    public void setWriteMethod(Method method) {
        this.f39830a = method;
    }
}