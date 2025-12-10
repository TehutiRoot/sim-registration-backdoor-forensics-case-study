package com.google.api.client.util;

/* loaded from: classes4.dex */
public final class Throwables {
    public static RuntimeException propagate(Throwable th2) {
        return com.google.common.base.Throwables.propagate(th2);
    }

    public static void propagateIfPossible(Throwable th2) {
        if (th2 != null) {
            com.google.common.base.Throwables.throwIfUnchecked(th2);
        }
    }

    public static <X extends Throwable> void propagateIfPossible(Throwable th2, Class<X> cls) throws Throwable {
        com.google.common.base.Throwables.propagateIfPossible(th2, cls);
    }
}