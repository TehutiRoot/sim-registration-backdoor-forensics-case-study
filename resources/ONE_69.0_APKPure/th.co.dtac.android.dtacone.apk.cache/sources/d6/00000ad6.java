package p000;

import io.reactivex.functions.Consumer;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: LP1 */
/* loaded from: classes5.dex */
public final class LP1 implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ Function1 f3610a;

    public LP1(Function1 function1) {
        this.f3610a = function1;
    }

    @Override // io.reactivex.functions.Consumer
    public final /* synthetic */ void accept(Object obj) {
        Intrinsics.checkExpressionValueIsNotNull(this.f3610a.invoke(obj), "invoke(...)");
    }
}