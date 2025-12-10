package com.bumptech.glide.util;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class LruCache<T, Y> {

    /* renamed from: a */
    public final Map f42741a = new LinkedHashMap(100, 0.75f, true);

    /* renamed from: b */
    public final long f42742b;

    /* renamed from: c */
    public long f42743c;

    /* renamed from: d */
    public long f42744d;

    /* renamed from: com.bumptech.glide.util.LruCache$a */
    /* loaded from: classes3.dex */
    public static final class C5926a {

        /* renamed from: a */
        public final Object f42745a;

        /* renamed from: b */
        public final int f42746b;

        public C5926a(Object obj, int i) {
            this.f42745a = obj;
            this.f42746b = i;
        }
    }

    public LruCache(long j) {
        this.f42742b = j;
        this.f42743c = j;
    }

    /* renamed from: a */
    public final void m49982a() {
        trimToSize(this.f42743c);
    }

    public void clearMemory() {
        trimToSize(0L);
    }

    public synchronized boolean contains(@NonNull T t) {
        return this.f42741a.containsKey(t);
    }

    @Nullable
    public synchronized Y get(@NonNull T t) {
        Y y;
        C5926a c5926a = (C5926a) this.f42741a.get(t);
        if (c5926a != null) {
            y = (Y) c5926a.f42745a;
        } else {
            y = null;
        }
        return y;
    }

    public synchronized int getCount() {
        return this.f42741a.size();
    }

    public synchronized long getCurrentSize() {
        return this.f42744d;
    }

    public synchronized long getMaxSize() {
        return this.f42743c;
    }

    public int getSize(@Nullable Y y) {
        return 1;
    }

    public void onItemEvicted(@NonNull T t, @Nullable Y y) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public synchronized Y put(@NonNull T t, @Nullable Y y) {
        C5926a c5926a;
        int size = getSize(y);
        long j = size;
        Y y2 = null;
        if (j >= this.f42743c) {
            onItemEvicted(t, y);
            return null;
        }
        if (y != null) {
            this.f42744d += j;
        }
        Map map = this.f42741a;
        if (y == null) {
            c5926a = null;
        } else {
            c5926a = new C5926a(y, size);
        }
        C5926a c5926a2 = (C5926a) map.put(t, c5926a);
        if (c5926a2 != null) {
            this.f42744d -= c5926a2.f42746b;
            if (!c5926a2.f42745a.equals(y)) {
                onItemEvicted(t, c5926a2.f42745a);
            }
        }
        m49982a();
        if (c5926a2 != null) {
            y2 = (Y) c5926a2.f42745a;
        }
        return y2;
    }

    @Nullable
    public synchronized Y remove(@NonNull T t) {
        C5926a c5926a = (C5926a) this.f42741a.remove(t);
        if (c5926a == null) {
            return null;
        }
        this.f42744d -= c5926a.f42746b;
        return (Y) c5926a.f42745a;
    }

    public synchronized void setSizeMultiplier(float f) {
        if (f >= 0.0f) {
            this.f42743c = Math.round(((float) this.f42742b) * f);
            m49982a();
        } else {
            throw new IllegalArgumentException("Multiplier must be >= 0");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public synchronized void trimToSize(long j) {
        while (this.f42744d > j) {
            Iterator it = this.f42741a.entrySet().iterator();
            Map.Entry entry = (Map.Entry) it.next();
            C5926a c5926a = (C5926a) entry.getValue();
            this.f42744d -= c5926a.f42746b;
            Object key = entry.getKey();
            it.remove();
            onItemEvicted(key, c5926a.f42745a);
        }
    }
}