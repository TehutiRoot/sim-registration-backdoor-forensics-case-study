package p000;

import io.reactivex.functions.Action;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: NO1 */
/* loaded from: classes5.dex */
public final class NO1 implements Action {

    /* renamed from: a */
    public final /* synthetic */ Function0 f4095a;

    public NO1(Function0 function0) {
        this.f4095a = function0;
    }

    @Override // io.reactivex.functions.Action
    public final /* synthetic */ void run() {
        Intrinsics.checkExpressionValueIsNotNull(this.f4095a.invoke(), "invoke(...)");
    }
}
