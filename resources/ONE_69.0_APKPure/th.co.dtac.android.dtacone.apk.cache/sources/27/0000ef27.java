package org.apache.commons.p028io;

import java.io.File;
import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import org.apache.http.cookie.ClientCookie;

/* renamed from: org.apache.commons.io.FileCleaningTracker */
/* loaded from: classes6.dex */
public class FileCleaningTracker {

    /* renamed from: a */
    public ReferenceQueue f73316a = new ReferenceQueue();

    /* renamed from: b */
    public final Collection f73317b = Collections.synchronizedSet(new HashSet());

    /* renamed from: c */
    public final List f73318c = Collections.synchronizedList(new ArrayList());

    /* renamed from: d */
    public volatile boolean f73319d;

    /* renamed from: e */
    public Thread f73320e;

    /* renamed from: org.apache.commons.io.FileCleaningTracker$a */
    /* loaded from: classes6.dex */
    public final class C12505a extends Thread {
        public C12505a() {
            super("File Reaper");
            setPriority(10);
            setDaemon(true);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            while (true) {
                if (FileCleaningTracker.this.f73319d && FileCleaningTracker.this.f73317b.isEmpty()) {
                    return;
                }
                try {
                    C12506b c12506b = (C12506b) FileCleaningTracker.this.f73316a.remove();
                    FileCleaningTracker.this.f73317b.remove(c12506b);
                    if (!c12506b.m25615a()) {
                        FileCleaningTracker.this.f73318c.add(c12506b.m25614b());
                    }
                    c12506b.clear();
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    /* renamed from: org.apache.commons.io.FileCleaningTracker$b */
    /* loaded from: classes6.dex */
    public static final class C12506b extends PhantomReference {

        /* renamed from: a */
        public final String f73322a;

        /* renamed from: b */
        public final FileDeleteStrategy f73323b;

        public C12506b(String str, FileDeleteStrategy fileDeleteStrategy, Object obj, ReferenceQueue referenceQueue) {
            super(obj, referenceQueue);
            this.f73322a = str;
            this.f73323b = fileDeleteStrategy == null ? FileDeleteStrategy.NORMAL : fileDeleteStrategy;
        }

        /* renamed from: a */
        public boolean m25615a() {
            return this.f73323b.deleteQuietly(new File(this.f73322a));
        }

        /* renamed from: b */
        public String m25614b() {
            return this.f73322a;
        }
    }

    /* renamed from: a */
    public final synchronized void m25616a(String str, Object obj, FileDeleteStrategy fileDeleteStrategy) {
        try {
            if (!this.f73319d) {
                if (this.f73320e == null) {
                    C12505a c12505a = new C12505a();
                    this.f73320e = c12505a;
                    c12505a.start();
                }
                this.f73317b.add(new C12506b(str, fileDeleteStrategy, obj, this.f73316a));
            } else {
                throw new IllegalStateException("No new trackers can be added once exitWhenFinished() is called");
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void exitWhenFinished() {
        this.f73319d = true;
        Thread thread = this.f73320e;
        if (thread != null) {
            synchronized (thread) {
                this.f73320e.interrupt();
            }
        }
    }

    public List<String> getDeleteFailures() {
        return new ArrayList(this.f73318c);
    }

    public int getTrackCount() {
        return this.f73317b.size();
    }

    public void track(File file, Object obj) {
        track(file, obj, (FileDeleteStrategy) null);
    }

    public void track(File file, Object obj, FileDeleteStrategy fileDeleteStrategy) {
        Objects.requireNonNull(file, "file");
        m25616a(file.getPath(), obj, fileDeleteStrategy);
    }

    public void track(Path path, Object obj) {
        track(path, obj, (FileDeleteStrategy) null);
    }

    public void track(Path path, Object obj, FileDeleteStrategy fileDeleteStrategy) {
        Path absolutePath;
        String path2;
        Objects.requireNonNull(path, "file");
        absolutePath = path.toAbsolutePath();
        path2 = absolutePath.toString();
        m25616a(path2, obj, fileDeleteStrategy);
    }

    public void track(String str, Object obj) {
        track(str, obj, (FileDeleteStrategy) null);
    }

    public void track(String str, Object obj, FileDeleteStrategy fileDeleteStrategy) {
        Objects.requireNonNull(str, ClientCookie.PATH_ATTR);
        m25616a(str, obj, fileDeleteStrategy);
    }
}