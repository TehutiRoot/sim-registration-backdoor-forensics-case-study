package p000;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CancelHandler;
import kotlinx.coroutines.DebugStringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* renamed from: tg0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C22377tg0 extends CancelHandler {

    /* renamed from: a */
    public final Function1 f80269a;

    public C22377tg0(Function1 function1) {
        this.f80269a = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
        invoke2(th2);
        return Unit.INSTANCE;
    }

    public String toString() {
        return "InvokeOnCancel[" + DebugStringsKt.getClassSimpleName(this.f80269a) + '@' + DebugStringsKt.getHexAddress(this) + AbstractJsonLexerKt.END_LIST;
    }

    @Override // kotlinx.coroutines.CancelHandlerBase
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public void invoke2(Throwable th2) {
        this.f80269a.invoke(th2);
    }
}