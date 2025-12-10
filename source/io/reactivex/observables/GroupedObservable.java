package io.reactivex.observables;

import io.reactivex.Observable;
import io.reactivex.annotations.Nullable;

/* loaded from: classes5.dex */
public abstract class GroupedObservable<K, T> extends Observable<T> {

    /* renamed from: a */
    public final Object f66132a;

    public GroupedObservable(@Nullable K k) {
        this.f66132a = k;
    }

    @Nullable
    public K getKey() {
        return (K) this.f66132a;
    }
}
