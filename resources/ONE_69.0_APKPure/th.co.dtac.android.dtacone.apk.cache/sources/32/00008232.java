package com.bumptech.glide.util.pool;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.core.util.Pools;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class FactoryPools {

    /* renamed from: a */
    public static final Resetter f42757a = new C5929a();

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
    public class C5929a implements Resetter {
        @Override // com.bumptech.glide.util.pool.FactoryPools.Resetter
        public void reset(Object obj) {
        }
    }

    /* renamed from: com.bumptech.glide.util.pool.FactoryPools$b */
    /* loaded from: classes3.dex */
    public class C5930b implements Factory {
        @Override // com.bumptech.glide.util.pool.FactoryPools.Factory
        /* renamed from: a */
        public List create() {
            return new ArrayList();
        }
    }

    /* renamed from: com.bumptech.glide.util.pool.FactoryPools$c */
    /* loaded from: classes3.dex */
    public class C5931c implements Resetter {
        @Override // com.bumptech.glide.util.pool.FactoryPools.Resetter
        /* renamed from: a */
        public void reset(List list) {
            list.clear();
        }
    }

    /* renamed from: com.bumptech.glide.util.pool.FactoryPools$d */
    /* loaded from: classes3.dex */
    public static final class C5932d implements Pools.Pool {

        /* renamed from: a */
        public final Factory f42758a;

        /* renamed from: b */
        public final Resetter f42759b;

        /* renamed from: c */
        public final Pools.Pool f42760c;

        public C5932d(Pools.Pool pool, Factory factory, Resetter resetter) {
            this.f42760c = pool;
            this.f42758a = factory;
            this.f42759b = resetter;
        }

        @Override // androidx.core.util.Pools.Pool
        public Object acquire() {
            Object acquire = this.f42760c.acquire();
            if (acquire == null) {
                acquire = this.f42758a.create();
                if (Log.isLoggable("FactoryPools", 2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Created new ");
                    sb.append(acquire.getClass());
                }
            }
            if (acquire instanceof Poolable) {
                ((Poolable) acquire).getVerifier().mo49972a(false);
            }
            return acquire;
        }

        @Override // androidx.core.util.Pools.Pool
        public boolean release(Object obj) {
            if (obj instanceof Poolable) {
                ((Poolable) obj).getVerifier().mo49972a(true);
            }
            this.f42759b.reset(obj);
            return this.f42760c.release(obj);
        }
    }

    /* renamed from: a */
    public static Pools.Pool m49977a(Pools.Pool pool, Factory factory) {
        return m49976b(pool, factory, m49975c());
    }

    /* renamed from: b */
    public static Pools.Pool m49976b(Pools.Pool pool, Factory factory, Resetter resetter) {
        return new C5932d(pool, factory, resetter);
    }

    /* renamed from: c */
    public static Resetter m49975c() {
        return f42757a;
    }

    @NonNull
    public static <T extends Poolable> Pools.Pool<T> simple(int i, @NonNull Factory<T> factory) {
        return m49977a(new Pools.SimplePool(i), factory);
    }

    @NonNull
    public static <T extends Poolable> Pools.Pool<T> threadSafe(int i, @NonNull Factory<T> factory) {
        return m49977a(new Pools.SynchronizedPool(i), factory);
    }

    @NonNull
    public static <T> Pools.Pool<List<T>> threadSafeList() {
        return threadSafeList(20);
    }

    @NonNull
    public static <T extends Poolable> Pools.Pool<T> threadSafe(int i, @NonNull Factory<T> factory, @NonNull Resetter<T> resetter) {
        return m49976b(new Pools.SynchronizedPool(i), factory, resetter);
    }

    @NonNull
    public static <T> Pools.Pool<List<T>> threadSafeList(int i) {
        return m49976b(new Pools.SynchronizedPool(i), new C5930b(), new C5931c());
    }
}