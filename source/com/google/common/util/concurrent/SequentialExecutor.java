package com.google.common.util.concurrent;

import com.google.common.base.Preconditions;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;

/* loaded from: classes4.dex */
public final class SequentialExecutor implements Executor {

    /* renamed from: f */
    public static final C23005xi0 f54385f = new C23005xi0(SequentialExecutor.class);

    /* renamed from: a */
    public final Executor f54386a;

    /* renamed from: b */
    public final Deque f54387b = new ArrayDeque();

    /* renamed from: c */
    public WorkerRunningState f54388c = WorkerRunningState.IDLE;

    /* renamed from: d */
    public long f54389d = 0;

    /* renamed from: e */
    public final RunnableC8270b f54390e = new RunnableC8270b(this, null);

    /* loaded from: classes4.dex */
    public enum WorkerRunningState {
        IDLE,
        QUEUING,
        QUEUED,
        RUNNING
    }

    /* renamed from: com.google.common.util.concurrent.SequentialExecutor$a */
    /* loaded from: classes4.dex */
    public class RunnableC8269a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Runnable f54391a;

        /* renamed from: b */
        public final /* synthetic */ SequentialExecutor f54392b;

        public RunnableC8269a(SequentialExecutor sequentialExecutor, Runnable runnable) {
            this.f54391a = runnable;
            this.f54392b = sequentialExecutor;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f54391a.run();
        }

        public String toString() {
            return this.f54391a.toString();
        }
    }

    /* renamed from: com.google.common.util.concurrent.SequentialExecutor$b */
    /* loaded from: classes4.dex */
    public final class RunnableC8270b implements Runnable {

        /* renamed from: a */
        public Runnable f54393a;

        public RunnableC8270b() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0045, code lost:
            if (r1 == false) goto L35;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0047, code lost:
            java.lang.Thread.currentThread().interrupt();
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x004e, code lost:
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0054, code lost:
            r1 = r1 | java.lang.Thread.interrupted();
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0056, code lost:
            r8.f54393a.run();
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0062, code lost:
            r3 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x0063, code lost:
            r4 = com.google.common.util.concurrent.SequentialExecutor.f54385f.m405a();
            r5 = java.util.logging.Level.SEVERE;
            r4.log(r5, "Exception while executing runnable " + r8.f54393a, (java.lang.Throwable) r3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:?, code lost:
            return;
         */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void m39447a() {
            /*
                r8 = this;
                r0 = 0
                r1 = 0
            L2:
                com.google.common.util.concurrent.SequentialExecutor r2 = com.google.common.util.concurrent.SequentialExecutor.this     // Catch: java.lang.Throwable -> L5e
                java.util.Deque r2 = com.google.common.util.concurrent.SequentialExecutor.m39452a(r2)     // Catch: java.lang.Throwable -> L5e
                monitor-enter(r2)     // Catch: java.lang.Throwable -> L5e
                if (r0 != 0) goto L2d
                com.google.common.util.concurrent.SequentialExecutor r0 = com.google.common.util.concurrent.SequentialExecutor.this     // Catch: java.lang.Throwable -> L20
                com.google.common.util.concurrent.SequentialExecutor$WorkerRunningState r0 = com.google.common.util.concurrent.SequentialExecutor.m39451c(r0)     // Catch: java.lang.Throwable -> L20
                com.google.common.util.concurrent.SequentialExecutor$WorkerRunningState r3 = com.google.common.util.concurrent.SequentialExecutor.WorkerRunningState.RUNNING     // Catch: java.lang.Throwable -> L20
                if (r0 != r3) goto L22
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
                if (r1 == 0) goto L1f
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.interrupt()
            L1f:
                return
            L20:
                r0 = move-exception
                goto L87
            L22:
                com.google.common.util.concurrent.SequentialExecutor r0 = com.google.common.util.concurrent.SequentialExecutor.this     // Catch: java.lang.Throwable -> L20
                com.google.common.util.concurrent.SequentialExecutor.m39449e(r0)     // Catch: java.lang.Throwable -> L20
                com.google.common.util.concurrent.SequentialExecutor r0 = com.google.common.util.concurrent.SequentialExecutor.this     // Catch: java.lang.Throwable -> L20
                com.google.common.util.concurrent.SequentialExecutor.m39450d(r0, r3)     // Catch: java.lang.Throwable -> L20
                r0 = 1
            L2d:
                com.google.common.util.concurrent.SequentialExecutor r3 = com.google.common.util.concurrent.SequentialExecutor.this     // Catch: java.lang.Throwable -> L20
                java.util.Deque r3 = com.google.common.util.concurrent.SequentialExecutor.m39452a(r3)     // Catch: java.lang.Throwable -> L20
                java.lang.Object r3 = r3.poll()     // Catch: java.lang.Throwable -> L20
                java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch: java.lang.Throwable -> L20
                r8.f54393a = r3     // Catch: java.lang.Throwable -> L20
                if (r3 != 0) goto L4f
                com.google.common.util.concurrent.SequentialExecutor r0 = com.google.common.util.concurrent.SequentialExecutor.this     // Catch: java.lang.Throwable -> L20
                com.google.common.util.concurrent.SequentialExecutor$WorkerRunningState r3 = com.google.common.util.concurrent.SequentialExecutor.WorkerRunningState.IDLE     // Catch: java.lang.Throwable -> L20
                com.google.common.util.concurrent.SequentialExecutor.m39450d(r0, r3)     // Catch: java.lang.Throwable -> L20
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
                if (r1 == 0) goto L4e
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.interrupt()
            L4e:
                return
            L4f:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
                boolean r2 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L5e
                r1 = r1 | r2
                r2 = 0
                java.lang.Runnable r3 = r8.f54393a     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L62
                r3.run()     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L62
            L5b:
                r8.f54393a = r2     // Catch: java.lang.Throwable -> L5e
                goto L2
            L5e:
                r0 = move-exception
                goto L89
            L60:
                r0 = move-exception
                goto L84
            L62:
                r3 = move-exception
                xi0 r4 = com.google.common.util.concurrent.SequentialExecutor.m39448f()     // Catch: java.lang.Throwable -> L60
                java.util.logging.Logger r4 = r4.m405a()     // Catch: java.lang.Throwable -> L60
                java.util.logging.Level r5 = java.util.logging.Level.SEVERE     // Catch: java.lang.Throwable -> L60
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L60
                r6.<init>()     // Catch: java.lang.Throwable -> L60
                java.lang.String r7 = "Exception while executing runnable "
                r6.append(r7)     // Catch: java.lang.Throwable -> L60
                java.lang.Runnable r7 = r8.f54393a     // Catch: java.lang.Throwable -> L60
                r6.append(r7)     // Catch: java.lang.Throwable -> L60
                java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L60
                r4.log(r5, r6, r3)     // Catch: java.lang.Throwable -> L60
                goto L5b
            L84:
                r8.f54393a = r2     // Catch: java.lang.Throwable -> L5e
                throw r0     // Catch: java.lang.Throwable -> L5e
            L87:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
                throw r0     // Catch: java.lang.Throwable -> L5e
            L89:
                if (r1 == 0) goto L92
                java.lang.Thread r1 = java.lang.Thread.currentThread()
                r1.interrupt()
            L92:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.util.concurrent.SequentialExecutor.RunnableC8270b.m39447a():void");
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                m39447a();
            } catch (Error e) {
                synchronized (SequentialExecutor.this.f54387b) {
                    SequentialExecutor.this.f54388c = WorkerRunningState.IDLE;
                    throw e;
                }
            }
        }

        public String toString() {
            Runnable runnable = this.f54393a;
            if (runnable != null) {
                return "SequentialExecutorWorker{running=" + runnable + "}";
            }
            return "SequentialExecutorWorker{state=" + SequentialExecutor.this.f54388c + "}";
        }

        public /* synthetic */ RunnableC8270b(SequentialExecutor sequentialExecutor, RunnableC8269a runnableC8269a) {
            this();
        }
    }

    public SequentialExecutor(Executor executor) {
        this.f54386a = (Executor) Preconditions.checkNotNull(executor);
    }

    /* renamed from: e */
    public static /* synthetic */ long m39449e(SequentialExecutor sequentialExecutor) {
        long j = sequentialExecutor.f54389d;
        sequentialExecutor.f54389d = 1 + j;
        return j;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0064 A[ADDED_TO_REGION] */
    @Override // java.util.concurrent.Executor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void execute(java.lang.Runnable r8) {
        /*
            r7 = this;
            com.google.common.base.Preconditions.checkNotNull(r8)
            java.util.Deque r0 = r7.f54387b
            monitor-enter(r0)
            com.google.common.util.concurrent.SequentialExecutor$WorkerRunningState r1 = r7.f54388c     // Catch: java.lang.Throwable -> L6b
            com.google.common.util.concurrent.SequentialExecutor$WorkerRunningState r2 = com.google.common.util.concurrent.SequentialExecutor.WorkerRunningState.RUNNING     // Catch: java.lang.Throwable -> L6b
            if (r1 == r2) goto L6d
            com.google.common.util.concurrent.SequentialExecutor$WorkerRunningState r2 = com.google.common.util.concurrent.SequentialExecutor.WorkerRunningState.QUEUED     // Catch: java.lang.Throwable -> L6b
            if (r1 != r2) goto L11
            goto L6d
        L11:
            long r3 = r7.f54389d     // Catch: java.lang.Throwable -> L6b
            com.google.common.util.concurrent.SequentialExecutor$a r1 = new com.google.common.util.concurrent.SequentialExecutor$a     // Catch: java.lang.Throwable -> L6b
            r1.<init>(r7, r8)     // Catch: java.lang.Throwable -> L6b
            java.util.Deque r8 = r7.f54387b     // Catch: java.lang.Throwable -> L6b
            r8.add(r1)     // Catch: java.lang.Throwable -> L6b
            com.google.common.util.concurrent.SequentialExecutor$WorkerRunningState r8 = com.google.common.util.concurrent.SequentialExecutor.WorkerRunningState.QUEUING     // Catch: java.lang.Throwable -> L6b
            r7.f54388c = r8     // Catch: java.lang.Throwable -> L6b
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6b
            java.util.concurrent.Executor r0 = r7.f54386a     // Catch: java.lang.Throwable -> L44
            com.google.common.util.concurrent.SequentialExecutor$b r5 = r7.f54390e     // Catch: java.lang.Throwable -> L44
            r0.execute(r5)     // Catch: java.lang.Throwable -> L44
            com.google.common.util.concurrent.SequentialExecutor$WorkerRunningState r0 = r7.f54388c
            if (r0 == r8) goto L2e
            return
        L2e:
            java.util.Deque r0 = r7.f54387b
            monitor-enter(r0)
            long r5 = r7.f54389d     // Catch: java.lang.Throwable -> L3e
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 != 0) goto L40
            com.google.common.util.concurrent.SequentialExecutor$WorkerRunningState r1 = r7.f54388c     // Catch: java.lang.Throwable -> L3e
            if (r1 != r8) goto L40
            r7.f54388c = r2     // Catch: java.lang.Throwable -> L3e
            goto L40
        L3e:
            r8 = move-exception
            goto L42
        L40:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3e
            return
        L42:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3e
            throw r8
        L44:
            r8 = move-exception
            java.util.Deque r2 = r7.f54387b
            monitor-enter(r2)
            com.google.common.util.concurrent.SequentialExecutor$WorkerRunningState r0 = r7.f54388c     // Catch: java.lang.Throwable -> L53
            com.google.common.util.concurrent.SequentialExecutor$WorkerRunningState r3 = com.google.common.util.concurrent.SequentialExecutor.WorkerRunningState.IDLE     // Catch: java.lang.Throwable -> L53
            if (r0 == r3) goto L55
            com.google.common.util.concurrent.SequentialExecutor$WorkerRunningState r3 = com.google.common.util.concurrent.SequentialExecutor.WorkerRunningState.QUEUING     // Catch: java.lang.Throwable -> L53
            if (r0 != r3) goto L5f
            goto L55
        L53:
            r8 = move-exception
            goto L69
        L55:
            java.util.Deque r0 = r7.f54387b     // Catch: java.lang.Throwable -> L53
            boolean r0 = r0.removeLastOccurrence(r1)     // Catch: java.lang.Throwable -> L53
            if (r0 == 0) goto L5f
            r0 = 1
            goto L60
        L5f:
            r0 = 0
        L60:
            boolean r1 = r8 instanceof java.util.concurrent.RejectedExecutionException     // Catch: java.lang.Throwable -> L53
            if (r1 == 0) goto L68
            if (r0 != 0) goto L68
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L53
            return
        L68:
            throw r8     // Catch: java.lang.Throwable -> L53
        L69:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L53
            throw r8
        L6b:
            r8 = move-exception
            goto L74
        L6d:
            java.util.Deque r1 = r7.f54387b     // Catch: java.lang.Throwable -> L6b
            r1.add(r8)     // Catch: java.lang.Throwable -> L6b
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6b
            return
        L74:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6b
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.util.concurrent.SequentialExecutor.execute(java.lang.Runnable):void");
    }

    public String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.f54386a + "}";
    }
}
