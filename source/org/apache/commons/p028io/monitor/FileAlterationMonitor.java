package org.apache.commons.p028io.monitor;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ThreadFactory;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;
import org.apache.commons.p028io.ThreadUtils;
import org.apache.commons.p028io.monitor.FileAlterationMonitor;
import org.apache.commons.p028io.monitor.FileAlterationObserver;

/* renamed from: org.apache.commons.io.monitor.FileAlterationMonitor */
/* loaded from: classes6.dex */
public final class FileAlterationMonitor implements Runnable {

    /* renamed from: f */
    public static final FileAlterationObserver[] f73528f = new FileAlterationObserver[0];

    /* renamed from: a */
    public final long f73529a;

    /* renamed from: b */
    public final List f73530b;

    /* renamed from: c */
    public Thread f73531c;

    /* renamed from: d */
    public ThreadFactory f73532d;

    /* renamed from: e */
    public volatile boolean f73533e;

    public FileAlterationMonitor() {
        this(10000L);
    }

    public void addObserver(FileAlterationObserver fileAlterationObserver) {
        if (fileAlterationObserver != null) {
            this.f73530b.add(fileAlterationObserver);
        }
    }

    public long getInterval() {
        return this.f73529a;
    }

    public Iterable<FileAlterationObserver> getObservers() {
        return new ArrayList(this.f73530b);
    }

    public void removeObserver(final FileAlterationObserver fileAlterationObserver) {
        if (fileAlterationObserver != null) {
            this.f73530b.removeIf(new Predicate() { // from class: kW
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return FileAlterationObserver.this.equals((FileAlterationObserver) obj);
                }
            });
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        Duration ofMillis;
        while (this.f73533e) {
            this.f73530b.forEach(new Consumer() { // from class: mW
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    ((FileAlterationObserver) obj).checkAndNotify();
                }
            });
            if (this.f73533e) {
                try {
                    ofMillis = Duration.ofMillis(this.f73529a);
                    ThreadUtils.sleep(ofMillis);
                } catch (InterruptedException unused) {
                }
            } else {
                return;
            }
        }
    }

    public synchronized void setThreadFactory(ThreadFactory threadFactory) {
        this.f73532d = threadFactory;
    }

    public synchronized void start() throws Exception {
        try {
            if (!this.f73533e) {
                for (FileAlterationObserver fileAlterationObserver : this.f73530b) {
                    fileAlterationObserver.initialize();
                }
                this.f73533e = true;
                ThreadFactory threadFactory = this.f73532d;
                if (threadFactory != null) {
                    this.f73531c = threadFactory.newThread(this);
                } else {
                    this.f73531c = new Thread(this);
                }
                this.f73531c.start();
            } else {
                throw new IllegalStateException("Monitor is already running");
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void stop() throws Exception {
        stop(this.f73529a);
    }

    public FileAlterationMonitor(long j) {
        this.f73530b = new CopyOnWriteArrayList();
        this.f73529a = j;
    }

    public synchronized void stop(long j) throws Exception {
        if (this.f73533e) {
            this.f73533e = false;
            try {
                this.f73531c.interrupt();
                this.f73531c.join(j);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
            for (FileAlterationObserver fileAlterationObserver : this.f73530b) {
                fileAlterationObserver.destroy();
            }
        } else {
            throw new IllegalStateException("Monitor is not running");
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public FileAlterationMonitor(long r2, java.util.Collection<org.apache.commons.p028io.monitor.FileAlterationObserver> r4) {
        /*
            r1 = this;
            java.util.Optional r4 = p000.AbstractC22866wt0.m646a(r4)
            java.util.List r0 = java.util.Collections.emptyList()
            java.lang.Object r4 = p000.AbstractC20248hg1.m30789a(r4, r0)
            java.util.Collection r4 = (java.util.Collection) r4
            org.apache.commons.io.monitor.FileAlterationObserver[] r0 = org.apache.commons.p028io.monitor.FileAlterationMonitor.f73528f
            java.lang.Object[] r4 = r4.toArray(r0)
            org.apache.commons.io.monitor.FileAlterationObserver[] r4 = (org.apache.commons.p028io.monitor.FileAlterationObserver[]) r4
            r1.<init>(r2, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.p028io.monitor.FileAlterationMonitor.<init>(long, java.util.Collection):void");
    }

    public FileAlterationMonitor(long j, FileAlterationObserver... fileAlterationObserverArr) {
        this(j);
        Stream of;
        if (fileAlterationObserverArr != null) {
            of = Stream.of((Object[]) fileAlterationObserverArr);
            of.forEach(new Consumer() { // from class: lW
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    FileAlterationMonitor.this.addObserver((FileAlterationObserver) obj);
                }
            });
        }
    }
}
