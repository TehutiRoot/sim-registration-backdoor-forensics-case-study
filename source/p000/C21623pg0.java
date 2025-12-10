package p000;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.JobNode;

/* renamed from: pg0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C21623pg0 extends JobNode {

    /* renamed from: d */
    public final Function1 f76648d;

    public C21623pg0(Function1 function1) {
        this.f76648d = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
        invoke2(th2);
        return Unit.INSTANCE;
    }

    @Override // kotlinx.coroutines.CompletionHandlerBase
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public void invoke2(Throwable th2) {
        this.f76648d.invoke(th2);
    }
}
