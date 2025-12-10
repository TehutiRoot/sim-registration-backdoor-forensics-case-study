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
    public static final int f66871d = m29846a();

    /* renamed from: a */
    public boolean f66872a;

    /* renamed from: b */
    public ReentrantLock f66873b;

    /* renamed from: c */
    public Condition f66874c;

    /* renamed from: io.realm.internal.async.RealmThreadPoolExecutor$a */
    /* loaded from: classes5.dex */
    public class C11314a implements FileFilter {

        /* renamed from: a */
        public final /* synthetic */ Pattern f66875a;

        public C11314a(Pattern pattern) {
            this.f66875a = pattern;
        }

        @Override // java.io.FileFilter
        public boolean accept(File file) {
            return this.f66875a.matcher(file.getName()).matches();
        }
    }

    public RealmThreadPoolExecutor(int i, int i2) {
        super(i, i2, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(100));
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f66873b = reentrantLock;
        this.f66874c = reentrantLock.newCondition();
    }

    /* renamed from: a */
    public static int m29846a() {
        int m29845c = m29845c("/sys/devices/system/cpu/", "cpu[0-9]+");
        if (m29845c <= 0) {
            m29845c = Runtime.getRuntime().availableProcessors();
        }
        if (m29845c <= 0) {
            return 1;
        }
        return 1 + (m29845c * 2);
    }

    /* renamed from: c */
    public static int m29845c(String str, String str2) {
        try {
            File[] listFiles = new File(str).listFiles(new C11314a(Pattern.compile(str2)));
            if (listFiles == null) {
                return 0;
            }
            return listFiles.length;
        } catch (SecurityException unused) {
            return 0;
        }
    }

    public static RealmThreadPoolExecutor newDefaultExecutor() {
        int i = f66871d;
        return new RealmThreadPoolExecutor(i, i);
    }

    public static RealmThreadPoolExecutor newSingleThreadExecutor() {
        return new RealmThreadPoolExecutor(1, 1);
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public void beforeExecute(Thread thread, Runnable runnable) {
        super.beforeExecute(thread, runnable);
        this.f66873b.lock();
        while (this.f66872a) {
            try {
                try {
                    this.f66874c.await();
                } catch (InterruptedException unused) {
                    thread.interrupt();
                }
            } finally {
                this.f66873b.unlock();
            }
        }
    }

    public void pause() {
        this.f66873b.lock();
        try {
            this.f66872a = true;
        } finally {
            this.f66873b.unlock();
        }
    }

    public void resume() {
        this.f66873b.lock();
        try {
            this.f66872a = false;
            this.f66874c.signalAll();
        } finally {
            this.f66873b.unlock();
        }
    }

    public Future<?> submitTransaction(Runnable runnable) {
        return super.submit(new BgPriorityRunnable(runnable));
    }
}