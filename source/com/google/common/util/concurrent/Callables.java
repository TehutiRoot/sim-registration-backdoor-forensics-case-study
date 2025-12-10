package com.google.common.util.concurrent;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import com.google.common.util.concurrent.Callables;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

@GwtCompatible(emulated = true)
/* loaded from: classes4.dex */
public final class Callables {
    /* renamed from: a */
    public static /* synthetic */ void m39600a(Supplier supplier, Runnable runnable) {
        m39593h(supplier, runnable);
    }

    @J2ktIncompatible
    @GwtIncompatible
    public static <T> AsyncCallable<T> asAsyncCallable(final Callable<T> callable, final ListeningExecutorService listeningExecutorService) {
        Preconditions.checkNotNull(callable);
        Preconditions.checkNotNull(listeningExecutorService);
        return new AsyncCallable() { // from class: kh
            @Override // com.google.common.util.concurrent.AsyncCallable
            public final ListenableFuture call() {
                return Callables.m39599b(listeningExecutorService, callable);
            }
        };
    }

    /* renamed from: b */
    public static /* synthetic */ ListenableFuture m39599b(ListeningExecutorService listeningExecutorService, Callable callable) {
        return listeningExecutorService.submit(callable);
    }

    /* renamed from: c */
    public static /* synthetic */ Object m39598c(Supplier supplier, Callable callable) {
        return m39594g(supplier, callable);
    }

    /* renamed from: d */
    public static /* synthetic */ Object m39597d(Object obj) {
        return m39595f(obj);
    }

    /* renamed from: f */
    public static /* synthetic */ Object m39595f(Object obj) {
        return obj;
    }

    /* renamed from: g */
    public static /* synthetic */ Object m39594g(Supplier supplier, Callable callable) {
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        boolean m39590k = m39590k((String) supplier.get(), currentThread);
        try {
            return callable.call();
        } finally {
            if (m39590k) {
                m39590k(name, currentThread);
            }
        }
    }

    /* renamed from: h */
    public static /* synthetic */ void m39593h(Supplier supplier, Runnable runnable) {
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        boolean m39590k = m39590k((String) supplier.get(), currentThread);
        try {
            runnable.run();
        } finally {
            if (m39590k) {
                m39590k(name, currentThread);
            }
        }
    }

    /* renamed from: i */
    public static Runnable m39592i(final Runnable runnable, final Supplier supplier) {
        Preconditions.checkNotNull(supplier);
        Preconditions.checkNotNull(runnable);
        return new Runnable() { // from class: nh
            @Override // java.lang.Runnable
            public final void run() {
                Callables.m39600a(supplier, runnable);
            }
        };
    }

    /* renamed from: j */
    public static Callable m39591j(final Callable callable, final Supplier supplier) {
        Preconditions.checkNotNull(supplier);
        Preconditions.checkNotNull(callable);
        return new Callable() { // from class: mh
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Callables.m39598c(supplier, callable);
            }
        };
    }

    /* renamed from: k */
    public static boolean m39590k(String str, Thread thread) {
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
                return Callables.m39597d(t);
            }
        };
    }
}
