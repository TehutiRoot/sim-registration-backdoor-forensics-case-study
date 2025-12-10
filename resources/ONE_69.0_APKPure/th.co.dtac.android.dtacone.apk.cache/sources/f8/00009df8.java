package com.google.android.gms.measurement.internal;

import android.os.Process;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Semaphore;

/* renamed from: com.google.android.gms.measurement.internal.h */
/* loaded from: classes3.dex */
public final class C6721h extends Thread {

    /* renamed from: a */
    public final Object f48185a;

    /* renamed from: b */
    public final BlockingQueue f48186b;

    /* renamed from: c */
    public boolean f48187c = false;

    /* renamed from: d */
    public final /* synthetic */ zzfv f48188d;

    public C6721h(zzfv zzfvVar, String str, BlockingQueue blockingQueue) {
        this.f48188d = zzfvVar;
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(blockingQueue);
        this.f48185a = new Object();
        this.f48186b = blockingQueue;
        setName(str);
    }

    /* renamed from: a */
    public final void m46354a() {
        synchronized (this.f48185a) {
            this.f48185a.notifyAll();
        }
    }

    /* renamed from: b */
    public final void m46353b() {
        Object obj;
        Semaphore semaphore;
        Object obj2;
        C6721h c6721h;
        C6721h c6721h2;
        obj = this.f48188d.f48372h;
        synchronized (obj) {
            try {
                if (!this.f48187c) {
                    semaphore = this.f48188d.f48373i;
                    semaphore.release();
                    obj2 = this.f48188d.f48372h;
                    obj2.notifyAll();
                    zzfv zzfvVar = this.f48188d;
                    c6721h = zzfvVar.f48366b;
                    if (this == c6721h) {
                        zzfvVar.f48366b = null;
                    } else {
                        c6721h2 = zzfvVar.f48367c;
                        if (this == c6721h2) {
                            zzfvVar.f48367c = null;
                        } else {
                            zzfvVar.zzs.zzay().zzd().zza("Current scheduler thread is neither worker nor network");
                        }
                    }
                    this.f48187c = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: c */
    public final void m46352c(InterruptedException interruptedException) {
        this.f48188d.zzs.zzay().zzk().zzb(String.valueOf(getName()).concat(" was interrupted"), interruptedException);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        int i;
        Object obj;
        Semaphore semaphore;
        boolean z = false;
        while (!z) {
            try {
                semaphore = this.f48188d.f48373i;
                semaphore.acquire();
                z = true;
            } catch (InterruptedException e) {
                m46352c(e);
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                C6719g c6719g = (C6719g) this.f48186b.poll();
                if (c6719g != null) {
                    if (true != c6719g.f48181b) {
                        i = 10;
                    } else {
                        i = threadPriority;
                    }
                    Process.setThreadPriority(i);
                    c6719g.run();
                } else {
                    synchronized (this.f48185a) {
                        if (this.f48186b.peek() == null) {
                            boolean unused = this.f48188d.f48374j;
                            try {
                                this.f48185a.wait(30000L);
                            } catch (InterruptedException e2) {
                                m46352c(e2);
                            }
                        }
                    }
                    obj = this.f48188d.f48372h;
                    synchronized (obj) {
                        if (this.f48186b.peek() == null) {
                            m46353b();
                            m46353b();
                            return;
                        }
                    }
                }
            }
        } catch (Throwable th2) {
            m46353b();
            throw th2;
        }
    }
}