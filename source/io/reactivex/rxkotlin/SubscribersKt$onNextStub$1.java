package io.reactivex.rxkotlin;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(m28852bv = {1, 0, 3}, m28851d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28850d2 = {"<anonymous>", "", "it", "", "invoke"}, m28849k = 3, m28848mv = {1, 1, 15})
/* loaded from: classes5.dex */
public final class SubscribersKt$onNextStub$1 extends Lambda implements Function1<Object, Unit> {
    public static final SubscribersKt$onNextStub$1 INSTANCE = new SubscribersKt$onNextStub$1();

    public SubscribersKt$onNextStub$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
        invoke2(obj);
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function1
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull Object it) {
        Intrinsics.checkParameterIsNotNull(it, "it");
    }
}
