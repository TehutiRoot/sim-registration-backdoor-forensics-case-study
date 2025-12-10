package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes6.dex */
public final class Java16SealedRecordLoader {

    /* renamed from: a */
    public static final Java16SealedRecordLoader f68886a = new Java16SealedRecordLoader();

    /* renamed from: b */
    public static Cache f68887b;

    /* loaded from: classes6.dex */
    public static final class Cache {

        /* renamed from: a */
        public final Method f68888a;

        /* renamed from: b */
        public final Method f68889b;

        /* renamed from: c */
        public final Method f68890c;

        /* renamed from: d */
        public final Method f68891d;

        public Cache(@Nullable Method method, @Nullable Method method2, @Nullable Method method3, @Nullable Method method4) {
            this.f68888a = method;
            this.f68889b = method2;
            this.f68890c = method3;
            this.f68891d = method4;
        }

        @Nullable
        public final Method getGetPermittedSubclasses() {
            return this.f68889b;
        }

        @Nullable
        public final Method getGetRecordComponents() {
            return this.f68891d;
        }

        @Nullable
        public final Method isRecord() {
            return this.f68890c;
        }

        @Nullable
        public final Method isSealed() {
            return this.f68888a;
        }
    }

    /* renamed from: a */
    public final Cache m28449a() {
        try {
            return new Cache(Class.class.getMethod("isSealed", null), Class.class.getMethod("getPermittedSubclasses", null), Class.class.getMethod("isRecord", null), Class.class.getMethod("getRecordComponents", null));
        } catch (NoSuchMethodException unused) {
            return new Cache(null, null, null, null);
        }
    }

    /* renamed from: b */
    public final Cache m28448b() {
        Cache cache = f68887b;
        if (cache == null) {
            Cache m28449a = m28449a();
            f68887b = m28449a;
            return m28449a;
        }
        return cache;
    }

    /* renamed from: c */
    public final Class[] m28447c(Class clazz) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Method getPermittedSubclasses = m28448b().getGetPermittedSubclasses();
        if (getPermittedSubclasses == null) {
            return null;
        }
        Object invoke = getPermittedSubclasses.invoke(clazz, null);
        Intrinsics.checkNotNull(invoke, "null cannot be cast to non-null type kotlin.Array<java.lang.Class<*>>");
        return (Class[]) invoke;
    }

    /* renamed from: d */
    public final Object[] m28446d(Class clazz) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Method getRecordComponents = m28448b().getGetRecordComponents();
        if (getRecordComponents == null) {
            return null;
        }
        return (Object[]) getRecordComponents.invoke(clazz, null);
    }

    /* renamed from: e */
    public final Boolean m28445e(Class clazz) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Method isRecord = m28448b().isRecord();
        if (isRecord == null) {
            return null;
        }
        Object invoke = isRecord.invoke(clazz, null);
        Intrinsics.checkNotNull(invoke, "null cannot be cast to non-null type kotlin.Boolean");
        return (Boolean) invoke;
    }

    /* renamed from: f */
    public final Boolean m28444f(Class clazz) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Method isSealed = m28448b().isSealed();
        if (isSealed == null) {
            return null;
        }
        Object invoke = isSealed.invoke(clazz, null);
        Intrinsics.checkNotNull(invoke, "null cannot be cast to non-null type kotlin.Boolean");
        return (Boolean) invoke;
    }
}
