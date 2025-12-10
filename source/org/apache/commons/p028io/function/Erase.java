package org.apache.commons.p028io.function;

import java.io.IOException;

/* renamed from: org.apache.commons.io.function.Erase */
/* loaded from: classes6.dex */
public final class Erase {
    /* renamed from: a */
    public static void m25236a(IOBiConsumer iOBiConsumer, Object obj, Object obj2) {
        try {
            iOBiConsumer.accept(obj, obj2);
        } catch (IOException e) {
            rethrow(e);
        }
    }

    /* renamed from: b */
    public static void m25235b(IOConsumer iOConsumer, Object obj) {
        try {
            iOConsumer.accept(obj);
        } catch (IOException e) {
            rethrow(e);
        }
    }

    /* renamed from: c */
    public static Object m25234c(IOBiFunction iOBiFunction, Object obj, Object obj2) {
        try {
            return iOBiFunction.apply(obj, obj2);
        } catch (IOException e) {
            throw rethrow(e);
        }
    }

    /* renamed from: d */
    public static Object m25233d(IOFunction iOFunction, Object obj) {
        try {
            return iOFunction.apply(obj);
        } catch (IOException e) {
            throw rethrow(e);
        }
    }

    /* renamed from: e */
    public static int m25232e(IOComparator iOComparator, Object obj, Object obj2) {
        try {
            return iOComparator.compare(obj, obj2);
        } catch (IOException e) {
            throw rethrow(e);
        }
    }

    /* renamed from: f */
    public static Object m25231f(IOSupplier iOSupplier) {
        try {
            return iOSupplier.get();
        } catch (IOException e) {
            throw rethrow(e);
        }
    }

    /* renamed from: g */
    public static void m25230g(IORunnable iORunnable) {
        try {
            iORunnable.run();
        } catch (IOException e) {
            throw rethrow(e);
        }
    }

    /* renamed from: h */
    public static boolean m25229h(IOPredicate iOPredicate, Object obj) {
        try {
            return iOPredicate.test(obj);
        } catch (IOException e) {
            throw rethrow(e);
        }
    }

    public static <T extends Throwable> RuntimeException rethrow(Throwable th2) throws Throwable {
        throw th2;
    }
}
