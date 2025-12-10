package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes6.dex */
public final class Java8ParameterNamesLoader {

    /* renamed from: a */
    public static final Java8ParameterNamesLoader f68926a = new Java8ParameterNamesLoader();

    /* renamed from: b */
    public static Cache f68927b;

    /* loaded from: classes6.dex */
    public static final class Cache {

        /* renamed from: a */
        public final Method f68928a;

        /* renamed from: b */
        public final Method f68929b;

        public Cache(@Nullable Method method, @Nullable Method method2) {
            this.f68928a = method;
            this.f68929b = method2;
        }

        @Nullable
        public final Method getGetName() {
            return this.f68929b;
        }

        @Nullable
        public final Method getGetParameters() {
            return this.f68928a;
        }
    }

    /* renamed from: a */
    public final Cache m28735a(Member member) {
        Intrinsics.checkNotNullParameter(member, "member");
        Class<?> cls = member.getClass();
        try {
            return new Cache(cls.getMethod("getParameters", null), ReflectClassUtilKt.getSafeClassLoader(cls).loadClass("java.lang.reflect.Parameter").getMethod("getName", null));
        } catch (NoSuchMethodException unused) {
            return new Cache(null, null);
        }
    }

    /* renamed from: b */
    public final List m28734b(Member member) {
        Method getName;
        Intrinsics.checkNotNullParameter(member, "member");
        Cache cache = f68927b;
        if (cache == null) {
            synchronized (this) {
                cache = f68927b;
                if (cache == null) {
                    cache = f68926a.m28735a(member);
                    f68927b = cache;
                }
            }
        }
        Method getParameters = cache.getGetParameters();
        if (getParameters == null || (getName = cache.getGetName()) == null) {
            return null;
        }
        Object invoke = getParameters.invoke(member, null);
        Intrinsics.checkNotNull(invoke, "null cannot be cast to non-null type kotlin.Array<*>");
        Object[] objArr = (Object[]) invoke;
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            Object invoke2 = getName.invoke(obj, null);
            Intrinsics.checkNotNull(invoke2, "null cannot be cast to non-null type kotlin.String");
            arrayList.add((String) invoke2);
        }
        return arrayList;
    }
}