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
    public static final Ordering f54351a;

    /* renamed from: b */
    public static final Ordering f54352b;

    /* loaded from: classes4.dex */
    public static class GetCheckedTypeValidatorHolder {

        /* renamed from: a */
        public static final InterfaceC8253a f54353a = m39493a();

        /* loaded from: classes4.dex */
        public enum WeakSetValidator implements InterfaceC8253a {
            INSTANCE;
            
            private static final Set<WeakReference<Class<? extends Exception>>> validClasses = new CopyOnWriteArraySet();

            @Override // com.google.common.util.concurrent.FuturesGetChecked.InterfaceC8253a
            public void validateClass(Class<? extends Exception> cls) {
                for (WeakReference<Class<? extends Exception>> weakReference : validClasses) {
                    if (cls.equals(weakReference.get())) {
                        return;
                    }
                }
                FuturesGetChecked.m39507e(cls);
                Set<WeakReference<Class<? extends Exception>>> set = validClasses;
                if (set.size() > 1000) {
                    set.clear();
                }
                set.add(new WeakReference<>(cls));
            }
        }

        /* renamed from: a */
        public static InterfaceC8253a m39493a() {
            return FuturesGetChecked.m39495q();
        }
    }

    /* renamed from: com.google.common.util.concurrent.FuturesGetChecked$a */
    /* loaded from: classes4.dex */
    public interface InterfaceC8253a {
        void validateClass(Class cls);
    }

    static {
        Ordering reverse = Ordering.natural().onResultOf(new Function() { // from class: u50
            @Override // com.google.common.base.Function
            public final Object apply(Object obj) {
                return FuturesGetChecked.m39511a((List) obj);
            }
        }).compound(Ordering.natural().onResultOf(new Function() { // from class: v50
            @Override // com.google.common.base.Function
            public final Object apply(Object obj) {
                return FuturesGetChecked.m39510b((List) obj);
            }
        })).reverse();
        f54351a = reverse;
        f54352b = reverse.onResultOf(new Function() { // from class: w50
            @Override // com.google.common.base.Function
            public final Object apply(Object obj) {
                return FuturesGetChecked.m39509c((Constructor) obj);
            }
        });
    }

    /* renamed from: a */
    public static /* synthetic */ Comparable m39511a(List list) {
        return m39501k(list);
    }

    /* renamed from: b */
    public static /* synthetic */ Comparable m39510b(List list) {
        return m39500l(list);
    }

    /* renamed from: c */
    public static /* synthetic */ List m39509c(Constructor constructor) {
        return m39499m(constructor);
    }

    /* renamed from: d */
    public static InterfaceC8253a m39508d() {
        return GetCheckedTypeValidatorHolder.f54353a;
    }

    /* renamed from: e */
    public static void m39507e(Class cls) {
        Preconditions.checkArgument(m39502j(cls), "Futures.getChecked exception type (%s) must not be a RuntimeException", cls);
        Preconditions.checkArgument(m39503i(cls), "Futures.getChecked exception type (%s) must be an accessible class with an accessible constructor whose parameters (if any) must be of type String and/or Throwable", cls);
    }

    /* renamed from: f */
    public static Object m39506f(InterfaceC8253a interfaceC8253a, Future future, Class cls) {
        interfaceC8253a.validateClass(cls);
        try {
            return future.get();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw m39497o(cls, e);
        } catch (ExecutionException e2) {
            m39494r(e2.getCause(), cls);
            throw new AssertionError();
        }
    }

    /* renamed from: g */
    public static Object m39505g(Future future, Class cls) {
        return m39506f(m39508d(), future, cls);
    }

    /* renamed from: h */
    public static Object m39504h(Future future, Class cls, long j, TimeUnit timeUnit) {
        m39508d().validateClass(cls);
        try {
            return future.get(j, timeUnit);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw m39497o(cls, e);
        } catch (ExecutionException e2) {
            m39494r(e2.getCause(), cls);
            throw new AssertionError();
        } catch (TimeoutException e3) {
            throw m39497o(cls, e3);
        }
    }

    /* renamed from: i */
    public static boolean m39503i(Class cls) {
        try {
            m39497o(cls, new Exception());
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: j */
    public static boolean m39502j(Class cls) {
        return !RuntimeException.class.isAssignableFrom(cls);
    }

    /* renamed from: k */
    public static /* synthetic */ Comparable m39501k(List list) {
        return Boolean.valueOf(list.contains(String.class));
    }

    /* renamed from: l */
    public static /* synthetic */ Comparable m39500l(List list) {
        return Boolean.valueOf(list.contains(Throwable.class));
    }

    /* renamed from: m */
    public static /* synthetic */ List m39499m(Constructor constructor) {
        return Arrays.asList(constructor.getParameterTypes());
    }

    /* renamed from: n */
    public static Object m39498n(Constructor constructor, Throwable th2) {
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
    public static Exception m39497o(Class cls, Throwable th2) {
        for (Constructor constructor : m39496p(Arrays.asList(cls.getConstructors()))) {
            Exception exc = (Exception) m39498n(constructor, th2);
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
    public static List m39496p(List list) {
        return f54352b.sortedCopy(list);
    }

    /* renamed from: q */
    public static InterfaceC8253a m39495q() {
        return GetCheckedTypeValidatorHolder.WeakSetValidator.INSTANCE;
    }

    /* renamed from: r */
    public static void m39494r(Throwable th2, Class cls) {
        if (!(th2 instanceof Error)) {
            if (th2 instanceof RuntimeException) {
                throw new UncheckedExecutionException(th2);
            }
            throw m39497o(cls, th2);
        }
        throw new ExecutionError((Error) th2);
    }
}
