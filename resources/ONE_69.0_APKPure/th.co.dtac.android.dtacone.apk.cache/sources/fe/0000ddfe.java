package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes6.dex */
public final class Java16RecordComponentsLoader {

    /* renamed from: a */
    public static final Java16RecordComponentsLoader f68916a = new Java16RecordComponentsLoader();

    /* renamed from: b */
    public static Cache f68917b;

    /* loaded from: classes6.dex */
    public static final class Cache {

        /* renamed from: a */
        public final Method f68918a;

        /* renamed from: b */
        public final Method f68919b;

        public Cache(@Nullable Method method, @Nullable Method method2) {
            this.f68918a = method;
            this.f68919b = method2;
        }

        @Nullable
        public final Method getGetAccessor() {
            return this.f68919b;
        }

        @Nullable
        public final Method getGetType() {
            return this.f68918a;
        }
    }

    /* renamed from: a */
    public final Cache m28745a(Object obj) {
        Class<?> cls = obj.getClass();
        try {
            return new Cache(cls.getMethod("getType", null), cls.getMethod("getAccessor", null));
        } catch (NoSuchMethodException unused) {
            return new Cache(null, null);
        }
    }

    /* renamed from: b */
    public final Cache m28744b(Object obj) {
        Cache cache = f68917b;
        if (cache == null) {
            Cache m28745a = m28745a(obj);
            f68917b = m28745a;
            return m28745a;
        }
        return cache;
    }

    /* renamed from: c */
    public final Method m28743c(Object recordComponent) {
        Intrinsics.checkNotNullParameter(recordComponent, "recordComponent");
        Method getAccessor = m28744b(recordComponent).getGetAccessor();
        if (getAccessor == null) {
            return null;
        }
        Object invoke = getAccessor.invoke(recordComponent, null);
        Intrinsics.checkNotNull(invoke, "null cannot be cast to non-null type java.lang.reflect.Method");
        return (Method) invoke;
    }

    /* renamed from: d */
    public final Class m28742d(Object recordComponent) {
        Intrinsics.checkNotNullParameter(recordComponent, "recordComponent");
        Method getType = m28744b(recordComponent).getGetType();
        if (getType == null) {
            return null;
        }
        Object invoke = getType.invoke(recordComponent, null);
        Intrinsics.checkNotNull(invoke, "null cannot be cast to non-null type java.lang.Class<*>");
        return (Class) invoke;
    }
}