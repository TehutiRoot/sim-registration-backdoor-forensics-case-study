package com.google.android.datatransport.runtime.dagger.internal;

import com.google.android.datatransport.runtime.dagger.Lazy;

/* loaded from: classes3.dex */
public final class InstanceFactory<T> implements Factory<T>, Lazy<T> {

    /* renamed from: b */
    public static final InstanceFactory f44119b = new InstanceFactory(null);

    /* renamed from: a */
    public final Object f44120a;

    public InstanceFactory(Object obj) {
        this.f44120a = obj;
    }

    /* renamed from: a */
    public static InstanceFactory m49123a() {
        return f44119b;
    }

    public static <T> Factory<T> create(T t) {
        return new InstanceFactory(Preconditions.checkNotNull(t, "instance cannot be null"));
    }

    public static <T> Factory<T> createNullable(T t) {
        if (t == null) {
            return m49123a();
        }
        return new InstanceFactory(t);
    }

    @Override // javax.inject.Provider
    public T get() {
        return (T) this.f44120a;
    }
}