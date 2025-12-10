package com.google.common.util.concurrent;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import com.google.common.util.concurrent.Callables;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.ListeningExecutorService;
import java.util.concurrent.Callable;

@GwtCompatible(emulated = true)
/* loaded from: classes4.dex */
public final class Callables {
    /* renamed from: a */
    public static /* synthetic */ void m39592a(Supplier supplier, Runnable runnable) {
        m39585h(supplier, runnable);
    }

    @J2ktIncompatible
    @GwtIncompatible
    public static <T> AsyncCallable<T> asAsyncCallable(final Callable<T> callable, final ListeningExecutorService listeningExecutorService) {
        Preconditions.checkNotNull(callable);
        Preconditions.checkNotNull(listeningExecutorService);
        return new AsyncCallable() { // from class: kh
            @Override // com.google.common.util.concurrent.AsyncCallable
            public final ListenableFuture call() {
                ListenableFuture submit;
                submit = ListeningExecutorService.this.submit(callable);
                return submit;
            }
        };
    }

    /* renamed from: c */
    public static /* synthetic */ Object m39590c(Supplier supplier, Callable callable) {
        return m39586g(supplier, callable);
    }

    /* renamed from: d */
    public static /* synthetic */ Object m39589d(Object obj) {
        return m39587f(obj);
    }

    /* renamed from: f */
    public static /* synthetic */ Object m39587f(Object obj) {
        return obj;
    }

    /* renamed from: g */
    public static /* synthetic */ Object m39586g(Supplier supplier, Callable callable) {
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        boolean m39582k = m39582k((String) supplier.get(), currentThread);
        try {
            return callable.call();
        } finally {
            if (m39582k) {
                m39582k(name, currentThread);
            }
        }
    }

    /* renamed from: h */
    public static /* synthetic */ void m39585h(Supplier supplier, Runnable runnable) {
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        boolean m39582k = m39582k((String) supplier.get(), currentThread);
        try {
            runnable.run();
        } finally {
            if (m39582k) {
                m39582k(name, currentThread);
            }
        }
    }

    /* renamed from: i */
    public static Runnable m39584i(final Runnable runnable, final Supplier supplier) {
        Preconditions.checkNotNull(supplier);
        Preconditions.checkNotNull(runnable);
        return new Runnable() { // from class: nh
            @Override // java.lang.Runnable
            public final void run() {
                Callables.m39592a(Supplier.this, runnable);
            }
        };
    }

    /* renamed from: j */
    public static Callable m39583j(final Callable callable, final Supplier supplier) {
        Preconditions.checkNotNull(supplier);
        Preconditions.checkNotNull(callable);
        return new Callable() { // from class: mh
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Callables.m39590c(Supplier.this, callable);
            }
        };
    }

    /* renamed from: k */
    public static boolean m39582k(String str, Thread thread) {
        try {
            thread.setName(str);
            return true;
        } catch (SecurityException unused) {
            return false;
        }
    }

    public static <T> Callable<T> returning(final T t) {
        return new Callable() { // from class: lh
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Callables.m39589d(t);
            }
        };
    }
}