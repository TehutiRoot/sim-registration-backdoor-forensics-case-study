package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.internal.fuseable.HasUpstreamObservableSource;

/* renamed from: io.reactivex.internal.operators.observable.a */
/* loaded from: classes5.dex */
public abstract class AbstractC11091a extends Observable implements HasUpstreamObservableSource {
    protected final ObservableSource<Object> source;

    public AbstractC11091a(ObservableSource observableSource) {
        this.source = observableSource;
    }

    @Override // io.reactivex.internal.fuseable.HasUpstreamObservableSource
    public final ObservableSource<Object> source() {
        return this.source;
    }
}
