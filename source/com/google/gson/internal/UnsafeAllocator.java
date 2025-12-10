package com.google.gson.internal;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes4.dex */
public abstract class UnsafeAllocator {
    public static final UnsafeAllocator INSTANCE = m37533c();

    /* renamed from: com.google.gson.internal.UnsafeAllocator$a */
    /* loaded from: classes4.dex */
    public class C8729a extends UnsafeAllocator {

        /* renamed from: a */
        public final /* synthetic */ Method f56750a;

        /* renamed from: b */
        public final /* synthetic */ Object f56751b;

        public C8729a(Method method, Object obj) {
            this.f56750a = method;
            this.f56751b = obj;
        }

        @Override // com.google.gson.internal.UnsafeAllocator
        public Object newInstance(Class cls) {
            UnsafeAllocator.m37534b(cls);
            return this.f56750a.invoke(this.f56751b, cls);
        }
    }

    /* renamed from: com.google.gson.internal.UnsafeAllocator$b */
    /* loaded from: classes4.dex */
    public class C8730b extends UnsafeAllocator {

        /* renamed from: a */
        public final /* synthetic */ Method f56752a;

        /* renamed from: b */
        public final /* synthetic */ int f56753b;

        public C8730b(Method method, int i) {
            this.f56752a = method;
            this.f56753b = i;
        }

        @Override // com.google.gson.internal.UnsafeAllocator
        public Object newInstance(Class cls) {
            UnsafeAllocator.m37534b(cls);
            return this.f56752a.invoke(null, cls, Integer.valueOf(this.f56753b));
        }
    }

    /* renamed from: com.google.gson.internal.UnsafeAllocator$c */
    /* loaded from: classes4.dex */
    public class C8731c extends UnsafeAllocator {

        /* renamed from: a */
        public final /* synthetic */ Method f56754a;

        public C8731c(Method method) {
            this.f56754a = method;
        }

        @Override // com.google.gson.internal.UnsafeAllocator
        public Object newInstance(Class cls) {
            UnsafeAllocator.m37534b(cls);
            return this.f56754a.invoke(null, cls, Object.class);
        }
    }

    /* renamed from: com.google.gson.internal.UnsafeAllocator$d */
    /* loaded from: classes4.dex */
    public class C8732d extends UnsafeAllocator {
        @Override // com.google.gson.internal.UnsafeAllocator
        public Object newInstance(Class cls) {
            throw new UnsupportedOperationException("Cannot allocate " + cls + ". Usage of JDK sun.misc.Unsafe is enabled, but it could not be used. Make sure your runtime is configured correctly.");
        }
    }

    /* renamed from: b */
    public static void m37534b(Class cls) {
        String m37561a = ConstructorConstructor.m37561a(cls);
        if (m37561a == null) {
            return;
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: " + m37561a);
    }

    /* renamed from: c */
    public static UnsafeAllocator m37533c() {
        try {
            try {
                try {
                    Class<?> cls = Class.forName("sun.misc.Unsafe");
                    Field declaredField = cls.getDeclaredField("theUnsafe");
                    declaredField.setAccessible(true);
                    return new C8729a(cls.getMethod("allocateInstance", Class.class), declaredField.get(null));
                } catch (Exception unused) {
                    return new C8732d();
                }
            } catch (Exception unused2) {
                Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                declaredMethod.setAccessible(true);
                int intValue = ((Integer) declaredMethod.invoke(null, Object.class)).intValue();
                Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
                declaredMethod2.setAccessible(true);
                return new C8730b(declaredMethod2, intValue);
            }
        } catch (Exception unused3) {
            Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
            declaredMethod3.setAccessible(true);
            return new C8731c(declaredMethod3);
        }
    }

    public abstract <T> T newInstance(Class<T> cls) throws Exception;
}
