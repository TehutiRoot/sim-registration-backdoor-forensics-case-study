package p000;

import io.reactivex.Maybe;
import io.reactivex.MaybeSource;
import io.reactivex.internal.fuseable.HasUpstreamMaybeSource;

/* renamed from: Y */
/* loaded from: classes5.dex */
public abstract class AbstractC1707Y extends Maybe implements HasUpstreamMaybeSource {
    protected final MaybeSource<Object> source;

    public AbstractC1707Y(MaybeSource maybeSource) {
        this.source = maybeSource;
    }

    @Override // io.reactivex.internal.fuseable.HasUpstreamMaybeSource
    public final MaybeSource<Object> source() {
        return this.source;
    }
}