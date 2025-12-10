package p000;

import io.reactivex.functions.Consumer;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: OO1 */
/* loaded from: classes5.dex */
public final class OO1 implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ Function1 f4400a;

    public OO1(Function1 function1) {
        this.f4400a = function1;
    }

    @Override // io.reactivex.functions.Consumer
    public final /* synthetic */ void accept(Object obj) {
        Intrinsics.checkExpressionValueIsNotNull(this.f4400a.invoke(obj), "invoke(...)");
    }
}
