package com.google.android.gms.measurement.internal;

import android.os.Process;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Semaphore;

/* renamed from: com.google.android.gms.measurement.internal.h */
/* loaded from: classes3.dex */
public final class C6732h extends Thread {

    /* renamed from: a */
    public final Object f48173a;

    /* renamed from: b */
    public final BlockingQueue f48174b;

    /* renamed from: c */
    public boolean f48175c = false;

    /* renamed from: d */
    public final /* synthetic */ zzfv f48176d;

    public C6732h(zzfv zzfvVar, String str, BlockingQueue blockingQueue) {
        this.f48176d = zzfvVar;
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(blockingQueue);
        this.f48173a = new Object();
        this.f48174b = blockingQueue;
        setName(str);
    }

    /* renamed from: a */
    public final void m46369a() {
        synchronized (this.f48173a) {
            this.f48173a.notifyAll();
        }
    }

    /* renamed from: b */
    public final void m46368b() {
        Object obj;
        Semaphore semaphore;
        Object obj2;
        C6732h c6732h;
        C6732h c6732h2;
        obj = this.f48176d.f48360h;
        synchronized (obj) {
            try {
                if (!this.f48175c) {
                    semaphore = this.f48176d.f48361i;
                    semaphore.release();
                    obj2 = this.f48176d.f48360h;
                    obj2.notifyAll();
                    zzfv zzfvVar = this.f48176d;
                    c6732h = zzfvVar.f48354b;
                    if (this == c6732h) {
                        zzfvVar.f48354b = null;
                    } else {
                        c6732h2 = zzfvVar.f48355c;
                        if (this == c6732h2) {
                            zzfvVar.f48355c = null;
                        } else {
                            zzfvVar.zzs.zzay().zzd().zza("Current scheduler thread is neither worker nor network");
                        }
                    }
                    this.f48175c = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: c */
    public final void m46367c(InterruptedException interruptedException) {
        this.f48176d.zzs.zzay().zzk().zzb(String.valueOf(getName()).concat(" was interrupted"), interruptedException);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        int i;
        Object obj;
        Semaphore semaphore;
        boolean z = false;
        while (!z) {
            try {
                semaphore = this.f48176d.f48361i;
                semaphore.acquire();
                z = true;
            } catch (InterruptedException e) {
                m46367c(e);
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                C6730g c6730g = (C6730g) this.f48174b.poll();
                if (c6730g != null) {
                    if (true != c6730g.f48169b) {
                        i = 10;
                    } else {
                        i = threadPriority;
                    }
                    Process.setThreadPriority(i);
                    c6730g.run();
                } else {
                    synchronized (this.f48173a) {
                        if (this.f48174b.peek() == null) {
                            boolean unused = this.f48176d.f48362j;
                            try {
                                this.f48173a.wait(30000L);
                            } catch (InterruptedException e2) {
                                m46367c(e2);
                            }
                        }
                    }
                    obj = this.f48176d.f48360h;
                    synchronized (obj) {
                        if (this.f48174b.peek() == null) {
                            m46368b();
                            m46368b();
                            return;
                        }
                    }
                }
            }
        } catch (Throwable th2) {
            m46368b();
            throw th2;
        }
    }
}
