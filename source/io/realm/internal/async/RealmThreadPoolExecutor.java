package io.realm.internal.async;

import java.io.File;
import java.io.FileFilter;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Pattern;

/* loaded from: classes5.dex */
public class RealmThreadPoolExecutor extends ThreadPoolExecutor {

    /* renamed from: d */
    public static final int f66808d = m29506a();

    /* renamed from: a */
    public boolean f66809a;

    /* renamed from: b */
    public ReentrantLock f66810b;

    /* renamed from: c */
    public Condition f66811c;

    /* renamed from: io.realm.internal.async.RealmThreadPoolExecutor$a */
    /* loaded from: classes5.dex */
    public class C11327a implements FileFilter {

        /* renamed from: a */
        public final /* synthetic */ Pattern f66812a;

        public C11327a(Pattern pattern) {
            this.f66812a = pattern;
        }

        @Override // java.io.FileFilter
        public boolean accept(File file) {
            return this.f66812a.matcher(file.getName()).matches();
        }
    }

    public RealmThreadPoolExecutor(int i, int i2) {
        super(i, i2, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(100));
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f66810b = reentrantLock;
        this.f66811c = reentrantLock.newCondition();
    }

    /* renamed from: a */
    public static int m29506a() {
        int m29505c = m29505c("/sys/devices/system/cpu/", "cpu[0-9]+");
        if (m29505c <= 0) {
            m29505c = Runtime.getRuntime().availableProcessors();
        }
        if (m29505c <= 0) {
            return 1;
        }
        return 1 + (m29505c * 2);
    }

    /* renamed from: c */
    public static int m29505c(String str, String str2) {
        try {
            File[] listFiles = new File(str).listFiles(new C11327a(Pattern.compile(str2)));
            if (listFiles == null) {
                return 0;
            }
            return listFiles.length;
        } catch (SecurityException unused) {
            return 0;
        }
    }

    public static RealmThreadPoolExecutor newDefaultExecutor() {
        int i = f66808d;
        return new RealmThreadPoolExecutor(i, i);
    }

    public static RealmThreadPoolExecutor newSingleThreadExecutor() {
        return new RealmThreadPoolExecutor(1, 1);
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public void beforeExecute(Thread thread, Runnable runnable) {
        super.beforeExecute(thread, runnable);
        this.f66810b.lock();
        while (this.f66809a) {
            try {
                try {
                    this.f66811c.await();
                } catch (InterruptedException unused) {
                    thread.interrupt();
                }
            } finally {
                this.f66810b.unlock();
            }
        }
    }

    public void pause() {
        this.f66810b.lock();
        try {
            this.f66809a = true;
        } finally {
            this.f66810b.unlock();
        }
    }

    public void resume() {
        this.f66810b.lock();
        try {
            this.f66809a = false;
            this.f66811c.signalAll();
        } finally {
            this.f66810b.unlock();
        }
    }

    public Future<?> submitTransaction(Runnable runnable) {
        return super.submit(new BgPriorityRunnable(runnable));
    }
}
