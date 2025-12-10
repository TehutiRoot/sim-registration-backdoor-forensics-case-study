package p000;

import java.util.concurrent.Future;
import kotlin.Unit;
import kotlinx.coroutines.CancelHandler;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* renamed from: sl */
/* loaded from: classes6.dex */
public final class C13948sl extends CancelHandler {

    /* renamed from: a */
    public final Future f79876a;

    public C13948sl(Future future) {
        this.f79876a = future;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
        invoke2(th2);
        return Unit.INSTANCE;
    }

    public String toString() {
        return "CancelFutureOnCancel[" + this.f79876a + AbstractJsonLexerKt.END_LIST;
    }

    @Override // kotlinx.coroutines.CancelHandlerBase
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public void invoke2(Throwable th2) {
        if (th2 != null) {
            this.f79876a.cancel(false);
        }
    }
}
