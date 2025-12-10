package androidx.collection;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes.dex */
public class LruCache<K, V> {

    /* renamed from: a */
    public final LinkedHashMap f12296a;

    /* renamed from: b */
    public int f12297b;

    /* renamed from: c */
    public int f12298c;

    /* renamed from: d */
    public int f12299d;

    /* renamed from: e */
    public int f12300e;

    /* renamed from: f */
    public int f12301f;

    /* renamed from: g */
    public int f12302g;

    /* renamed from: h */
    public int f12303h;

    public LruCache(int i) {
        if (i > 0) {
            this.f12298c = i;
            this.f12296a = new LinkedHashMap(0, 0.75f, true);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public final int m61767a(Object obj, Object obj2) {
        int sizeOf = sizeOf(obj, obj2);
        if (sizeOf >= 0) {
            return sizeOf;
        }
        throw new IllegalStateException("Negative size: " + obj + "=" + obj2);
    }

    @Nullable
    public V create(@NonNull K k) {
        return null;
    }

    public final synchronized int createCount() {
        return this.f12300e;
    }

    public void entryRemoved(boolean z, @NonNull K k, @NonNull V v, @Nullable V v2) {
    }

    public final void evictAll() {
        trimToSize(-1);
    }

    public final synchronized int evictionCount() {
        return this.f12301f;
    }

    @Nullable
    public final V get(@NonNull K k) {
        V v;
        if (k != null) {
            synchronized (this) {
                try {
                    V v2 = (V) this.f12296a.get(k);
                    if (v2 != null) {
                        this.f12302g++;
                        return v2;
                    }
                    this.f12303h++;
                    V create = create(k);
                    if (create == null) {
                        return null;
                    }
                    synchronized (this) {
                        try {
                            this.f12300e++;
                            v = (V) this.f12296a.put(k, create);
                            if (v != null) {
                                this.f12296a.put(k, v);
                            } else {
                                this.f12297b += m61767a(k, create);
                            }
                        } finally {
                        }
                    }
                    if (v != null) {
                        entryRemoved(false, k, create, v);
                        return v;
                    }
                    trimToSize(this.f12298c);
                    return create;
                } finally {
                }
            }
        }
        throw new NullPointerException("key == null");
    }

    public final synchronized int hitCount() {
        return this.f12302g;
    }

    public final synchronized int maxSize() {
        return this.f12298c;
    }

    public final synchronized int missCount() {
        return this.f12303h;
    }

    @Nullable
    public final V put(@NonNull K k, @NonNull V v) {
        V v2;
        if (k != null && v != null) {
            synchronized (this) {
                try {
                    this.f12299d++;
                    this.f12297b += m61767a(k, v);
                    v2 = (V) this.f12296a.put(k, v);
                    if (v2 != null) {
                        this.f12297b -= m61767a(k, v2);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (v2 != null) {
                entryRemoved(false, k, v2, v);
            }
            trimToSize(this.f12298c);
            return v2;
        }
        throw new NullPointerException("key == null || value == null");
    }

    public final synchronized int putCount() {
        return this.f12299d;
    }

    @Nullable
    public final V remove(@NonNull K k) {
        V v;
        if (k != null) {
            synchronized (this) {
                try {
                    v = (V) this.f12296a.remove(k);
                    if (v != null) {
                        this.f12297b -= m61767a(k, v);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (v != null) {
                entryRemoved(false, k, v, null);
            }
            return v;
        }
        throw new NullPointerException("key == null");
    }

    public void resize(int i) {
        if (i > 0) {
            synchronized (this) {
                this.f12298c = i;
            }
            trimToSize(i);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    public final synchronized int size() {
        return this.f12297b;
    }

    public int sizeOf(@NonNull K k, @NonNull V v) {
        return 1;
    }

    public final synchronized Map<K, V> snapshot() {
        return new LinkedHashMap(this.f12296a);
    }

    public final synchronized String toString() {
        int i;
        try {
            int i2 = this.f12302g;
            int i3 = this.f12303h + i2;
            if (i3 != 0) {
                i = (i2 * 100) / i3;
            } else {
                i = 0;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.f12298c), Integer.valueOf(this.f12302g), Integer.valueOf(this.f12303h), Integer.valueOf(i));
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0073, code lost:
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void trimToSize(int r5) {
        /*
            r4 = this;
        L0:
            monitor-enter(r4)
            int r0 = r4.f12297b     // Catch: java.lang.Throwable -> L12
            if (r0 < 0) goto L55
            java.util.LinkedHashMap r0 = r4.f12296a     // Catch: java.lang.Throwable -> L12
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L14
            int r0 = r4.f12297b     // Catch: java.lang.Throwable -> L12
            if (r0 != 0) goto L55
            goto L14
        L12:
            r5 = move-exception
            goto L74
        L14:
            int r0 = r4.f12297b     // Catch: java.lang.Throwable -> L12
            if (r0 <= r5) goto L53
            java.util.LinkedHashMap r0 = r4.f12296a     // Catch: java.lang.Throwable -> L12
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L21
            goto L53
        L21:
            java.util.LinkedHashMap r0 = r4.f12296a     // Catch: java.lang.Throwable -> L12
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L12
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L12
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> L12
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L12
            java.lang.Object r1 = r0.getKey()     // Catch: java.lang.Throwable -> L12
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L12
            java.util.LinkedHashMap r2 = r4.f12296a     // Catch: java.lang.Throwable -> L12
            r2.remove(r1)     // Catch: java.lang.Throwable -> L12
            int r2 = r4.f12297b     // Catch: java.lang.Throwable -> L12
            int r3 = r4.m61767a(r1, r0)     // Catch: java.lang.Throwable -> L12
            int r2 = r2 - r3
            r4.f12297b = r2     // Catch: java.lang.Throwable -> L12
            int r2 = r4.f12301f     // Catch: java.lang.Throwable -> L12
            r3 = 1
            int r2 = r2 + r3
            r4.f12301f = r2     // Catch: java.lang.Throwable -> L12
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L12
            r2 = 0
            r4.entryRemoved(r3, r1, r0, r2)
            goto L0
        L53:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L12
            return
        L55:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L12
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L12
            r0.<init>()     // Catch: java.lang.Throwable -> L12
            java.lang.Class r1 = r4.getClass()     // Catch: java.lang.Throwable -> L12
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L12
            r0.append(r1)     // Catch: java.lang.Throwable -> L12
            java.lang.String r1 = ".sizeOf() is reporting inconsistent results!"
            r0.append(r1)     // Catch: java.lang.Throwable -> L12
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L12
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L12
            throw r5     // Catch: java.lang.Throwable -> L12
        L74:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L12
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.LruCache.trimToSize(int):void");
    }
}
