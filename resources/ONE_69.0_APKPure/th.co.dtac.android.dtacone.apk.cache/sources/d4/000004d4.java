package p000;

import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;

/* renamed from: F40 */
/* loaded from: classes4.dex */
public abstract class F40 implements Condition {
    /* renamed from: a */
    public abstract Condition mo39390a();

    @Override // java.util.concurrent.locks.Condition
    public void await() {
        mo39390a().await();
    }

    @Override // java.util.concurrent.locks.Condition
    public long awaitNanos(long j) {
        return mo39390a().awaitNanos(j);
    }

    @Override // java.util.concurrent.locks.Condition
    public void awaitUninterruptibly() {
        mo39390a().awaitUninterruptibly();
    }

    @Override // java.util.concurrent.locks.Condition
    public boolean awaitUntil(Date date) {
        return mo39390a().awaitUntil(date);
    }

    @Override // java.util.concurrent.locks.Condition
    public void signal() {
        mo39390a().signal();
    }

    @Override // java.util.concurrent.locks.Condition
    public void signalAll() {
        mo39390a().signalAll();
    }

    @Override // java.util.concurrent.locks.Condition
    public boolean await(long j, TimeUnit timeUnit) {
        return mo39390a().await(j, timeUnit);
    }
}