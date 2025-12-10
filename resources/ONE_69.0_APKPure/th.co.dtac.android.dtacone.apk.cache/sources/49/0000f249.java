package org.apache.http.impl.conn.tsccm;

import java.util.Date;
import java.util.concurrent.locks.Condition;
import org.apache.http.util.Args;

@Deprecated
/* loaded from: classes6.dex */
public class WaitingThread {

    /* renamed from: a */
    public final Condition f74412a;

    /* renamed from: b */
    public final RouteSpecificPool f74413b;

    /* renamed from: c */
    public Thread f74414c;

    /* renamed from: d */
    public boolean f74415d;

    public WaitingThread(Condition condition, RouteSpecificPool routeSpecificPool) {
        Args.notNull(condition, "Condition");
        this.f74412a = condition;
        this.f74413b = routeSpecificPool;
    }

    public boolean await(Date date) throws InterruptedException {
        boolean z;
        if (this.f74414c == null) {
            if (!this.f74415d) {
                this.f74414c = Thread.currentThread();
                try {
                    if (date != null) {
                        z = this.f74412a.awaitUntil(date);
                    } else {
                        this.f74412a.await();
                        z = true;
                    }
                    if (!this.f74415d) {
                        this.f74414c = null;
                        return z;
                    }
                    throw new InterruptedException("Operation interrupted");
                } catch (Throwable th2) {
                    this.f74414c = null;
                    throw th2;
                }
            }
            throw new InterruptedException("Operation interrupted");
        }
        throw new IllegalStateException("A thread is already waiting on this object.\ncaller: " + Thread.currentThread() + "\nwaiter: " + this.f74414c);
    }

    public final Condition getCondition() {
        return this.f74412a;
    }

    public final RouteSpecificPool getPool() {
        return this.f74413b;
    }

    public final Thread getThread() {
        return this.f74414c;
    }

    public void interrupt() {
        this.f74415d = true;
        this.f74412a.signalAll();
    }

    public void wakeup() {
        if (this.f74414c != null) {
            this.f74412a.signalAll();
            return;
        }
        throw new IllegalStateException("Nobody waiting on this object.");
    }
}