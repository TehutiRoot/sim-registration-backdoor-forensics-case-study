package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.annotation.CheckForNull;

@GwtCompatible(emulated = true)
/* loaded from: classes4.dex */
public final class Throwables {

    /* renamed from: a */
    public static final Object f52813a;

    /* renamed from: b */
    public static final Method f52814b;

    /* renamed from: c */
    public static final Method f52815c;

    /* renamed from: com.google.common.base.Throwables$a */
    /* loaded from: classes4.dex */
    public class C7442a extends AbstractList {

        /* renamed from: a */
        public final /* synthetic */ Throwable f52816a;

        public C7442a(Throwable th2) {
            this.f52816a = th2;
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: a */
        public StackTraceElement get(int i) {
            Method method = Throwables.f52814b;
            java.util.Objects.requireNonNull(method);
            Object obj = Throwables.f52813a;
            java.util.Objects.requireNonNull(obj);
            return (StackTraceElement) Throwables.m41250i(method, obj, this.f52816a, Integer.valueOf(i));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            Method method = Throwables.f52815c;
            java.util.Objects.requireNonNull(method);
            Object obj = Throwables.f52813a;
            java.util.Objects.requireNonNull(obj);
            return ((Integer) Throwables.m41250i(method, obj, this.f52816a)).intValue();
        }
    }

    static {
        Method m41254e;
        Object m41253f = m41253f();
        f52813a = m41253f;
        Method method = null;
        if (m41253f == null) {
            m41254e = null;
        } else {
            m41254e = m41254e();
        }
        f52814b = m41254e;
        if (m41253f != null) {
            method = m41251h(m41253f);
        }
        f52815c = method;
    }

    /* renamed from: e */
    public static Method m41254e() {
        return m41252g("getStackTraceElement", Throwable.class, Integer.TYPE);
    }

    /* renamed from: f */
    public static Object m41253f() {
        try {
            return Class.forName("sun.misc.SharedSecrets", false, null).getMethod("getJavaLangAccess", null).invoke(null, null);
        } catch (ThreadDeath e) {
            throw e;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: g */
    public static Method m41252g(String str, Class... clsArr) {
        try {
            return Class.forName("sun.misc.JavaLangAccess", false, null).getMethod(str, clsArr);
        } catch (ThreadDeath e) {
            throw e;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static List<Throwable> getCausalChain(Throwable th2) {
        Preconditions.checkNotNull(th2);
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(th2);
        boolean z = false;
        Throwable th3 = th2;
        while (true) {
            th2 = th2.getCause();
            if (th2 != null) {
                arrayList.add(th2);
                if (th2 != th3) {
                    if (z) {
                        th3 = th3.getCause();
                    }
                    z = !z;
                } else {
                    throw new IllegalArgumentException("Loop in causal chain detected.", th2);
                }
            } else {
                return Collections.unmodifiableList(arrayList);
            }
        }
    }

    @CheckForNull
    @GwtIncompatible
    public static <X extends Throwable> X getCauseAs(Throwable th2, Class<X> cls) {
        try {
            return cls.cast(th2.getCause());
        } catch (ClassCastException e) {
            e.initCause(th2);
            throw e;
        }
    }

    public static Throwable getRootCause(Throwable th2) {
        boolean z = false;
        Throwable th3 = th2;
        while (true) {
            Throwable cause = th2.getCause();
            if (cause != null) {
                if (cause != th3) {
                    if (z) {
                        th3 = th3.getCause();
                    }
                    z = !z;
                    th2 = cause;
                } else {
                    throw new IllegalArgumentException("Loop in causal chain detected.", cause);
                }
            } else {
                return th2;
            }
        }
    }

    @GwtIncompatible
    public static String getStackTraceAsString(Throwable th2) {
        StringWriter stringWriter = new StringWriter();
        th2.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    /* renamed from: h */
    public static Method m41251h(Object obj) {
        try {
            Method m41252g = m41252g("getStackTraceDepth", Throwable.class);
            if (m41252g == null) {
                return null;
            }
            m41252g.invoke(obj, new Throwable());
            return m41252g;
        } catch (IllegalAccessException | UnsupportedOperationException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: i */
    public static Object m41250i(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e2) {
            throw propagate(e2.getCause());
        }
    }

    /* renamed from: j */
    public static List m41249j(Throwable th2) {
        Preconditions.checkNotNull(th2);
        return new C7442a(th2);
    }

    @J2ktIncompatible
    @GwtIncompatible
    @Deprecated
    public static List<StackTraceElement> lazyStackTrace(Throwable th2) {
        if (lazyStackTraceIsLazy()) {
            return m41249j(th2);
        }
        return Collections.unmodifiableList(Arrays.asList(th2.getStackTrace()));
    }

    @J2ktIncompatible
    @GwtIncompatible
    @Deprecated
    public static boolean lazyStackTraceIsLazy() {
        if (f52814b != null && f52815c != null) {
            return true;
        }
        return false;
    }

    @GwtIncompatible
    @Deprecated
    @CanIgnoreReturnValue
    @J2ktIncompatible
    public static RuntimeException propagate(Throwable th2) {
        throwIfUnchecked(th2);
        throw new RuntimeException(th2);
    }

    @GwtIncompatible
    @Deprecated
    @J2ktIncompatible
    public static <X extends Throwable> void propagateIfInstanceOf(@CheckForNull Throwable th2, Class<X> cls) throws Throwable {
        if (th2 != null) {
            throwIfInstanceOf(th2, cls);
        }
    }

    @J2ktIncompatible
    @GwtIncompatible
    @Deprecated
    public static void propagateIfPossible(@CheckForNull Throwable th2) {
        if (th2 != null) {
            throwIfUnchecked(th2);
        }
    }

    @GwtIncompatible
    public static <X extends Throwable> void throwIfInstanceOf(Throwable th2, Class<X> cls) throws Throwable {
        Preconditions.checkNotNull(th2);
        if (!cls.isInstance(th2)) {
            return;
        }
        throw cls.cast(th2);
    }

    public static void throwIfUnchecked(Throwable th2) {
        Preconditions.checkNotNull(th2);
        if (!(th2 instanceof RuntimeException)) {
            if (!(th2 instanceof Error)) {
                return;
            }
            throw ((Error) th2);
        }
        throw ((RuntimeException) th2);
    }

    @GwtIncompatible
    @Deprecated
    @J2ktIncompatible
    public static <X extends Throwable> void propagateIfPossible(@CheckForNull Throwable th2, Class<X> cls) throws Throwable {
        propagateIfInstanceOf(th2, cls);
        propagateIfPossible(th2);
    }

    @GwtIncompatible
    @Deprecated
    @J2ktIncompatible
    public static <X1 extends Throwable, X2 extends Throwable> void propagateIfPossible(@CheckForNull Throwable th2, Class<X1> cls, Class<X2> cls2) throws Throwable, Throwable {
        Preconditions.checkNotNull(cls2);
        propagateIfInstanceOf(th2, cls);
        propagateIfPossible(th2, cls2);
    }
}