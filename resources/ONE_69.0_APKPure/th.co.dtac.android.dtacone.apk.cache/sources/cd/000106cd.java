package p000;

import java.util.concurrent.Future;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* renamed from: qJ */
/* loaded from: classes6.dex */
public final class C13175qJ implements DisposableHandle {

    /* renamed from: a */
    public final Future f77163a;

    public C13175qJ(Future future) {
        this.f77163a = future;
    }

    @Override // kotlinx.coroutines.DisposableHandle
    public void dispose() {
        this.f77163a.cancel(false);
    }

    public String toString() {
        return "DisposableFutureHandle[" + this.f77163a + AbstractJsonLexerKt.END_LIST;
    }
}