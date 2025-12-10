package p000;

import java.lang.reflect.Method;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: mt0  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C21146mt0 {

    /* renamed from: a */
    public static final C21146mt0 f72072a = new C21146mt0();

    /* renamed from: b */
    public static final C12321a f72073b = new C12321a(null, null, null);

    /* renamed from: c */
    public static C12321a f72074c;

    /* renamed from: mt0$a */
    /* loaded from: classes5.dex */
    public static final class C12321a {

        /* renamed from: a */
        public final Method f72075a;

        /* renamed from: b */
        public final Method f72076b;

        /* renamed from: c */
        public final Method f72077c;

        public C12321a(Method method, Method method2, Method method3) {
            this.f72075a = method;
            this.f72076b = method2;
            this.f72077c = method3;
        }
    }

    /* renamed from: a */
    public final C12321a m26183a(BaseContinuationImpl baseContinuationImpl) {
        try {
            C12321a c12321a = new C12321a(Class.class.getDeclaredMethod("getModule", null), baseContinuationImpl.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), baseContinuationImpl.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
            f72074c = c12321a;
            return c12321a;
        } catch (Exception unused) {
            C12321a c12321a2 = f72073b;
            f72074c = c12321a2;
            return c12321a2;
        }
    }

    /* renamed from: b */
    public final String m26182b(BaseContinuationImpl continuation) {
        Object obj;
        Object obj2;
        Object obj3;
        Intrinsics.checkNotNullParameter(continuation, "continuation");
        C12321a c12321a = f72074c;
        if (c12321a == null) {
            c12321a = m26183a(continuation);
        }
        if (c12321a == f72073b) {
            return null;
        }
        Method method = c12321a.f72075a;
        if (method != null) {
            obj = method.invoke(continuation.getClass(), null);
        } else {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        Method method2 = c12321a.f72076b;
        if (method2 != null) {
            obj2 = method2.invoke(obj, null);
        } else {
            obj2 = null;
        }
        if (obj2 == null) {
            return null;
        }
        Method method3 = c12321a.f72077c;
        if (method3 != null) {
            obj3 = method3.invoke(obj2, null);
        } else {
            obj3 = null;
        }
        if (!(obj3 instanceof String)) {
            return null;
        }
        return (String) obj3;
    }
}
