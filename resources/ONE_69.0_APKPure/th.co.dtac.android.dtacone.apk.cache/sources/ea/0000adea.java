package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.collect.ObjectArrays;
import com.google.common.collect.Sets;
import com.google.common.util.concurrent.SimpleTimeLimiter;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@J2ktIncompatible
@GwtIncompatible
/* loaded from: classes4.dex */
public final class SimpleTimeLimiter implements TimeLimiter {

    /* renamed from: a */
    public final ExecutorService f54429a;

    /* renamed from: com.google.common.util.concurrent.SimpleTimeLimiter$a */
    /* loaded from: classes4.dex */
    public class C8269a implements InvocationHandler {

        /* renamed from: a */
        public final /* synthetic */ Object f54430a;

        /* renamed from: b */
        public final /* synthetic */ long f54431b;

        /* renamed from: c */
        public final /* synthetic */ TimeUnit f54432c;

        /* renamed from: d */
        public final /* synthetic */ Set f54433d;

        /* renamed from: e */
        public final /* synthetic */ SimpleTimeLimiter f54434e;

        public C8269a(SimpleTimeLimiter simpleTimeLimiter, Object obj, long j, TimeUnit timeUnit, Set set) {
            this.f54430a = obj;
            this.f54431b = j;
            this.f54432c = timeUnit;
            this.f54433d = set;
            this.f54434e = simpleTimeLimiter;
        }

        /* renamed from: a */
        public static /* synthetic */ Object m39406a(Method method, Object obj, Object[] objArr) {
            return m39405b(method, obj, objArr);
        }

        /* renamed from: b */
        public static /* synthetic */ Object m39405b(Method method, Object obj, Object[] objArr) {
            try {
                return method.invoke(obj, objArr);
            } catch (InvocationTargetException e) {
                throw SimpleTimeLimiter.m39409h(e, false);
            }
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, final Method method, final Object[] objArr) {
            final Object obj2 = this.f54430a;
            return this.f54434e.m39414c(new Callable() { // from class: wK1
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return SimpleTimeLimiter.C8269a.m39406a(method, obj2, objArr);
                }
            }, this.f54431b, this.f54432c, this.f54433d.contains(method));
        }
    }

    public SimpleTimeLimiter(ExecutorService executorService) {
        this.f54429a = (ExecutorService) Preconditions.checkNotNull(executorService);
    }

    public static SimpleTimeLimiter create(ExecutorService executorService) {
        return new SimpleTimeLimiter(executorService);
    }

    /* renamed from: d */
    public static void m39413d(long j) {
        boolean z;
        if (j > 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "timeout must be positive: %s", j);
    }

    /* renamed from: e */
    public static boolean m39412e(Method method) {
        for (Class<?> cls : method.getExceptionTypes()) {
            if (cls == InterruptedException.class) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public static Set m39411f(Class cls) {
        Method[] methods;
        HashSet newHashSet = Sets.newHashSet();
        for (Method method : cls.getMethods()) {
            if (m39412e(method)) {
                newHashSet.add(method);
            }
        }
        return newHashSet;
    }

    /* renamed from: g */
    public static Object m39410g(Class cls, InvocationHandler invocationHandler) {
        return cls.cast(Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, invocationHandler));
    }

    /* renamed from: h */
    public static Exception m39409h(Exception exc, boolean z) {
        Throwable cause = exc.getCause();
        if (cause != null) {
            if (z) {
                cause.setStackTrace((StackTraceElement[]) ObjectArrays.concat(cause.getStackTrace(), exc.getStackTrace(), StackTraceElement.class));
            }
            if (!(cause instanceof Exception)) {
                if (cause instanceof Error) {
                    throw ((Error) cause);
                }
                throw exc;
            }
            throw ((Exception) cause);
        }
        throw exc;
    }

    /* renamed from: c */
    public final Object m39414c(Callable callable, long j, TimeUnit timeUnit, boolean z) {
        Preconditions.checkNotNull(callable);
        Preconditions.checkNotNull(timeUnit);
        m39413d(j);
        Future submit = this.f54429a.submit(callable);
        try {
            if (z) {
                return submit.get(j, timeUnit);
            }
            return Uninterruptibles.getUninterruptibly(submit, j, timeUnit);
        } catch (InterruptedException e) {
            submit.cancel(true);
            throw e;
        } catch (ExecutionException e2) {
            throw m39409h(e2, true);
        } catch (TimeoutException e3) {
            submit.cancel(true);
            throw new UncheckedTimeoutException(e3);
        }
    }

    @Override // com.google.common.util.concurrent.TimeLimiter
    @CanIgnoreReturnValue
    public <T> T callUninterruptiblyWithTimeout(Callable<T> callable, long j, TimeUnit timeUnit) throws TimeoutException, ExecutionException {
        Preconditions.checkNotNull(callable);
        Preconditions.checkNotNull(timeUnit);
        m39413d(j);
        Future<T> submit = this.f54429a.submit(callable);
        try {
            return (T) Uninterruptibles.getUninterruptibly(submit, j, timeUnit);
        } catch (ExecutionException e) {
            m39408i(e.getCause());
            throw new AssertionError();
        } catch (TimeoutException e2) {
            submit.cancel(true);
            throw e2;
        }
    }

    @Override // com.google.common.util.concurrent.TimeLimiter
    @CanIgnoreReturnValue
    public <T> T callWithTimeout(Callable<T> callable, long j, TimeUnit timeUnit) throws TimeoutException, InterruptedException, ExecutionException {
        Preconditions.checkNotNull(callable);
        Preconditions.checkNotNull(timeUnit);
        m39413d(j);
        Future<T> submit = this.f54429a.submit(callable);
        try {
            return submit.get(j, timeUnit);
        } catch (InterruptedException e) {
            e = e;
            submit.cancel(true);
            throw e;
        } catch (ExecutionException e2) {
            m39408i(e2.getCause());
            throw new AssertionError();
        } catch (TimeoutException e3) {
            e = e3;
            submit.cancel(true);
            throw e;
        }
    }

    /* renamed from: i */
    public final void m39408i(Throwable th2) {
        if (!(th2 instanceof Error)) {
            if (th2 instanceof RuntimeException) {
                throw new UncheckedExecutionException(th2);
            }
            throw new ExecutionException(th2);
        }
        throw new ExecutionError((Error) th2);
    }

    /* renamed from: j */
    public final void m39407j(Throwable th2) {
        if (th2 instanceof Error) {
            throw new ExecutionError((Error) th2);
        }
        throw new UncheckedExecutionException(th2);
    }

    @Override // com.google.common.util.concurrent.TimeLimiter
    public <T> T newProxy(T t, Class<T> cls, long j, TimeUnit timeUnit) {
        Preconditions.checkNotNull(t);
        Preconditions.checkNotNull(cls);
        Preconditions.checkNotNull(timeUnit);
        m39413d(j);
        Preconditions.checkArgument(cls.isInterface(), "interfaceType must be an interface type");
        return (T) m39410g(cls, new C8269a(this, t, j, timeUnit, m39411f(cls)));
    }

    @Override // com.google.common.util.concurrent.TimeLimiter
    public void runUninterruptiblyWithTimeout(Runnable runnable, long j, TimeUnit timeUnit) throws TimeoutException {
        Preconditions.checkNotNull(runnable);
        Preconditions.checkNotNull(timeUnit);
        m39413d(j);
        Future<?> submit = this.f54429a.submit(runnable);
        try {
            Uninterruptibles.getUninterruptibly(submit, j, timeUnit);
        } catch (ExecutionException e) {
            m39407j(e.getCause());
            throw new AssertionError();
        } catch (TimeoutException e2) {
            submit.cancel(true);
            throw e2;
        }
    }

    @Override // com.google.common.util.concurrent.TimeLimiter
    public void runWithTimeout(Runnable runnable, long j, TimeUnit timeUnit) throws TimeoutException, InterruptedException {
        Preconditions.checkNotNull(runnable);
        Preconditions.checkNotNull(timeUnit);
        m39413d(j);
        Future<?> submit = this.f54429a.submit(runnable);
        try {
            submit.get(j, timeUnit);
        } catch (InterruptedException e) {
            e = e;
            submit.cancel(true);
            throw e;
        } catch (ExecutionException e2) {
            m39407j(e2.getCause());
            throw new AssertionError();
        } catch (TimeoutException e3) {
            e = e3;
            submit.cancel(true);
            throw e;
        }
    }
}