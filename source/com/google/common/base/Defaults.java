package com.google.common.base;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import javax.annotation.CheckForNull;

@J2ktIncompatible
@GwtIncompatible
/* loaded from: classes4.dex */
public final class Defaults {

    /* renamed from: a */
    public static final Double f52736a = Double.valueOf(0.0d);

    /* renamed from: b */
    public static final Float f52737b = Float.valueOf(0.0f);

    @CheckForNull
    public static <T> T defaultValue(Class<T> cls) {
        Preconditions.checkNotNull(cls);
        if (cls.isPrimitive()) {
            if (cls == Boolean.TYPE) {
                return (T) Boolean.FALSE;
            }
            if (cls == Character.TYPE) {
                return (T) (char) 0;
            }
            if (cls == Byte.TYPE) {
                return (T) (byte) 0;
            }
            if (cls == Short.TYPE) {
                return (T) (short) 0;
            }
            if (cls == Integer.TYPE) {
                return (T) 0;
            }
            if (cls == Long.TYPE) {
                return (T) 0L;
            }
            if (cls == Float.TYPE) {
                return (T) f52737b;
            }
            if (cls == Double.TYPE) {
                return (T) f52736a;
            }
            return null;
        }
        return null;
    }
}
