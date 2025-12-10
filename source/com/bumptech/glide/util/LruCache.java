package com.bumptech.glide.util;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class LruCache<T, Y> {

    /* renamed from: a */
    public final Map f42729a = new LinkedHashMap(100, 0.75f, true);

    /* renamed from: b */
    public final long f42730b;

    /* renamed from: c */
    public long f42731c;

    /* renamed from: d */
    public long f42732d;

    /* renamed from: com.bumptech.glide.util.LruCache$a */
    /* loaded from: classes3.dex */
    public static final class C5937a {

        /* renamed from: a */
        public final Object f42733a;

        /* renamed from: b */
        public final int f42734b;

        public C5937a(Object obj, int i) {
            this.f42733a = obj;
            this.f42734b = i;
        }
    }

    public LruCache(long j) {
        this.f42730b = j;
        this.f42731c = j;
    }

    /* renamed from: a */
    public final void m49985a() {
        trimToSize(this.f42731c);
    }

    public void clearMemory() {
        trimToSize(0L);
    }

    public synchronized boolean contains(@NonNull T t) {
        return this.f42729a.containsKey(t);
    }

    @Nullable
    public synchronized Y get(@NonNull T t) {
        Y y;
        C5937a c5937a = (C5937a) this.f42729a.get(t);
        if (c5937a != null) {
            y = (Y) c5937a.f42733a;
        } else {
            y = null;
        }
        return y;
    }

    public synchronized int getCount() {
        return this.f42729a.size();
    }

    public synchronized long getCurrentSize() {
        return this.f42732d;
    }

    public synchronized long getMaxSize() {
        return this.f42731c;
    }

    public int getSize(@Nullable Y y) {
        return 1;
    }

    public void onItemEvicted(@NonNull T t, @Nullable Y y) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public synchronized Y put(@NonNull T t, @Nullable Y y) {
        C5937a c5937a;
        int size = getSize(y);
        long j = size;
        Y y2 = null;
        if (j >= this.f42731c) {
            onItemEvicted(t, y);
            return null;
        }
        if (y != null) {
            this.f42732d += j;
        }
        Map map = this.f42729a;
        if (y == null) {
            c5937a = null;
        } else {
            c5937a = new C5937a(y, size);
        }
        C5937a c5937a2 = (C5937a) map.put(t, c5937a);
        if (c5937a2 != null) {
            this.f42732d -= c5937a2.f42734b;
            if (!c5937a2.f42733a.equals(y)) {
                onItemEvicted(t, c5937a2.f42733a);
            }
        }
        m49985a();
        if (c5937a2 != null) {
            y2 = (Y) c5937a2.f42733a;
        }
        return y2;
    }

    @Nullable
    public synchronized Y remove(@NonNull T t) {
        C5937a c5937a = (C5937a) this.f42729a.remove(t);
        if (c5937a == null) {
            return null;
        }
        this.f42732d -= c5937a.f42734b;
        return (Y) c5937a.f42733a;
    }

    public synchronized void setSizeMultiplier(float f) {
        if (f >= 0.0f) {
            this.f42731c = Math.round(((float) this.f42730b) * f);
            m49985a();
        } else {
            throw new IllegalArgumentException("Multiplier must be >= 0");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public synchronized void trimToSize(long j) {
        while (this.f42732d > j) {
            Iterator it = this.f42729a.entrySet().iterator();
            Map.Entry entry = (Map.Entry) it.next();
            C5937a c5937a = (C5937a) entry.getValue();
            this.f42732d -= c5937a.f42734b;
            Object key = entry.getKey();
            it.remove();
            onItemEvicted(key, c5937a.f42733a);
        }
    }
}
