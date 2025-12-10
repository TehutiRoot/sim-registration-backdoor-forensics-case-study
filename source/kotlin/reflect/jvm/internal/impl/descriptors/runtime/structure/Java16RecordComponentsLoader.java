package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes6.dex */
public final class Java16RecordComponentsLoader {

    /* renamed from: a */
    public static final Java16RecordComponentsLoader f68882a = new Java16RecordComponentsLoader();

    /* renamed from: b */
    public static Cache f68883b;

    /* loaded from: classes6.dex */
    public static final class Cache {

        /* renamed from: a */
        public final Method f68884a;

        /* renamed from: b */
        public final Method f68885b;

        public Cache(@Nullable Method method, @Nullable Method method2) {
            this.f68884a = method;
            this.f68885b = method2;
        }

        @Nullable
        public final Method getGetAccessor() {
            return this.f68885b;
        }

        @Nullable
        public final Method getGetType() {
            return this.f68884a;
        }
    }

    /* renamed from: a */
    public final Cache m28453a(Object obj) {
        Class<?> cls = obj.getClass();
        try {
            return new Cache(cls.getMethod("getType", null), cls.getMethod("getAccessor", null));
        } catch (NoSuchMethodException unused) {
            return new Cache(null, null);
        }
    }

    /* renamed from: b */
    public final Cache m28452b(Object obj) {
        Cache cache = f68883b;
        if (cache == null) {
            Cache m28453a = m28453a(obj);
            f68883b = m28453a;
            return m28453a;
        }
        return cache;
    }

    /* renamed from: c */
    public final Method m28451c(Object recordComponent) {
        Intrinsics.checkNotNullParameter(recordComponent, "recordComponent");
        Method getAccessor = m28452b(recordComponent).getGetAccessor();
        if (getAccessor == null) {
            return null;
        }
        Object invoke = getAccessor.invoke(recordComponent, null);
        Intrinsics.checkNotNull(invoke, "null cannot be cast to non-null type java.lang.reflect.Method");
        return (Method) invoke;
    }

    /* renamed from: d */
    public final Class m28450d(Object recordComponent) {
        Intrinsics.checkNotNullParameter(recordComponent, "recordComponent");
        Method getType = m28452b(recordComponent).getGetType();
        if (getType == null) {
            return null;
        }
        Object invoke = getType.invoke(recordComponent, null);
        Intrinsics.checkNotNull(invoke, "null cannot be cast to non-null type java.lang.Class<*>");
        return (Class) invoke;
    }
}
