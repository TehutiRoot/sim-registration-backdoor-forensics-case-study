package dagger.internal;

import dagger.Lazy;

/* loaded from: classes5.dex */
public final class InstanceFactory<T> implements Factory<T>, Lazy<T> {

    /* renamed from: b */
    public static final InstanceFactory f61281b = new InstanceFactory(null);

    /* renamed from: a */
    public final Object f61282a;

    public InstanceFactory(Object obj) {
        this.f61282a = obj;
    }

    /* renamed from: a */
    public static InstanceFactory m31803a() {
        return f61281b;
    }

    public static <T> Factory<T> create(T t) {
        return new InstanceFactory(Preconditions.checkNotNull(t, "instance cannot be null"));
    }

    public static <T> Factory<T> createNullable(T t) {
        if (t == null) {
            return m31803a();
        }
        return new InstanceFactory(t);
    }

    @Override // javax.inject.Provider
    public T get() {
        return (T) this.f61282a;
    }
}