package p000;

import com.google.android.gms.common.api.internal.zabf;
import com.google.android.gms.common.api.internal.zabi;
import java.util.concurrent.locks.Lock;

/* renamed from: v82  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC22569v82 {

    /* renamed from: a */
    public final zabf f107585a;

    public AbstractC22569v82(zabf zabfVar) {
        this.f107585a = zabfVar;
    }

    /* renamed from: a */
    public abstract void mo1105a();

    /* renamed from: b */
    public final void m1104b(zabi zabiVar) {
        Lock lock;
        Lock lock2;
        zabf zabfVar;
        lock = zabiVar.f44890a;
        lock.lock();
        try {
            zabfVar = zabiVar.f44900k;
            if (zabfVar == this.f107585a) {
                mo1105a();
            }
        } finally {
            lock2 = zabiVar.f44890a;
            lock2.unlock();
        }
    }
}
