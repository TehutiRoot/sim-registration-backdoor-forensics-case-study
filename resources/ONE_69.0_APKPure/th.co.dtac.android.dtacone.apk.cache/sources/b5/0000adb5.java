package com.google.common.util.concurrent;

import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.collect.Ordering;
import com.google.common.util.concurrent.FuturesGetChecked;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes4.dex */
public abstract class FuturesGetChecked {

    /* renamed from: a */
    public static final Ordering f54363a;

    /* renamed from: b */
    public static final Ordering f54364b;

    /* loaded from: classes4.dex */
    public static class GetCheckedTypeValidatorHolder {

        /* renamed from: a */
        public static final InterfaceC8242a f54365a = m39485a();

        /* loaded from: classes4.dex */
        public enum WeakSetValidator implements InterfaceC8242a {
            INSTANCE;
            
            private static final Set<WeakReference<Class<? extends Exception>>> validClasses = new CopyOnWriteArraySet();

            @Override // com.google.common.util.concurrent.FuturesGetChecked.InterfaceC8242a
            public void validateClass(Class<? extends Exception> cls) {
                for (WeakReference<Class<? extends Exception>> weakReference : validClasses) {
                    if (cls.equals(weakReference.get())) {
                        return;
                    }
                }
                FuturesGetChecked.m39499e(cls);
                Set<WeakReference<Class<? extends Exception>>> set = validClasses;
                if (set.size() > 1000) {
                    set.clear();
                }
                set.add(new WeakReference<>(cls));
            }
        }

        /* renamed from: a */
        public static InterfaceC8242a m39485a() {
            return FuturesGetChecked.m39487q();
        }
    }

    /* renamed from: com.google.common.util.concurrent.FuturesGetChecked$a */
    /* loaded from: classes4.dex */
    public interface InterfaceC8242a {
        void validateClass(Class cls);
    }

    static {
        Ordering reverse = Ordering.natural().onResultOf(new Function() { // from class: y50
            @Override // com.google.common.base.Function
            public final Object apply(Object obj) {
                return FuturesGetChecked.m39503a((List) obj);
            }
        }).compound(Ordering.natural().onResultOf(new Function() { // from class: z50
            @Override // com.google.common.base.Function
            public final Object apply(Object obj) {
                return FuturesGetChecked.m39502b((List) obj);
            }
        })).reverse();
        f54363a = reverse;
        f54364b = reverse.onResultOf(new Function() { // from class: A50
            @Override // com.google.common.base.Function
            public final Object apply(Object obj) {
                return FuturesGetChecked.m39501c((Constructor) obj);
            }
        });
    }

    /* renamed from: a */
    public static /* synthetic */ Comparable m39503a(List list) {
        return m39493k(list);
    }

    /* renamed from: b */
    public static /* synthetic */ Comparable m39502b(List list) {
        return m39492l(list);
    }

    /* renamed from: c */
    public static /* synthetic */ List m39501c(Constructor constructor) {
        return m39491m(constructor);
    }

    /* renamed from: d */
    public static InterfaceC8242a m39500d() {
        return GetCheckedTypeValidatorHolder.f54365a;
    }

    /* renamed from: e */
    public static void m39499e(Class cls) {
        Preconditions.checkArgument(m39494j(cls), "Futures.getChecked exception type (%s) must not be a RuntimeException", cls);
        Preconditions.checkArgument(m39495i(cls), "Futures.getChecked exception type (%s) must be an accessible class with an accessible constructor whose parameters (if any) must be of type String and/or Throwable", cls);
    }

    /* renamed from: f */
    public static Object m39498f(InterfaceC8242a interfaceC8242a, Future future, Class cls) {
        interfaceC8242a.validateClass(cls);
        try {
            return future.get();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw m39489o(cls, e);
        } catch (ExecutionException e2) {
            m39486r(e2.getCause(), cls);
            throw new AssertionError();
        }
    }

    /* renamed from: g */
    public static Object m39497g(Future future, Class cls) {
        return m39498f(m39500d(), future, cls);
    }

    /* renamed from: h */
    public static Object m39496h(Future future, Class cls, long j, TimeUnit timeUnit) {
        m39500d().validateClass(cls);
        try {
            return future.get(j, timeUnit);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw m39489o(cls, e);
        } catch (ExecutionException e2) {
            m39486r(e2.getCause(), cls);
            throw new AssertionError();
        } catch (TimeoutException e3) {
            throw m39489o(cls, e3);
        }
    }

    /* renamed from: i */
    public static boolean m39495i(Class cls) {
        try {
            m39489o(cls, new Exception());
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: j */
    public static boolean m39494j(Class cls) {
        return !RuntimeException.class.isAssignableFrom(cls);
    }

    /* renamed from: k */
    public static /* synthetic */ Comparable m39493k(List list) {
        return Boolean.valueOf(list.contains(String.class));
    }

    /* renamed from: l */
    public static /* synthetic */ Comparable m39492l(List list) {
        return Boolean.valueOf(list.contains(Throwable.class));
    }

    /* renamed from: m */
    public static /* synthetic */ List m39491m(Constructor constructor) {
        return Arrays.asList(constructor.getParameterTypes());
    }

    /* renamed from: n */
    public static Object m39490n(Constructor constructor, Throwable th2) {
        Class<?>[] parameterTypes = constructor.getParameterTypes();
        Object[] objArr = new Object[parameterTypes.length];
        for (int i = 0; i < parameterTypes.length; i++) {
            Class<?> cls = parameterTypes[i];
            if (cls.equals(String.class)) {
                objArr[i] = th2.toString();
            } else if (!cls.equals(Throwable.class)) {
                return null;
            } else {
                objArr[i] = th2;
            }
        }
        try {
            return constructor.newInstance(objArr);
        } catch (IllegalAccessException | IllegalArgumentException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: o */
    public static Exception m39489o(Class cls, Throwable th2) {
        for (Constructor constructor : m39488p(Arrays.asList(cls.getConstructors()))) {
            Exception exc = (Exception) m39490n(constructor, th2);
            if (exc != null) {
                if (exc.getCause() == null) {
                    exc.initCause(th2);
                }
                return exc;
            }
        }
        throw new IllegalArgumentException("No appropriate constructor for exception of type " + cls + " in response to chained exception", th2);
    }

    /* renamed from: p */
    public static List m39488p(List list) {
        return f54364b.sortedCopy(list);
    }

    /* renamed from: q */
    public static InterfaceC8242a m39487q() {
        return GetCheckedTypeValidatorHolder.WeakSetValidator.INSTANCE;
    }

    /* renamed from: r */
    public static void m39486r(Throwable th2, Class cls) {
        if (!(th2 instanceof Error)) {
            if (th2 instanceof RuntimeException) {
                throw new UncheckedExecutionException(th2);
            }
            throw m39489o(cls, th2);
        }
        throw new ExecutionError((Error) th2);
    }
}