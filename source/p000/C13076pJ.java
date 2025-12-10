package p000;

import java.util.concurrent.Future;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* renamed from: pJ */
/* loaded from: classes6.dex */
public final class C13076pJ implements DisposableHandle {

    /* renamed from: a */
    public final Future f76554a;

    public C13076pJ(Future future) {
        this.f76554a = future;
    }

    @Override // kotlinx.coroutines.DisposableHandle
    public void dispose() {
        this.f76554a.cancel(false);
    }

    public String toString() {
        return "DisposableFutureHandle[" + this.f76554a + AbstractJsonLexerKt.END_LIST;
    }
}
