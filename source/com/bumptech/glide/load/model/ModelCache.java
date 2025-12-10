package com.bumptech.glide.load.model;

import androidx.annotation.Nullable;
import com.bumptech.glide.util.LruCache;
import com.bumptech.glide.util.Util;
import java.util.Queue;

/* loaded from: classes3.dex */
public class ModelCache<A, B> {

    /* renamed from: a */
    public final LruCache f42214a;

    /* renamed from: com.bumptech.glide.load.model.ModelCache$a */
    /* loaded from: classes3.dex */
    public class C5846a extends LruCache {
        public C5846a(long j) {
            super(j);
        }

        @Override // com.bumptech.glide.util.LruCache
        /* renamed from: b */
        public void onItemEvicted(C5847b c5847b, Object obj) {
            c5847b.m50283c();
        }
    }

    /* renamed from: com.bumptech.glide.load.model.ModelCache$b */
    /* loaded from: classes3.dex */
    public static final class C5847b {

        /* renamed from: d */
        public static final Queue f42216d = Util.createQueue(0);

        /* renamed from: a */
        public int f42217a;

        /* renamed from: b */
        public int f42218b;

        /* renamed from: c */
        public Object f42219c;

        /* renamed from: a */
        public static C5847b m50285a(Object obj, int i, int i2) {
            C5847b c5847b;
            Queue queue = f42216d;
            synchronized (queue) {
                c5847b = (C5847b) queue.poll();
            }
            if (c5847b == null) {
                c5847b = new C5847b();
            }
            c5847b.m50284b(obj, i, i2);
            return c5847b;
        }

        /* renamed from: b */
        public final void m50284b(Object obj, int i, int i2) {
            this.f42219c = obj;
            this.f42218b = i;
            this.f42217a = i2;
        }

        /* renamed from: c */
        public void m50283c() {
            Queue queue = f42216d;
            synchronized (queue) {
                queue.offer(this);
            }
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C5847b)) {
                return false;
            }
            C5847b c5847b = (C5847b) obj;
            if (this.f42218b != c5847b.f42218b || this.f42217a != c5847b.f42217a || !this.f42219c.equals(c5847b.f42219c)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((this.f42217a * 31) + this.f42218b) * 31) + this.f42219c.hashCode();
        }
    }

    public ModelCache() {
        this(250L);
    }

    public void clear() {
        this.f42214a.clearMemory();
    }

    @Nullable
    public B get(A a, int i, int i2) {
        C5847b m50285a = C5847b.m50285a(a, i, i2);
        B b = (B) this.f42214a.get(m50285a);
        m50285a.m50283c();
        return b;
    }

    public void put(A a, int i, int i2, B b) {
        this.f42214a.put(C5847b.m50285a(a, i, i2), b);
    }

    public ModelCache(long j) {
        this.f42214a = new C5846a(j);
    }
}
