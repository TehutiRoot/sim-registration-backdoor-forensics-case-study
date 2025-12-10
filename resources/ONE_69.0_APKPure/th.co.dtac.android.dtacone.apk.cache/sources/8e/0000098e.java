package p000;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;

/* renamed from: K40 */
/* loaded from: classes4.dex */
public abstract class K40 implements Lock {
    /* renamed from: a */
    public abstract Lock mo39389a();

    @Override // java.util.concurrent.locks.Lock
    public void lock() {
        mo39389a().lock();
    }

    @Override // java.util.concurrent.locks.Lock
    public void lockInterruptibly() {
        mo39389a().lockInterruptibly();
    }

    @Override // java.util.concurrent.locks.Lock
    public boolean tryLock() {
        return mo39389a().tryLock();
    }

    @Override // java.util.concurrent.locks.Lock
    public void unlock() {
        mo39389a().unlock();
    }

    @Override // java.util.concurrent.locks.Lock
    public boolean tryLock(long j, TimeUnit timeUnit) {
        return mo39389a().tryLock(j, timeUnit);
    }
}