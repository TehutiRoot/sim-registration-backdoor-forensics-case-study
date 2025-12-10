package com.google.common.util.concurrent;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.common.base.Preconditions;
import com.google.common.collect.Queues;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.common.util.concurrent.g */
/* loaded from: classes4.dex */
public final class C8312g {

    /* renamed from: b */
    public static final C23005xi0 f54477b = new C23005xi0(C8312g.class);

    /* renamed from: a */
    public final List f54478a = Collections.synchronizedList(new ArrayList());

    /* renamed from: com.google.common.util.concurrent.g$a */
    /* loaded from: classes4.dex */
    public interface InterfaceC8313a {
        void call(Object obj);
    }

    /* renamed from: com.google.common.util.concurrent.g$b */
    /* loaded from: classes4.dex */
    public static final class RunnableC8314b implements Runnable {

        /* renamed from: a */
        public final Object f54479a;

        /* renamed from: b */
        public final Executor f54480b;

        /* renamed from: c */
        public final Queue f54481c = Queues.newArrayDeque();

        /* renamed from: d */
        public final Queue f54482d = Queues.newArrayDeque();

        /* renamed from: e */
        public boolean f54483e;

        public RunnableC8314b(Object obj, Executor executor) {
            this.f54479a = Preconditions.checkNotNull(obj);
            this.f54480b = (Executor) Preconditions.checkNotNull(executor);
        }

        /* renamed from: a */
        public synchronized void m39353a(InterfaceC8313a interfaceC8313a, Object obj) {
            this.f54481c.add(interfaceC8313a);
            this.f54482d.add(obj);
        }

        /* renamed from: b */
        public void m39352b() {
            boolean z;
            synchronized (this) {
                try {
                    if (!this.f54483e) {
                        z = true;
                        this.f54483e = true;
                    } else {
                        z = false;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (z) {
                try {
                    this.f54480b.execute(this);
                } catch (Exception e) {
                    synchronized (this) {
                        this.f54483e = false;
                        Logger m405a = C8312g.f54477b.m405a();
                        Level level = Level.SEVERE;
                        m405a.log(level, "Exception while running callbacks for " + this.f54479a + " on " + this.f54480b, (Throwable) e);
                        throw e;
                    }
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0024, code lost:
            r2.call(r9.f54479a);
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x002c, code lost:
            r2 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x002d, code lost:
            r4 = com.google.common.util.concurrent.C8312g.f54477b.m405a();
            r5 = java.util.logging.Level.SEVERE;
            r4.log(r5, "Exception while executing callback: " + r9.f54479a + org.apache.commons.cli.HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR + r3, (java.lang.Throwable) r2);
         */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0061  */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void run() {
            /*
                r9 = this;
            L0:
                r0 = 0
                r1 = 1
                monitor-enter(r9)     // Catch: java.lang.Throwable -> L2a
                boolean r2 = r9.f54483e     // Catch: java.lang.Throwable -> L1f
                com.google.common.base.Preconditions.checkState(r2)     // Catch: java.lang.Throwable -> L1f
                java.util.Queue r2 = r9.f54481c     // Catch: java.lang.Throwable -> L1f
                java.lang.Object r2 = r2.poll()     // Catch: java.lang.Throwable -> L1f
                com.google.common.util.concurrent.g$a r2 = (com.google.common.util.concurrent.C8312g.InterfaceC8313a) r2     // Catch: java.lang.Throwable -> L1f
                java.util.Queue r3 = r9.f54482d     // Catch: java.lang.Throwable -> L1f
                java.lang.Object r3 = r3.poll()     // Catch: java.lang.Throwable -> L1f
                if (r2 != 0) goto L23
                r9.f54483e = r0     // Catch: java.lang.Throwable -> L1f
                monitor-exit(r9)     // Catch: java.lang.Throwable -> L1c
                return
            L1c:
                r1 = move-exception
                r2 = 0
                goto L56
            L1f:
                r2 = move-exception
                r1 = r2
                r2 = 1
                goto L56
            L23:
                monitor-exit(r9)     // Catch: java.lang.Throwable -> L1f
                java.lang.Object r4 = r9.f54479a     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L2c
                r2.call(r4)     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L2c
                goto L0
            L2a:
                r2 = move-exception
                goto L5f
            L2c:
                r2 = move-exception
                xi0 r4 = com.google.common.util.concurrent.C8312g.m39358a()     // Catch: java.lang.Throwable -> L2a
                java.util.logging.Logger r4 = r4.m405a()     // Catch: java.lang.Throwable -> L2a
                java.util.logging.Level r5 = java.util.logging.Level.SEVERE     // Catch: java.lang.Throwable -> L2a
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2a
                r6.<init>()     // Catch: java.lang.Throwable -> L2a
                java.lang.String r7 = "Exception while executing callback: "
                r6.append(r7)     // Catch: java.lang.Throwable -> L2a
                java.lang.Object r7 = r9.f54479a     // Catch: java.lang.Throwable -> L2a
                r6.append(r7)     // Catch: java.lang.Throwable -> L2a
                java.lang.String r7 = " "
                r6.append(r7)     // Catch: java.lang.Throwable -> L2a
                r6.append(r3)     // Catch: java.lang.Throwable -> L2a
                java.lang.String r3 = r6.toString()     // Catch: java.lang.Throwable -> L2a
                r4.log(r5, r3, r2)     // Catch: java.lang.Throwable -> L2a
                goto L0
            L56:
                monitor-exit(r9)     // Catch: java.lang.Throwable -> L5d
                throw r1     // Catch: java.lang.Throwable -> L58
            L58:
                r1 = move-exception
                r8 = r2
                r2 = r1
                r1 = r8
                goto L5f
            L5d:
                r1 = move-exception
                goto L56
            L5f:
                if (r1 == 0) goto L69
                monitor-enter(r9)
                r9.f54483e = r0     // Catch: java.lang.Throwable -> L66
                monitor-exit(r9)     // Catch: java.lang.Throwable -> L66
                goto L69
            L66:
                r0 = move-exception
                monitor-exit(r9)     // Catch: java.lang.Throwable -> L66
                throw r0
            L69:
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.util.concurrent.C8312g.RunnableC8314b.run():void");
        }
    }

    /* renamed from: b */
    public void m39357b(Object obj, Executor executor) {
        Preconditions.checkNotNull(obj, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        Preconditions.checkNotNull(executor, "executor");
        this.f54478a.add(new RunnableC8314b(obj, executor));
    }

    /* renamed from: c */
    public void m39356c() {
        for (int i = 0; i < this.f54478a.size(); i++) {
            ((RunnableC8314b) this.f54478a.get(i)).m39352b();
        }
    }

    /* renamed from: d */
    public void m39355d(InterfaceC8313a interfaceC8313a) {
        m39354e(interfaceC8313a, interfaceC8313a);
    }

    /* renamed from: e */
    public final void m39354e(InterfaceC8313a interfaceC8313a, Object obj) {
        Preconditions.checkNotNull(interfaceC8313a, "event");
        Preconditions.checkNotNull(obj, "label");
        synchronized (this.f54478a) {
            try {
                for (RunnableC8314b runnableC8314b : this.f54478a) {
                    runnableC8314b.m39353a(interfaceC8313a, obj);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
