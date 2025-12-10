package com.google.common.util.concurrent;

import com.google.common.base.Preconditions;
import com.google.common.util.concurrent.AbstractFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.common.util.concurrent.f */
/* loaded from: classes4.dex */
public class C8309f implements ListenableFuture {

    /* renamed from: b */
    public static final ListenableFuture f54473b = new C8309f(null);

    /* renamed from: c */
    public static final C23005xi0 f54474c = new C23005xi0(C8309f.class);

    /* renamed from: a */
    public final Object f54475a;

    /* renamed from: com.google.common.util.concurrent.f$a */
    /* loaded from: classes4.dex */
    public static final class C8310a extends AbstractFuture.AbstractC8187i {

        /* renamed from: h */
        public static final C8310a f54476h;

        static {
            C8310a c8310a;
            if (AbstractFuture.f54149d) {
                c8310a = null;
            } else {
                c8310a = new C8310a();
            }
            f54476h = c8310a;
        }

        public C8310a() {
            cancel(false);
        }
    }

    /* renamed from: com.google.common.util.concurrent.f$b */
    /* loaded from: classes4.dex */
    public static final class C8311b extends AbstractFuture.AbstractC8187i {
        public C8311b(Throwable th2) {
            setException(th2);
        }
    }

    public C8309f(Object obj) {
        this.f54475a = obj;
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public void addListener(Runnable runnable, Executor executor) {
        Preconditions.checkNotNull(runnable, "Runnable was null.");
        Preconditions.checkNotNull(executor, "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            Logger m405a = f54474c.m405a();
            Level level = Level.SEVERE;
            m405a.log(level, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public Object get() {
        return this.f54475a;
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
        return super.toString() + "[status=SUCCESS, result=[" + this.f54475a + "]]";
    }

    @Override // java.util.concurrent.Future
    public Object get(long j, TimeUnit timeUnit) {
        Preconditions.checkNotNull(timeUnit);
        return get();
    }
}
