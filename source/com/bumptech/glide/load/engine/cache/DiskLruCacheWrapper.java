package com.bumptech.glide.load.engine.cache;

import android.util.Log;
import com.bumptech.glide.disklrucache.DiskLruCache;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.engine.cache.DiskCache;
import java.io.File;
import java.io.IOException;

/* loaded from: classes3.dex */
public class DiskLruCacheWrapper implements DiskCache {

    /* renamed from: f */
    public static DiskLruCacheWrapper f42039f;

    /* renamed from: b */
    public final File f42041b;

    /* renamed from: c */
    public final long f42042c;

    /* renamed from: e */
    public DiskLruCache f42044e;

    /* renamed from: d */
    public final C10373hJ f42043d = new C10373hJ();

    /* renamed from: a */
    public final SafeKeyGenerator f42040a = new SafeKeyGenerator();

    @Deprecated
    public DiskLruCacheWrapper(File file, long j) {
        this.f42041b = file;
        this.f42042c = j;
    }

    public static DiskCache create(File file, long j) {
        return new DiskLruCacheWrapper(file, j);
    }

    @Deprecated
    public static synchronized DiskCache get(File file, long j) {
        DiskLruCacheWrapper diskLruCacheWrapper;
        synchronized (DiskLruCacheWrapper.class) {
            try {
                if (f42039f == null) {
                    f42039f = new DiskLruCacheWrapper(file, j);
                }
                diskLruCacheWrapper = f42039f;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return diskLruCacheWrapper;
    }

    /* renamed from: a */
    public final synchronized DiskLruCache m50363a() {
        try {
            if (this.f42044e == null) {
                this.f42044e = DiskLruCache.open(this.f42041b, 1, 1, this.f42042c);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f42044e;
    }

    /* renamed from: b */
    public final synchronized void m50362b() {
        this.f42044e = null;
    }

    @Override // com.bumptech.glide.load.engine.cache.DiskCache
    public synchronized void clear() {
        try {
            m50363a().delete();
        } catch (IOException e) {
            if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                Log.w("DiskLruCacheWrapper", "Unable to clear disk cache or disk cache cleared externally", e);
            }
        }
        m50362b();
    }

    @Override // com.bumptech.glide.load.engine.cache.DiskCache
    public void delete(Key key) {
        try {
            m50363a().remove(this.f42040a.getSafeKey(key));
        } catch (IOException e) {
            if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                Log.w("DiskLruCacheWrapper", "Unable to delete from disk cache", e);
            }
        }
    }

    @Override // com.bumptech.glide.load.engine.cache.DiskCache
    public void put(Key key, DiskCache.Writer writer) {
        DiskLruCache m50363a;
        String safeKey = this.f42040a.getSafeKey(key);
        this.f42043d.m30898a(safeKey);
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Put: Obtained: ");
                sb.append(safeKey);
                sb.append(" for for Key: ");
                sb.append(key);
            }
            try {
                m50363a = m50363a();
            } catch (IOException e) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to put to disk cache", e);
                }
            }
            if (m50363a.get(safeKey) != null) {
                return;
            }
            DiskLruCache.Editor edit = m50363a.edit(safeKey);
            if (edit != null) {
                try {
                    if (writer.write(edit.getFile(0))) {
                        edit.commit();
                    }
                    edit.abortUnlessCommitted();
                    return;
                } catch (Throwable th2) {
                    edit.abortUnlessCommitted();
                    throw th2;
                }
            }
            throw new IllegalStateException("Had two simultaneous puts for: " + safeKey);
        } finally {
            this.f42043d.m30897b(safeKey);
        }
    }

    @Override // com.bumptech.glide.load.engine.cache.DiskCache
    public File get(Key key) {
        String safeKey = this.f42040a.getSafeKey(key);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Get: Obtained: ");
            sb.append(safeKey);
            sb.append(" for for Key: ");
            sb.append(key);
        }
        try {
            DiskLruCache.Value value = m50363a().get(safeKey);
            if (value != null) {
                return value.getFile(0);
            }
            return null;
        } catch (IOException e) {
            if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", e);
                return null;
            }
            return null;
        }
    }
}
