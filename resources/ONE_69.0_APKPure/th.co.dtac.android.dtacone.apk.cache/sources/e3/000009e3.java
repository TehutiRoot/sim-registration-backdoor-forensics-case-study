package p000;

import io.reactivex.functions.Action;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: KP1 */
/* loaded from: classes5.dex */
public final class KP1 implements Action {

    /* renamed from: a */
    public final /* synthetic */ Function0 f3311a;

    public KP1(Function0 function0) {
        this.f3311a = function0;
    }

    @Override // io.reactivex.functions.Action
    public final /* synthetic */ void run() {
        Intrinsics.checkExpressionValueIsNotNull(this.f3311a.invoke(), "invoke(...)");
    }
}