package com.bumptech.glide.load.model;

import androidx.annotation.Nullable;
import com.bumptech.glide.util.LruCache;
import com.bumptech.glide.util.Util;
import java.util.Queue;

/* loaded from: classes3.dex */
public class ModelCache<A, B> {

    /* renamed from: a */
    public final LruCache f42226a;

    /* renamed from: com.bumptech.glide.load.model.ModelCache$a */
    /* loaded from: classes3.dex */
    public class C5835a extends LruCache {
        public C5835a(long j) {
            super(j);
        }

        @Override // com.bumptech.glide.util.LruCache
        /* renamed from: b */
        public void onItemEvicted(C5836b c5836b, Object obj) {
            c5836b.m50280c();
        }
    }

    /* renamed from: com.bumptech.glide.load.model.ModelCache$b */
    /* loaded from: classes3.dex */
    public static final class C5836b {

        /* renamed from: d */
        public static final Queue f42228d = Util.createQueue(0);

        /* renamed from: a */
        public int f42229a;

        /* renamed from: b */
        public int f42230b;

        /* renamed from: c */
        public Object f42231c;

        /* renamed from: a */
        public static C5836b m50282a(Object obj, int i, int i2) {
            C5836b c5836b;
            Queue queue = f42228d;
            synchronized (queue) {
                c5836b = (C5836b) queue.poll();
            }
            if (c5836b == null) {
                c5836b = new C5836b();
            }
            c5836b.m50281b(obj, i, i2);
            return c5836b;
        }

        /* renamed from: b */
        public final void m50281b(Object obj, int i, int i2) {
            this.f42231c = obj;
            this.f42230b = i;
            this.f42229a = i2;
        }

        /* renamed from: c */
        public void m50280c() {
            Queue queue = f42228d;
            synchronized (queue) {
                queue.offer(this);
            }
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C5836b)) {
                return false;
            }
            C5836b c5836b = (C5836b) obj;
            if (this.f42230b != c5836b.f42230b || this.f42229a != c5836b.f42229a || !this.f42231c.equals(c5836b.f42231c)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((this.f42229a * 31) + this.f42230b) * 31) + this.f42231c.hashCode();
        }
    }

    public ModelCache() {
        this(250L);
    }

    public void clear() {
        this.f42226a.clearMemory();
    }

    @Nullable
    public B get(A a, int i, int i2) {
        C5836b m50282a = C5836b.m50282a(a, i, i2);
        B b = (B) this.f42226a.get(m50282a);
        m50282a.m50280c();
        return b;
    }

    public void put(A a, int i, int i2, B b) {
        this.f42226a.put(C5836b.m50282a(a, i, i2), b);
    }

    public ModelCache(long j) {
        this.f42226a = new C5835a(j);
    }
}