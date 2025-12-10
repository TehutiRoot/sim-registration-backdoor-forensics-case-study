package p000;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;

/* renamed from: G40 */
/* loaded from: classes4.dex */
public abstract class G40 implements Lock {
    /* renamed from: a */
    public abstract Lock mo39397a();

    @Override // java.util.concurrent.locks.Lock
    public void lock() {
        mo39397a().lock();
    }

    @Override // java.util.concurrent.locks.Lock
    public void lockInterruptibly() {
        mo39397a().lockInterruptibly();
    }

    @Override // java.util.concurrent.locks.Lock
    public boolean tryLock() {
        return mo39397a().tryLock();
    }

    @Override // java.util.concurrent.locks.Lock
    public void unlock() {
        mo39397a().unlock();
    }

    @Override // java.util.concurrent.locks.Lock
    public boolean tryLock(long j, TimeUnit timeUnit) {
        return mo39397a().tryLock(j, timeUnit);
    }
}
