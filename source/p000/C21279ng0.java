package p000;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CancelHandler;
import kotlinx.coroutines.DebugStringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* renamed from: ng0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C21279ng0 extends CancelHandler {

    /* renamed from: a */
    public final Function1 f72418a;

    public C21279ng0(Function1 function1) {
        this.f72418a = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
        invoke2(th2);
        return Unit.INSTANCE;
    }

    public String toString() {
        return "InvokeOnCancel[" + DebugStringsKt.getClassSimpleName(this.f72418a) + '@' + DebugStringsKt.getHexAddress(this) + AbstractJsonLexerKt.END_LIST;
    }

    @Override // kotlinx.coroutines.CancelHandlerBase
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public void invoke2(Throwable th2) {
        this.f72418a.invoke(th2);
    }
}
