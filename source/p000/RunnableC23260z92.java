package p000;

import com.google.android.gms.common.api.internal.C6342a;
import java.util.concurrent.locks.Lock;

/* renamed from: z92  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC23260z92 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C6342a f108990a;

    public RunnableC23260z92(C6342a c6342a) {
        this.f108990a = c6342a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Lock lock;
        Lock lock2;
        lock = this.f108990a.f44825m;
        lock.lock();
        try {
            C6342a.m48561p(this.f108990a);
        } finally {
            lock2 = this.f108990a.f44825m;
            lock2.unlock();
        }
    }
}
