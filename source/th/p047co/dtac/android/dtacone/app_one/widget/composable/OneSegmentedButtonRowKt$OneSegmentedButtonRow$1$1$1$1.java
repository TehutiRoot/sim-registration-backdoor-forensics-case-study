package th.p047co.dtac.android.dtacone.app_one.widget.composable;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.app_one.widget.composable.OneSegmentedButtonRowKt$OneSegmentedButtonRow$1$1$1$1 */
/* loaded from: classes7.dex */
public final class OneSegmentedButtonRowKt$OneSegmentedButtonRow$1$1$1$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ int $index;
    final /* synthetic */ Function1<Integer, Unit> $onSelectedChange;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OneSegmentedButtonRowKt$OneSegmentedButtonRow$1$1$1$1(Function1<? super Integer, Unit> function1, int i) {
        super(0);
        this.$onSelectedChange = function1;
        this.$index = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$onSelectedChange.invoke(Integer.valueOf(this.$index));
    }
}
