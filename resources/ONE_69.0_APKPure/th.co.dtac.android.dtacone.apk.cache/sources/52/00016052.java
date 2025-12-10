package p000;

import com.google.android.gms.common.api.internal.C6331a;
import java.util.concurrent.locks.Lock;

/* renamed from: wa2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC22880wa2 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C6331a f108490a;

    public RunnableC22880wa2(C6331a c6331a) {
        this.f108490a = c6331a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Lock lock;
        Lock lock2;
        lock = this.f108490a.f44837m;
        lock.lock();
        try {
            C6331a.m48558p(this.f108490a);
        } finally {
            lock2 = this.f108490a.f44837m;
            lock2.unlock();
        }
    }
}