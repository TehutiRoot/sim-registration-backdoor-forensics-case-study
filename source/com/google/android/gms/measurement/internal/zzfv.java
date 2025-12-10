package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.lang.Thread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class zzfv extends AbstractC20285hs2 {

    /* renamed from: k */
    public static final AtomicLong f48353k = new AtomicLong(Long.MIN_VALUE);

    /* renamed from: b */
    public C6732h f48354b;

    /* renamed from: c */
    public C6732h f48355c;

    /* renamed from: d */
    public final PriorityBlockingQueue f48356d;

    /* renamed from: e */
    public final BlockingQueue f48357e;

    /* renamed from: f */
    public final Thread.UncaughtExceptionHandler f48358f;

    /* renamed from: g */
    public final Thread.UncaughtExceptionHandler f48359g;

    /* renamed from: h */
    public final Object f48360h;

    /* renamed from: i */
    public final Semaphore f48361i;

    /* renamed from: j */
    public volatile boolean f48362j;

    public zzfv(zzfy zzfyVar) {
        super(zzfyVar);
        this.f48360h = new Object();
        this.f48361i = new Semaphore(2);
        this.f48356d = new PriorityBlockingQueue();
        this.f48357e = new LinkedBlockingQueue();
        this.f48358f = new C6728f(this, "Thread death: Uncaught exception on worker thread");
        this.f48359g = new C6728f(this, "Thread death: Uncaught exception on network thread");
    }

    /* renamed from: e */
    public final Object m46285e(AtomicReference atomicReference, long j, String str, Runnable runnable) {
        synchronized (atomicReference) {
            this.zzs.zzaz().zzp(runnable);
            try {
                atomicReference.wait(j);
            } catch (InterruptedException unused) {
                zzem zzk = this.zzs.zzay().zzk();
                zzk.zza("Interrupted waiting for " + str);
                return null;
            }
        }
        Object obj = atomicReference.get();
        if (obj == null) {
            this.zzs.zzay().zzk().zza("Timed out waiting for ".concat(str));
        }
        return obj;
    }

    /* renamed from: k */
    public final void m46279k(C6730g c6730g) {
        synchronized (this.f48360h) {
            try {
                this.f48356d.add(c6730g);
                C6732h c6732h = this.f48354b;
                if (c6732h == null) {
                    C6732h c6732h2 = new C6732h(this, "Measurement Worker", this.f48356d);
                    this.f48354b = c6732h2;
                    c6732h2.setUncaughtExceptionHandler(this.f48358f);
                    this.f48354b.start();
                } else {
                    c6732h.m46369a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6736j
    public final void zzax() {
        if (Thread.currentThread() == this.f48355c) {
            return;
        }
        throw new IllegalStateException("Call expected from network thread");
    }

    @Override // p000.AbstractC20285hs2
    public final boolean zzf() {
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6736j
    public final void zzg() {
        if (Thread.currentThread() == this.f48354b) {
            return;
        }
        throw new IllegalStateException("Call expected from worker thread");
    }

    public final Future zzh(Callable callable) throws IllegalStateException {
        zzu();
        Preconditions.checkNotNull(callable);
        C6730g c6730g = new C6730g(this, callable, false, "Task exception on worker thread");
        if (Thread.currentThread() == this.f48354b) {
            if (!this.f48356d.isEmpty()) {
                this.zzs.zzay().zzk().zza("Callable skipped the worker queue.");
            }
            c6730g.run();
        } else {
            m46279k(c6730g);
        }
        return c6730g;
    }

    public final Future zzi(Callable callable) throws IllegalStateException {
        zzu();
        Preconditions.checkNotNull(callable);
        C6730g c6730g = new C6730g(this, callable, true, "Task exception on worker thread");
        if (Thread.currentThread() == this.f48354b) {
            c6730g.run();
        } else {
            m46279k(c6730g);
        }
        return c6730g;
    }

    public final void zzo(Runnable runnable) throws IllegalStateException {
        zzu();
        Preconditions.checkNotNull(runnable);
        C6730g c6730g = new C6730g(this, runnable, false, "Task exception on network thread");
        synchronized (this.f48360h) {
            try {
                this.f48357e.add(c6730g);
                C6732h c6732h = this.f48355c;
                if (c6732h == null) {
                    C6732h c6732h2 = new C6732h(this, "Measurement Network", this.f48357e);
                    this.f48355c = c6732h2;
                    c6732h2.setUncaughtExceptionHandler(this.f48359g);
                    this.f48355c.start();
                } else {
                    c6732h.m46369a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void zzp(Runnable runnable) throws IllegalStateException {
        zzu();
        Preconditions.checkNotNull(runnable);
        m46279k(new C6730g(this, runnable, false, "Task exception on worker thread"));
    }

    public final void zzq(Runnable runnable) throws IllegalStateException {
        zzu();
        Preconditions.checkNotNull(runnable);
        m46279k(new C6730g(this, runnable, true, "Task exception on worker thread"));
    }

    public final boolean zzs() {
        if (Thread.currentThread() == this.f48354b) {
            return true;
        }
        return false;
    }
}
