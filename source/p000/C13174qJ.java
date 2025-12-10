package p000;

import kotlin.Unit;
import kotlinx.coroutines.CancelHandler;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* renamed from: qJ */
/* loaded from: classes6.dex */
public final class C13174qJ extends CancelHandler {

    /* renamed from: a */
    public final DisposableHandle f76947a;

    public C13174qJ(DisposableHandle disposableHandle) {
        this.f76947a = disposableHandle;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
        invoke2(th2);
        return Unit.INSTANCE;
    }

    public String toString() {
        return "DisposeOnCancel[" + this.f76947a + AbstractJsonLexerKt.END_LIST;
    }

    @Override // kotlinx.coroutines.CancelHandlerBase
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public void invoke2(Throwable th2) {
        this.f76947a.dispose();
    }
}
