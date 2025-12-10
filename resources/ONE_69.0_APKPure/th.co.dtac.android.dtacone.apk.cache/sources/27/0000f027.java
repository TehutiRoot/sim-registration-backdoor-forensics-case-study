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
    public static final FileAlterationObserver[] f73612f = new FileAlterationObserver[0];

    /* renamed from: a */
    public final long f73613a;

    /* renamed from: b */
    public final List f73614b;

    /* renamed from: c */
    public Thread f73615c;

    /* renamed from: d */
    public ThreadFactory f73616d;

    /* renamed from: e */
    public volatile boolean f73617e;

    public FileAlterationMonitor() {
        this(10000L);
    }

    public void addObserver(FileAlterationObserver fileAlterationObserver) {
        if (fileAlterationObserver != null) {
            this.f73614b.add(fileAlterationObserver);
        }
    }

    public long getInterval() {
        return this.f73613a;
    }

    public Iterable<FileAlterationObserver> getObservers() {
        return new ArrayList(this.f73614b);
    }

    public void removeObserver(final FileAlterationObserver fileAlterationObserver) {
        if (fileAlterationObserver != null) {
            this.f73614b.removeIf(new Predicate() { // from class: oW
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
        while (this.f73617e) {
            this.f73614b.forEach(new Consumer() { // from class: qW
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    ((FileAlterationObserver) obj).checkAndNotify();
                }
            });
            if (this.f73617e) {
                try {
                    ofMillis = Duration.ofMillis(this.f73613a);
                    ThreadUtils.sleep(ofMillis);
                } catch (InterruptedException unused) {
                }
            } else {
                return;
            }
        }
    }

    public synchronized void setThreadFactory(ThreadFactory threadFactory) {
        this.f73616d = threadFactory;
    }

    public synchronized void start() throws Exception {
        try {
            if (!this.f73617e) {
                for (FileAlterationObserver fileAlterationObserver : this.f73614b) {
                    fileAlterationObserver.initialize();
                }
                this.f73617e = true;
                ThreadFactory threadFactory = this.f73616d;
                if (threadFactory != null) {
                    this.f73615c = threadFactory.newThread(this);
                } else {
                    this.f73615c = new Thread(this);
                }
                this.f73615c.start();
            } else {
                throw new IllegalStateException("Monitor is already running");
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void stop() throws Exception {
        stop(this.f73613a);
    }

    public FileAlterationMonitor(long j) {
        this.f73614b = new CopyOnWriteArrayList();
        this.f73613a = j;
    }

    public synchronized void stop(long j) throws Exception {
        if (this.f73617e) {
            this.f73617e = false;
            try {
                this.f73615c.interrupt();
                this.f73615c.join(j);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
            for (FileAlterationObserver fileAlterationObserver : this.f73614b) {
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
            java.util.Optional r4 = p000.AbstractC17465Ct0.m68906a(r4)
            java.util.List r0 = java.util.Collections.emptyList()
            java.lang.Object r4 = p000.AbstractC19786eh1.m31654a(r4, r0)
            java.util.Collection r4 = (java.util.Collection) r4
            org.apache.commons.io.monitor.FileAlterationObserver[] r0 = org.apache.commons.p028io.monitor.FileAlterationMonitor.f73612f
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
            of.forEach(new Consumer() { // from class: pW
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    FileAlterationMonitor.this.addObserver((FileAlterationObserver) obj);
                }
            });
        }
    }
}