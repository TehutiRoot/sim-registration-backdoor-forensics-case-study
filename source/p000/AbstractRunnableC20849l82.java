package p000;

import com.google.android.gms.common.api.internal.zaaw;
import com.google.android.gms.common.api.internal.zabi;
import java.util.concurrent.locks.Lock;

/* renamed from: l82  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractRunnableC20849l82 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ zaaw f71543a;

    /* renamed from: a */
    public abstract void mo26556a();

    @Override // java.lang.Runnable
    public final void run() {
        Lock lock;
        Lock lock2;
        zabi zabiVar;
        lock = this.f71543a.f44844b;
        lock.lock();
        try {
            try {
                if (!Thread.interrupted()) {
                    mo26556a();
                }
            } catch (RuntimeException e) {
                zabiVar = this.f71543a.f44843a;
                zabiVar.m48503g(e);
            }
        } finally {
            lock2 = this.f71543a.f44844b;
            lock2.unlock();
        }
    }
}
