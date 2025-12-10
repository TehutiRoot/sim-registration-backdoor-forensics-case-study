package com.bumptech.glide.util.pool;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.core.util.Pools;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class FactoryPools {

    /* renamed from: a */
    public static final Resetter f42745a = new C5940a();

    /* loaded from: classes3.dex */
    public interface Factory<T> {
        T create();
    }

    /* loaded from: classes3.dex */
    public interface Poolable {
        @NonNull
        StateVerifier getVerifier();
    }

    /* loaded from: classes3.dex */
    public interface Resetter<T> {
        void reset(@NonNull T t);
    }

    /* renamed from: com.bumptech.glide.util.pool.FactoryPools$a */
    /* loaded from: classes3.dex */
    public class C5940a implements Resetter {
        @Override // com.bumptech.glide.util.pool.FactoryPools.Resetter
        public void reset(Object obj) {
        }
    }

    /* renamed from: com.bumptech.glide.util.pool.FactoryPools$b */
    /* loaded from: classes3.dex */
    public class C5941b implements Factory {
        @Override // com.bumptech.glide.util.pool.FactoryPools.Factory
        /* renamed from: a */
        public List create() {
            return new ArrayList();
        }
    }

    /* renamed from: com.bumptech.glide.util.pool.FactoryPools$c */
    /* loaded from: classes3.dex */
    public class C5942c implements Resetter {
        @Override // com.bumptech.glide.util.pool.FactoryPools.Resetter
        /* renamed from: a */
        public void reset(List list) {
            list.clear();
        }
    }

    /* renamed from: com.bumptech.glide.util.pool.FactoryPools$d */
    /* loaded from: classes3.dex */
    public static final class C5943d implements Pools.Pool {

        /* renamed from: a */
        public final Factory f42746a;

        /* renamed from: b */
        public final Resetter f42747b;

        /* renamed from: c */
        public final Pools.Pool f42748c;

        public C5943d(Pools.Pool pool, Factory factory, Resetter resetter) {
            this.f42748c = pool;
            this.f42746a = factory;
            this.f42747b = resetter;
        }

        @Override // androidx.core.util.Pools.Pool
        public Object acquire() {
            Object acquire = this.f42748c.acquire();
            if (acquire == null) {
                acquire = this.f42746a.create();
                if (Log.isLoggable("FactoryPools", 2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Created new ");
                    sb.append(acquire.getClass());
                }
            }
            if (acquire instanceof Poolable) {
                ((Poolable) acquire).getVerifier().mo49975a(false);
            }
            return acquire;
        }

        @Override // androidx.core.util.Pools.Pool
        public boolean release(Object obj) {
            if (obj instanceof Poolable) {
                ((Poolable) obj).getVerifier().mo49975a(true);
            }
            this.f42747b.reset(obj);
            return this.f42748c.release(obj);
        }
    }

    /* renamed from: a */
    public static Pools.Pool m49980a(Pools.Pool pool, Factory factory) {
        return m49979b(pool, factory, m49978c());
    }

    /* renamed from: b */
    public static Pools.Pool m49979b(Pools.Pool pool, Factory factory, Resetter resetter) {
        return new C5943d(pool, factory, resetter);
    }

    /* renamed from: c */
    public static Resetter m49978c() {
        return f42745a;
    }

    @NonNull
    public static <T extends Poolable> Pools.Pool<T> simple(int i, @NonNull Factory<T> factory) {
        return m49980a(new Pools.SimplePool(i), factory);
    }

    @NonNull
    public static <T extends Poolable> Pools.Pool<T> threadSafe(int i, @NonNull Factory<T> factory) {
        return m49980a(new Pools.SynchronizedPool(i), factory);
    }

    @NonNull
    public static <T> Pools.Pool<List<T>> threadSafeList() {
        return threadSafeList(20);
    }

    @NonNull
    public static <T extends Poolable> Pools.Pool<T> threadSafe(int i, @NonNull Factory<T> factory, @NonNull Resetter<T> resetter) {
        return m49979b(new Pools.SynchronizedPool(i), factory, resetter);
    }

    @NonNull
    public static <T> Pools.Pool<List<T>> threadSafeList(int i) {
        return m49979b(new Pools.SynchronizedPool(i), new C5941b(), new C5942c());
    }
}
