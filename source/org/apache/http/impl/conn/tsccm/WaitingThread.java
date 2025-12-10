package org.apache.http.impl.conn.tsccm;

import java.util.Date;
import java.util.concurrent.locks.Condition;
import org.apache.http.util.Args;

@Deprecated
/* loaded from: classes6.dex */
public class WaitingThread {

    /* renamed from: a */
    public final Condition f74328a;

    /* renamed from: b */
    public final RouteSpecificPool f74329b;

    /* renamed from: c */
    public Thread f74330c;

    /* renamed from: d */
    public boolean f74331d;

    public WaitingThread(Condition condition, RouteSpecificPool routeSpecificPool) {
        Args.notNull(condition, "Condition");
        this.f74328a = condition;
        this.f74329b = routeSpecificPool;
    }

    public boolean await(Date date) throws InterruptedException {
        boolean z;
        if (this.f74330c == null) {
            if (!this.f74331d) {
                this.f74330c = Thread.currentThread();
                try {
                    if (date != null) {
                        z = this.f74328a.awaitUntil(date);
                    } else {
                        this.f74328a.await();
                        z = true;
                    }
                    if (!this.f74331d) {
                        this.f74330c = null;
                        return z;
                    }
                    throw new InterruptedException("Operation interrupted");
                } catch (Throwable th2) {
                    this.f74330c = null;
                    throw th2;
                }
            }
            throw new InterruptedException("Operation interrupted");
        }
        throw new IllegalStateException("A thread is already waiting on this object.\ncaller: " + Thread.currentThread() + "\nwaiter: " + this.f74330c);
    }

    public final Condition getCondition() {
        return this.f74328a;
    }

    public final RouteSpecificPool getPool() {
        return this.f74329b;
    }

    public final Thread getThread() {
        return this.f74330c;
    }

    public void interrupt() {
        this.f74331d = true;
        this.f74328a.signalAll();
    }

    public void wakeup() {
        if (this.f74330c != null) {
            this.f74328a.signalAll();
            return;
        }
        throw new IllegalStateException("Nobody waiting on this object.");
    }
}
