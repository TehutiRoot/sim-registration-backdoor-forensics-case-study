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
    public static final Object f52801a;

    /* renamed from: b */
    public static final Method f52802b;

    /* renamed from: c */
    public static final Method f52803c;

    /* renamed from: com.google.common.base.Throwables$a */
    /* loaded from: classes4.dex */
    public class C7453a extends AbstractList {

        /* renamed from: a */
        public final /* synthetic */ Throwable f52804a;

        public C7453a(Throwable th2) {
            this.f52804a = th2;
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: a */
        public StackTraceElement get(int i) {
            Method method = Throwables.f52802b;
            java.util.Objects.requireNonNull(method);
            Object obj = Throwables.f52801a;
            java.util.Objects.requireNonNull(obj);
            return (StackTraceElement) Throwables.m41263i(method, obj, this.f52804a, Integer.valueOf(i));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            Method method = Throwables.f52803c;
            java.util.Objects.requireNonNull(method);
            Object obj = Throwables.f52801a;
            java.util.Objects.requireNonNull(obj);
            return ((Integer) Throwables.m41263i(method, obj, this.f52804a)).intValue();
        }
    }

    static {
        Method m41267e;
        Object m41266f = m41266f();
        f52801a = m41266f;
        Method method = null;
        if (m41266f == null) {
            m41267e = null;
        } else {
            m41267e = m41267e();
        }
        f52802b = m41267e;
        if (m41266f != null) {
            method = m41264h(m41266f);
        }
        f52803c = method;
    }

    /* renamed from: e */
    public static Method m41267e() {
        return m41265g("getStackTraceElement", Throwable.class, Integer.TYPE);
    }

    /* renamed from: f */
    public static Object m41266f() {
        try {
            return Class.forName("sun.misc.SharedSecrets", false, null).getMethod("getJavaLangAccess", null).invoke(null, null);
        } catch (ThreadDeath e) {
            throw e;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: g */
    public static Method m41265g(String str, Class... clsArr) {
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
    public static Method m41264h(Object obj) {
        try {
            Method m41265g = m41265g("getStackTraceDepth", Throwable.class);
            if (m41265g == null) {
                return null;
            }
            m41265g.invoke(obj, new Throwable());
            return m41265g;
        } catch (IllegalAccessException | UnsupportedOperationException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: i */
    public static Object m41263i(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e2) {
            throw propagate(e2.getCause());
        }
    }

    /* renamed from: j */
    public static List m41262j(Throwable th2) {
        Preconditions.checkNotNull(th2);
        return new C7453a(th2);
    }

    @J2ktIncompatible
    @GwtIncompatible
    @Deprecated
    public static List<StackTraceElement> lazyStackTrace(Throwable th2) {
        if (lazyStackTraceIsLazy()) {
            return m41262j(th2);
        }
        return Collections.unmodifiableList(Arrays.asList(th2.getStackTrace()));
    }

    @J2ktIncompatible
    @GwtIncompatible
    @Deprecated
    public static boolean lazyStackTraceIsLazy() {
        if (f52802b != null && f52803c != null) {
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
