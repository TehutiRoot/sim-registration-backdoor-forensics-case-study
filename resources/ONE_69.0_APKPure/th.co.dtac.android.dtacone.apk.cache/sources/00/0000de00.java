package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes6.dex */
public final class Java16SealedRecordLoader {

    /* renamed from: a */
    public static final Java16SealedRecordLoader f68920a = new Java16SealedRecordLoader();

    /* renamed from: b */
    public static Cache f68921b;

    /* loaded from: classes6.dex */
    public static final class Cache {

        /* renamed from: a */
        public final Method f68922a;

        /* renamed from: b */
        public final Method f68923b;

        /* renamed from: c */
        public final Method f68924c;

        /* renamed from: d */
        public final Method f68925d;

        public Cache(@Nullable Method method, @Nullable Method method2, @Nullable Method method3, @Nullable Method method4) {
            this.f68922a = method;
            this.f68923b = method2;
            this.f68924c = method3;
            this.f68925d = method4;
        }

        @Nullable
        public final Method getGetPermittedSubclasses() {
            return this.f68923b;
        }

        @Nullable
        public final Method getGetRecordComponents() {
            return this.f68925d;
        }

        @Nullable
        public final Method isRecord() {
            return this.f68924c;
        }

        @Nullable
        public final Method isSealed() {
            return this.f68922a;
        }
    }

    /* renamed from: a */
    public final Cache m28741a() {
        try {
            return new Cache(Class.class.getMethod("isSealed", null), Class.class.getMethod("getPermittedSubclasses", null), Class.class.getMethod("isRecord", null), Class.class.getMethod("getRecordComponents", null));
        } catch (NoSuchMethodException unused) {
            return new Cache(null, null, null, null);
        }
    }

    /* renamed from: b */
    public final Cache m28740b() {
        Cache cache = f68921b;
        if (cache == null) {
            Cache m28741a = m28741a();
            f68921b = m28741a;
            return m28741a;
        }
        return cache;
    }

    /* renamed from: c */
    public final Class[] m28739c(Class clazz) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Method getPermittedSubclasses = m28740b().getGetPermittedSubclasses();
        if (getPermittedSubclasses == null) {
            return null;
        }
        Object invoke = getPermittedSubclasses.invoke(clazz, null);
        Intrinsics.checkNotNull(invoke, "null cannot be cast to non-null type kotlin.Array<java.lang.Class<*>>");
        return (Class[]) invoke;
    }

    /* renamed from: d */
    public final Object[] m28738d(Class clazz) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Method getRecordComponents = m28740b().getGetRecordComponents();
        if (getRecordComponents == null) {
            return null;
        }
        return (Object[]) getRecordComponents.invoke(clazz, null);
    }

    /* renamed from: e */
    public final Boolean m28737e(Class clazz) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Method isRecord = m28740b().isRecord();
        if (isRecord == null) {
            return null;
        }
        Object invoke = isRecord.invoke(clazz, null);
        Intrinsics.checkNotNull(invoke, "null cannot be cast to non-null type kotlin.Boolean");
        return (Boolean) invoke;
    }

    /* renamed from: f */
    public final Boolean m28736f(Class clazz) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Method isSealed = m28740b().isSealed();
        if (isSealed == null) {
            return null;
        }
        Object invoke = isSealed.invoke(clazz, null);
        Intrinsics.checkNotNull(invoke, "null cannot be cast to non-null type kotlin.Boolean");
        return (Boolean) invoke;
    }
}