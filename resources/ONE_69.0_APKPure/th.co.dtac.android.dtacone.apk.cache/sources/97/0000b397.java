package com.google.gson.internal;

import com.google.gson.ReflectionAccessFilter;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;
import java.util.List;

/* loaded from: classes4.dex */
public class ReflectionAccessFilterHelper {

    /* renamed from: com.google.gson.internal.ReflectionAccessFilterHelper$b */
    /* loaded from: classes4.dex */
    public static abstract class AbstractC8712b {

        /* renamed from: a */
        public static final AbstractC8712b f56756a;

        /* renamed from: com.google.gson.internal.ReflectionAccessFilterHelper$b$a */
        /* loaded from: classes4.dex */
        public class C8713a extends AbstractC8712b {

            /* renamed from: b */
            public final /* synthetic */ Method f56757b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C8713a(Method method) {
                super();
                this.f56757b = method;
            }

            @Override // com.google.gson.internal.ReflectionAccessFilterHelper.AbstractC8712b
            /* renamed from: a */
            public boolean mo37529a(AccessibleObject accessibleObject, Object obj) {
                try {
                    return ((Boolean) this.f56757b.invoke(accessibleObject, obj)).booleanValue();
                } catch (Exception e) {
                    throw new RuntimeException("Failed invoking canAccess", e);
                }
            }
        }

        /* renamed from: com.google.gson.internal.ReflectionAccessFilterHelper$b$b */
        /* loaded from: classes4.dex */
        public class C8714b extends AbstractC8712b {
            public C8714b() {
                super();
            }

            @Override // com.google.gson.internal.ReflectionAccessFilterHelper.AbstractC8712b
            /* renamed from: a */
            public boolean mo37529a(AccessibleObject accessibleObject, Object obj) {
                return true;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
        static {
            /*
                boolean r0 = com.google.gson.internal.JavaVersion.isJava9OrLater()
                if (r0 == 0) goto L1c
                java.lang.Class<java.lang.reflect.AccessibleObject> r0 = java.lang.reflect.AccessibleObject.class
                java.lang.String r1 = "canAccess"
                r2 = 1
                java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchMethodException -> L1c
                java.lang.Class<java.lang.Object> r3 = java.lang.Object.class
                r4 = 0
                r2[r4] = r3     // Catch: java.lang.NoSuchMethodException -> L1c
                java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r2)     // Catch: java.lang.NoSuchMethodException -> L1c
                com.google.gson.internal.ReflectionAccessFilterHelper$b$a r1 = new com.google.gson.internal.ReflectionAccessFilterHelper$b$a     // Catch: java.lang.NoSuchMethodException -> L1c
                r1.<init>(r0)     // Catch: java.lang.NoSuchMethodException -> L1c
                goto L1d
            L1c:
                r1 = 0
            L1d:
                if (r1 != 0) goto L24
                com.google.gson.internal.ReflectionAccessFilterHelper$b$b r1 = new com.google.gson.internal.ReflectionAccessFilterHelper$b$b
                r1.<init>()
            L24:
                com.google.gson.internal.ReflectionAccessFilterHelper.AbstractC8712b.f56756a = r1
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.ReflectionAccessFilterHelper.AbstractC8712b.<clinit>():void");
        }

        public AbstractC8712b() {
        }

        /* renamed from: a */
        public abstract boolean mo37529a(AccessibleObject accessibleObject, Object obj);
    }

    /* renamed from: a */
    public static boolean m37531a(String str) {
        if (!str.startsWith("android.") && !str.startsWith("androidx.") && !m37530b(str)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m37530b(String str) {
        if (!str.startsWith("java.") && !str.startsWith("javax.")) {
            return false;
        }
        return true;
    }

    public static boolean canAccess(AccessibleObject accessibleObject, Object obj) {
        return AbstractC8712b.f56756a.mo37529a(accessibleObject, obj);
    }

    public static ReflectionAccessFilter.FilterResult getFilterResult(List<ReflectionAccessFilter> list, Class<?> cls) {
        for (ReflectionAccessFilter reflectionAccessFilter : list) {
            ReflectionAccessFilter.FilterResult check = reflectionAccessFilter.check(cls);
            if (check != ReflectionAccessFilter.FilterResult.INDECISIVE) {
                return check;
            }
        }
        return ReflectionAccessFilter.FilterResult.ALLOW;
    }

    public static boolean isAndroidType(Class<?> cls) {
        return m37531a(cls.getName());
    }

    public static boolean isAnyPlatformType(Class<?> cls) {
        String name = cls.getName();
        if (!m37531a(name) && !name.startsWith("kotlin.") && !name.startsWith("kotlinx.") && !name.startsWith("scala.")) {
            return false;
        }
        return true;
    }

    public static boolean isJavaType(Class<?> cls) {
        return m37530b(cls.getName());
    }
}