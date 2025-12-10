package kotlin.reflect.jvm.internal.impl.resolve;

import java.util.AbstractCollection;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.utils.SmartSet;

/* renamed from: kotlin.reflect.jvm.internal.impl.resolve.OverridingUtilsKt$selectMostSpecificInEachOverridableGroup$overridableGroup$1 */
/* loaded from: classes6.dex */
public final class C11951x410e6287 extends Lambda implements Function1<H, Unit> {
    final /* synthetic */ SmartSet<H> $conflictedHandles;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11951x410e6287(SmartSet<H> smartSet) {
        super(1);
        this.$conflictedHandles = smartSet;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
        invoke2((C11951x410e6287) obj);
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function1
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(H it) {
        AbstractCollection abstractCollection = this.$conflictedHandles;
        Intrinsics.checkNotNullExpressionValue(it, "it");
        abstractCollection.add(it);
    }
}
