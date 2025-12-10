package androidx.core.util;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
public final class Pools {

    /* loaded from: classes2.dex */
    public interface Pool<T> {
        @Nullable
        T acquire();

        boolean release(@NonNull T t);
    }

    /* loaded from: classes2.dex */
    public static class SimplePool<T> implements Pool<T> {

        /* renamed from: a */
        public final Object[] f34191a;

        /* renamed from: b */
        public int f34192b;

        public SimplePool(int i) {
            if (i > 0) {
                this.f34191a = new Object[i];
                return;
            }
            throw new IllegalArgumentException("The max pool size must be > 0");
        }

        /* renamed from: a */
        public final boolean m57008a(Object obj) {
            for (int i = 0; i < this.f34192b; i++) {
                if (this.f34191a[i] == obj) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.core.util.Pools.Pool
        public T acquire() {
            int i = this.f34192b;
            if (i <= 0) {
                return null;
            }
            int i2 = i - 1;
            Object[] objArr = this.f34191a;
            T t = (T) objArr[i2];
            objArr[i2] = null;
            this.f34192b = i - 1;
            return t;
        }

        @Override // androidx.core.util.Pools.Pool
        public boolean release(@NonNull T t) {
            if (!m57008a(t)) {
                int i = this.f34192b;
                Object[] objArr = this.f34191a;
                if (i < objArr.length) {
                    objArr[i] = t;
                    this.f34192b = i + 1;
                    return true;
                }
                return false;
            }
            throw new IllegalStateException("Already in the pool!");
        }
    }

    /* loaded from: classes2.dex */
    public static class SynchronizedPool<T> extends SimplePool<T> {

        /* renamed from: c */
        public final Object f34193c;

        public SynchronizedPool(int i) {
            super(i);
            this.f34193c = new Object();
        }

        @Override // androidx.core.util.Pools.SimplePool, androidx.core.util.Pools.Pool
        public T acquire() {
            T t;
            synchronized (this.f34193c) {
                t = (T) super.acquire();
            }
            return t;
        }

        @Override // androidx.core.util.Pools.SimplePool, androidx.core.util.Pools.Pool
        public boolean release(@NonNull T t) {
            boolean release;
            synchronized (this.f34193c) {
                release = super.release(t);
            }
            return release;
        }
    }
}