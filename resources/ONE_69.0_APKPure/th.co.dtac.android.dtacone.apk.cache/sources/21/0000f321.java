package org.apache.http.util;

import java.lang.reflect.Method;

@Deprecated
/* loaded from: classes6.dex */
public final class ExceptionUtils {

    /* renamed from: a */
    public static final Method f74728a = m24734a();

    /* renamed from: a */
    public static Method m24734a() {
        try {
            return Throwable.class.getMethod("initCause", Throwable.class);
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public static void initCause(Throwable th2, Throwable th3) {
        Method method = f74728a;
        if (method != null) {
            try {
                method.invoke(th2, th3);
            } catch (Exception unused) {
            }
        }
    }
}