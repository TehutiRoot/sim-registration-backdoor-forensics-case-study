package io.reactivex.flowables;

import io.reactivex.Flowable;
import io.reactivex.annotations.Nullable;

/* loaded from: classes5.dex */
public abstract class GroupedFlowable<K, T> extends Flowable<T> {

    /* renamed from: b */
    public final Object f63884b;

    public GroupedFlowable(@Nullable K k) {
        this.f63884b = k;
    }

    @Nullable
    public K getKey() {
        return (K) this.f63884b;
    }
}