package com.google.common.util.concurrent;

import com.google.common.base.Preconditions;
import com.google.common.util.concurrent.AbstractFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.common.util.concurrent.f */
/* loaded from: classes4.dex */
public class C8298f implements ListenableFuture {

    /* renamed from: b */
    public static final ListenableFuture f54485b = new C8298f(null);

    /* renamed from: c */
    public static final C17503Di0 f54486c = new C17503Di0(C8298f.class);

    /* renamed from: a */
    public final Object f54487a;

    /* renamed from: com.google.common.util.concurrent.f$a */
    /* loaded from: classes4.dex */
    public static final class C8299a extends AbstractFuture.AbstractC8176i {

        /* renamed from: h */
        public static final C8299a f54488h;

        static {
            C8299a c8299a;
            if (AbstractFuture.f54161d) {
                c8299a = null;
            } else {
                c8299a = new C8299a();
            }
            f54488h = c8299a;
        }

        public C8299a() {
            cancel(false);
        }
    }

    /* renamed from: com.google.common.util.concurrent.f$b */
    /* loaded from: classes4.dex */
    public static final class C8300b extends AbstractFuture.AbstractC8176i {
        public C8300b(Throwable th2) {
            setException(th2);
        }
    }

    public C8298f(Object obj) {
        this.f54487a = obj;
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public void addListener(Runnable runnable, Executor executor) {
        Preconditions.checkNotNull(runnable, "Runnable was null.");
        Preconditions.checkNotNull(executor, "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            Logger m68797a = f54486c.m68797a();
            Level level = Level.SEVERE;
            m68797a.log(level, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public Object get() {
        return this.f54487a;
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return true;
    }

    public String toString() {
        return super.toString() + "[status=SUCCESS, result=[" + this.f54487a + "]]";
    }

    @Override // java.util.concurrent.Future
    public Object get(long j, TimeUnit timeUnit) {
        Preconditions.checkNotNull(timeUnit);
        return get();
    }
}