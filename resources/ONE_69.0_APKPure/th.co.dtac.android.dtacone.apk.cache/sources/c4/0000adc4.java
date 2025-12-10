package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.primitives.Longs;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

@J2ktIncompatible
@GwtIncompatible
/* loaded from: classes4.dex */
public final class Monitor {

    /* renamed from: a */
    public final boolean f54373a;

    /* renamed from: b */
    public final ReentrantLock f54374b;

    /* renamed from: c */
    public Guard f54375c;

    /* loaded from: classes4.dex */
    public static abstract class Guard {

        /* renamed from: a */
        public final Monitor f54376a;

        /* renamed from: b */
        public final Condition f54377b;

        /* renamed from: c */
        public int f54378c = 0;

        /* renamed from: d */
        public Guard f54379d;

        public Guard(Monitor monitor) {
            this.f54376a = (Monitor) Preconditions.checkNotNull(monitor, "monitor");
            this.f54377b = monitor.f54374b.newCondition();
        }

        public abstract boolean isSatisfied();
    }

    public Monitor() {
        this(false);
    }

    /* renamed from: g */
    public static long m39476g(long j) {
        if (j <= 0) {
            return 0L;
        }
        long nanoTime = System.nanoTime();
        if (nanoTime == 0) {
            return 1L;
        }
        return nanoTime;
    }

    /* renamed from: i */
    public static long m39474i(long j, long j2) {
        if (j2 <= 0) {
            return 0L;
        }
        return j2 - (System.nanoTime() - j);
    }

    /* renamed from: l */
    public static long m39471l(long j, TimeUnit timeUnit) {
        return Longs.constrainToRange(timeUnit.toNanos(j), 0L, 6917529027641081853L);
    }

    /* renamed from: b */
    public final void m39481b(Guard guard, boolean z) {
        if (z) {
            m39472k();
        }
        m39478e(guard);
        do {
            try {
                guard.f54377b.await();
            } finally {
                m39477f(guard);
            }
        } while (!guard.isSatisfied());
    }

    /* renamed from: c */
    public final boolean m39480c(Guard guard, long j, boolean z) {
        boolean z2 = true;
        while (j > 0) {
            if (z2) {
                if (z) {
                    try {
                        m39472k();
                    } catch (Throwable th2) {
                        if (!z2) {
                            m39477f(guard);
                        }
                        throw th2;
                    }
                }
                m39478e(guard);
                z2 = false;
            }
            j = guard.f54377b.awaitNanos(j);
            if (guard.isSatisfied()) {
                if (!z2) {
                    m39477f(guard);
                }
                return true;
            }
        }
        if (!z2) {
            m39477f(guard);
        }
        return false;
    }

    /* renamed from: d */
    public final void m39479d(Guard guard, boolean z) {
        if (z) {
            m39472k();
        }
        m39478e(guard);
        do {
            try {
                guard.f54377b.awaitUninterruptibly();
            } finally {
                m39477f(guard);
            }
        } while (!guard.isSatisfied());
    }

    /* renamed from: e */
    public final void m39478e(Guard guard) {
        int i = guard.f54378c;
        guard.f54378c = i + 1;
        if (i == 0) {
            guard.f54379d = this.f54375c;
            this.f54375c = guard;
        }
    }

    public void enter() {
        this.f54374b.lock();
    }

    public boolean enterIf(Guard guard) {
        if (guard.f54376a == this) {
            ReentrantLock reentrantLock = this.f54374b;
            reentrantLock.lock();
            try {
                boolean isSatisfied = guard.isSatisfied();
                if (!isSatisfied) {
                }
                return isSatisfied;
            } finally {
                reentrantLock.unlock();
            }
        }
        throw new IllegalMonitorStateException();
    }

    public boolean enterIfInterruptibly(Guard guard) throws InterruptedException {
        if (guard.f54376a == this) {
            ReentrantLock reentrantLock = this.f54374b;
            reentrantLock.lockInterruptibly();
            try {
                boolean isSatisfied = guard.isSatisfied();
                if (!isSatisfied) {
                }
                return isSatisfied;
            } finally {
                reentrantLock.unlock();
            }
        }
        throw new IllegalMonitorStateException();
    }

    public void enterInterruptibly() throws InterruptedException {
        this.f54374b.lockInterruptibly();
    }

    public void enterWhen(Guard guard) throws InterruptedException {
        if (guard.f54376a == this) {
            ReentrantLock reentrantLock = this.f54374b;
            boolean isHeldByCurrentThread = reentrantLock.isHeldByCurrentThread();
            reentrantLock.lockInterruptibly();
            try {
                if (guard.isSatisfied()) {
                    return;
                }
                m39481b(guard, isHeldByCurrentThread);
                return;
            } catch (Throwable th2) {
                leave();
                throw th2;
            }
        }
        throw new IllegalMonitorStateException();
    }

    public void enterWhenUninterruptibly(Guard guard) {
        if (guard.f54376a == this) {
            ReentrantLock reentrantLock = this.f54374b;
            boolean isHeldByCurrentThread = reentrantLock.isHeldByCurrentThread();
            reentrantLock.lock();
            try {
                if (guard.isSatisfied()) {
                    return;
                }
                m39479d(guard, isHeldByCurrentThread);
                return;
            } catch (Throwable th2) {
                leave();
                throw th2;
            }
        }
        throw new IllegalMonitorStateException();
    }

    /* renamed from: f */
    public final void m39477f(Guard guard) {
        int i = guard.f54378c - 1;
        guard.f54378c = i;
        if (i == 0) {
            Guard guard2 = this.f54375c;
            Guard guard3 = null;
            while (guard2 != guard) {
                guard3 = guard2;
                guard2 = guard2.f54379d;
            }
            if (guard3 == null) {
                this.f54375c = guard2.f54379d;
            } else {
                guard3.f54379d = guard2.f54379d;
            }
            guard2.f54379d = null;
        }
    }

    public int getOccupiedDepth() {
        return this.f54374b.getHoldCount();
    }

    public int getQueueLength() {
        return this.f54374b.getQueueLength();
    }

    public int getWaitQueueLength(Guard guard) {
        if (guard.f54376a == this) {
            this.f54374b.lock();
            try {
                return guard.f54378c;
            } finally {
                this.f54374b.unlock();
            }
        }
        throw new IllegalMonitorStateException();
    }

    /* renamed from: h */
    public final boolean m39475h(Guard guard) {
        try {
            return guard.isSatisfied();
        } catch (Throwable th2) {
            m39473j();
            throw th2;
        }
    }

    public boolean hasQueuedThread(Thread thread) {
        return this.f54374b.hasQueuedThread(thread);
    }

    public boolean hasQueuedThreads() {
        return this.f54374b.hasQueuedThreads();
    }

    public boolean hasWaiters(Guard guard) {
        if (getWaitQueueLength(guard) > 0) {
            return true;
        }
        return false;
    }

    public boolean isFair() {
        return this.f54373a;
    }

    public boolean isOccupied() {
        return this.f54374b.isLocked();
    }

    public boolean isOccupiedByCurrentThread() {
        return this.f54374b.isHeldByCurrentThread();
    }

    /* renamed from: j */
    public final void m39473j() {
        for (Guard guard = this.f54375c; guard != null; guard = guard.f54379d) {
            guard.f54377b.signalAll();
        }
    }

    /* renamed from: k */
    public final void m39472k() {
        for (Guard guard = this.f54375c; guard != null; guard = guard.f54379d) {
            if (m39475h(guard)) {
                guard.f54377b.signal();
                return;
            }
        }
    }

    public void leave() {
        ReentrantLock reentrantLock = this.f54374b;
        try {
            if (reentrantLock.getHoldCount() == 1) {
                m39472k();
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public boolean tryEnter() {
        return this.f54374b.tryLock();
    }

    public boolean tryEnterIf(Guard guard) {
        if (guard.f54376a == this) {
            ReentrantLock reentrantLock = this.f54374b;
            if (!reentrantLock.tryLock()) {
                return false;
            }
            try {
                boolean isSatisfied = guard.isSatisfied();
                if (!isSatisfied) {
                }
                return isSatisfied;
            } finally {
                reentrantLock.unlock();
            }
        }
        throw new IllegalMonitorStateException();
    }

    public void waitFor(Guard guard) throws InterruptedException {
        if (guard.f54376a == this && this.f54374b.isHeldByCurrentThread()) {
            if (guard.isSatisfied()) {
                return;
            }
            m39481b(guard, true);
            return;
        }
        throw new IllegalMonitorStateException();
    }

    public void waitForUninterruptibly(Guard guard) {
        if (guard.f54376a == this && this.f54374b.isHeldByCurrentThread()) {
            if (guard.isSatisfied()) {
                return;
            }
            m39479d(guard, true);
            return;
        }
        throw new IllegalMonitorStateException();
    }

    public Monitor(boolean z) {
        this.f54375c = null;
        this.f54373a = z;
        this.f54374b = new ReentrantLock(z);
    }

    public boolean enter(long j, TimeUnit timeUnit) {
        boolean tryLock;
        long m39471l = m39471l(j, timeUnit);
        ReentrantLock reentrantLock = this.f54374b;
        boolean z = true;
        if (!this.f54373a && reentrantLock.tryLock()) {
            return true;
        }
        boolean interrupted = Thread.interrupted();
        try {
            long nanoTime = System.nanoTime();
            long j2 = m39471l;
            while (true) {
                try {
                    try {
                        tryLock = reentrantLock.tryLock(j2, TimeUnit.NANOSECONDS);
                        break;
                    } catch (InterruptedException unused) {
                        j2 = m39474i(nanoTime, m39471l);
                        interrupted = true;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            }
            if (interrupted) {
                Thread.currentThread().interrupt();
            }
            return tryLock;
        } catch (Throwable th3) {
            th = th3;
            z = interrupted;
        }
    }

    public boolean enterInterruptibly(long j, TimeUnit timeUnit) throws InterruptedException {
        return this.f54374b.tryLock(j, timeUnit);
    }

    public boolean waitFor(Guard guard, long j, TimeUnit timeUnit) throws InterruptedException {
        long m39471l = m39471l(j, timeUnit);
        if (guard.f54376a == this && this.f54374b.isHeldByCurrentThread()) {
            if (guard.isSatisfied()) {
                return true;
            }
            if (!Thread.interrupted()) {
                return m39480c(guard, m39471l, true);
            }
            throw new InterruptedException();
        }
        throw new IllegalMonitorStateException();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean waitForUninterruptibly(com.google.common.util.concurrent.Monitor.Guard r7, long r8, java.util.concurrent.TimeUnit r10) {
        /*
            r6 = this;
            long r8 = m39471l(r8, r10)
            com.google.common.util.concurrent.Monitor r10 = r7.f54376a
            if (r10 != r6) goto L53
            java.util.concurrent.locks.ReentrantLock r10 = r6.f54374b
            boolean r10 = r10.isHeldByCurrentThread()
            if (r10 == 0) goto L53
            boolean r10 = r7.isSatisfied()
            r0 = 1
            if (r10 == 0) goto L18
            return r0
        L18:
            long r1 = m39476g(r8)
            boolean r10 = java.lang.Thread.interrupted()
            r3 = r8
            r5 = 1
        L22:
            boolean r7 = r6.m39480c(r7, r3, r5)     // Catch: java.lang.Throwable -> L30 java.lang.InterruptedException -> L33
            if (r10 == 0) goto L2f
            java.lang.Thread r8 = java.lang.Thread.currentThread()
            r8.interrupt()
        L2f:
            return r7
        L30:
            r7 = move-exception
            r0 = r10
            goto L49
        L33:
            boolean r10 = r7.isSatisfied()     // Catch: java.lang.Throwable -> L48
            if (r10 == 0) goto L41
            java.lang.Thread r7 = java.lang.Thread.currentThread()
            r7.interrupt()
            return r0
        L41:
            long r3 = m39474i(r1, r8)     // Catch: java.lang.Throwable -> L48
            r5 = 0
            r10 = 1
            goto L22
        L48:
            r7 = move-exception
        L49:
            if (r0 == 0) goto L52
            java.lang.Thread r8 = java.lang.Thread.currentThread()
            r8.interrupt()
        L52:
            throw r7
        L53:
            java.lang.IllegalMonitorStateException r7 = new java.lang.IllegalMonitorStateException
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.util.concurrent.Monitor.waitForUninterruptibly(com.google.common.util.concurrent.Monitor$Guard, long, java.util.concurrent.TimeUnit):boolean");
    }

    public boolean enterIf(Guard guard, long j, TimeUnit timeUnit) {
        if (guard.f54376a == this) {
            if (enter(j, timeUnit)) {
                try {
                    boolean isSatisfied = guard.isSatisfied();
                    if (!isSatisfied) {
                    }
                    return isSatisfied;
                } finally {
                    this.f54374b.unlock();
                }
            }
            return false;
        }
        throw new IllegalMonitorStateException();
    }

    public boolean enterIfInterruptibly(Guard guard, long j, TimeUnit timeUnit) throws InterruptedException {
        if (guard.f54376a == this) {
            ReentrantLock reentrantLock = this.f54374b;
            if (reentrantLock.tryLock(j, timeUnit)) {
                try {
                    boolean isSatisfied = guard.isSatisfied();
                    if (!isSatisfied) {
                    }
                    return isSatisfied;
                } finally {
                    reentrantLock.unlock();
                }
            }
            return false;
        }
        throw new IllegalMonitorStateException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0047, code lost:
        if (m39480c(r11, r0, r3) != false) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004f A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean enterWhen(com.google.common.util.concurrent.Monitor.Guard r11, long r12, java.util.concurrent.TimeUnit r14) throws java.lang.InterruptedException {
        /*
            r10 = this;
            long r0 = m39471l(r12, r14)
            com.google.common.util.concurrent.Monitor r2 = r11.f54376a
            if (r2 != r10) goto L62
            java.util.concurrent.locks.ReentrantLock r2 = r10.f54374b
            boolean r3 = r2.isHeldByCurrentThread()
            boolean r4 = r10.f54373a
            r5 = 0
            r6 = 0
            if (r4 != 0) goto L29
            boolean r4 = java.lang.Thread.interrupted()
            if (r4 != 0) goto L23
            boolean r4 = r2.tryLock()
            if (r4 == 0) goto L29
            r8 = r6
            goto L34
        L23:
            java.lang.InterruptedException r11 = new java.lang.InterruptedException
            r11.<init>()
            throw r11
        L29:
            long r8 = m39476g(r0)
            boolean r12 = r2.tryLock(r12, r14)
            if (r12 != 0) goto L34
            return r5
        L34:
            boolean r12 = r11.isSatisfied()     // Catch: java.lang.Throwable -> L4a
            if (r12 != 0) goto L4c
            int r12 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r12 != 0) goto L3f
            goto L43
        L3f:
            long r0 = m39474i(r8, r0)     // Catch: java.lang.Throwable -> L4a
        L43:
            boolean r11 = r10.m39480c(r11, r0, r3)     // Catch: java.lang.Throwable -> L4a
            if (r11 == 0) goto L4d
            goto L4c
        L4a:
            r11 = move-exception
            goto L53
        L4c:
            r5 = 1
        L4d:
            if (r5 != 0) goto L52
            r2.unlock()
        L52:
            return r5
        L53:
            if (r3 != 0) goto L5e
            r10.m39472k()     // Catch: java.lang.Throwable -> L59
            goto L5e
        L59:
            r11 = move-exception
            r2.unlock()
            throw r11
        L5e:
            r2.unlock()
            throw r11
        L62:
            java.lang.IllegalMonitorStateException r11 = new java.lang.IllegalMonitorStateException
            r11.<init>()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.util.concurrent.Monitor.enterWhen(com.google.common.util.concurrent.Monitor$Guard, long, java.util.concurrent.TimeUnit):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004f A[Catch: all -> 0x0023, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0023, blocks: (B:5:0x0012, B:7:0x001a, B:28:0x004f, B:32:0x005c, B:33:0x005f, B:13:0x0025, B:15:0x002a, B:17:0x0032, B:22:0x003d, B:26:0x0049, B:25:0x0045), top: B:47:0x0012, inners: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean enterWhenUninterruptibly(com.google.common.util.concurrent.Monitor.Guard r12, long r13, java.util.concurrent.TimeUnit r15) {
        /*
            r11 = this;
            long r13 = m39471l(r13, r15)
            com.google.common.util.concurrent.Monitor r15 = r12.f54376a
            if (r15 != r11) goto L7f
            java.util.concurrent.locks.ReentrantLock r15 = r11.f54374b
            boolean r0 = r15.isHeldByCurrentThread()
            boolean r1 = java.lang.Thread.interrupted()
            boolean r2 = r11.f54373a     // Catch: java.lang.Throwable -> L23
            r3 = 0
            r4 = 0
            r6 = 1
            if (r2 != 0) goto L25
            boolean r2 = r15.tryLock()     // Catch: java.lang.Throwable -> L23
            if (r2 != 0) goto L21
            goto L25
        L21:
            r7 = r4
            goto L32
        L23:
            r12 = move-exception
            goto L75
        L25:
            long r7 = m39476g(r13)     // Catch: java.lang.Throwable -> L23
            r9 = r13
        L2a:
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch: java.lang.Throwable -> L23 java.lang.InterruptedException -> L6d
            boolean r2 = r15.tryLock(r9, r2)     // Catch: java.lang.Throwable -> L23 java.lang.InterruptedException -> L6d
            if (r2 == 0) goto L63
        L32:
            boolean r2 = r12.isSatisfied()     // Catch: java.lang.Throwable -> L43 java.lang.InterruptedException -> L60
            if (r2 == 0) goto L39
            goto L4d
        L39:
            int r2 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r2 != 0) goto L45
            long r7 = m39476g(r13)     // Catch: java.lang.Throwable -> L43 java.lang.InterruptedException -> L60
            r9 = r13
            goto L49
        L43:
            r12 = move-exception
            goto L5c
        L45:
            long r9 = m39474i(r7, r13)     // Catch: java.lang.Throwable -> L43 java.lang.InterruptedException -> L60
        L49:
            boolean r6 = r11.m39480c(r12, r9, r0)     // Catch: java.lang.Throwable -> L43 java.lang.InterruptedException -> L60
        L4d:
            if (r6 != 0) goto L52
            r15.unlock()     // Catch: java.lang.Throwable -> L23
        L52:
            if (r1 == 0) goto L5b
            java.lang.Thread r12 = java.lang.Thread.currentThread()
            r12.interrupt()
        L5b:
            return r6
        L5c:
            r15.unlock()     // Catch: java.lang.Throwable -> L23
            throw r12     // Catch: java.lang.Throwable -> L23
        L60:
            r0 = 0
            r1 = 1
            goto L32
        L63:
            if (r1 == 0) goto L6c
            java.lang.Thread r12 = java.lang.Thread.currentThread()
            r12.interrupt()
        L6c:
            return r3
        L6d:
            long r9 = m39474i(r7, r13)     // Catch: java.lang.Throwable -> L73
            r1 = 1
            goto L2a
        L73:
            r12 = move-exception
            r1 = 1
        L75:
            if (r1 == 0) goto L7e
            java.lang.Thread r13 = java.lang.Thread.currentThread()
            r13.interrupt()
        L7e:
            throw r12
        L7f:
            java.lang.IllegalMonitorStateException r12 = new java.lang.IllegalMonitorStateException
            r12.<init>()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.util.concurrent.Monitor.enterWhenUninterruptibly(com.google.common.util.concurrent.Monitor$Guard, long, java.util.concurrent.TimeUnit):boolean");
    }
}