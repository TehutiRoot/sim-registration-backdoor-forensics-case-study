package p000;

import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;

/* renamed from: B40 */
/* loaded from: classes4.dex */
public abstract class B40 implements Condition {
    /* renamed from: a */
    public abstract Condition mo39398a();

    @Override // java.util.concurrent.locks.Condition
    public void await() {
        mo39398a().await();
    }

    @Override // java.util.concurrent.locks.Condition
    public long awaitNanos(long j) {
        return mo39398a().awaitNanos(j);
    }

    @Override // java.util.concurrent.locks.Condition
    public void awaitUninterruptibly() {
        mo39398a().awaitUninterruptibly();
    }

    @Override // java.util.concurrent.locks.Condition
    public boolean awaitUntil(Date date) {
        return mo39398a().awaitUntil(date);
    }

    @Override // java.util.concurrent.locks.Condition
    public void signal() {
        mo39398a().signal();
    }

    @Override // java.util.concurrent.locks.Condition
    public void signalAll() {
        mo39398a().signalAll();
    }

    @Override // java.util.concurrent.locks.Condition
    public boolean await(long j, TimeUnit timeUnit) {
        return mo39398a().await(j, timeUnit);
    }
}
