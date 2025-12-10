package th.p047co.dtac.android.dtacone.view.fragment.upPass.compose;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.fragment.upPass.compose.SelectOptionsScreenKt$OptionInt$1$2$1 */
/* loaded from: classes9.dex */
public final class SelectOptionsScreenKt$OptionInt$1$2$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ boolean $increaseEnabled;
    final /* synthetic */ int $max;
    final /* synthetic */ Function1<Integer, Unit> $onValueChange;
    final /* synthetic */ int $value;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SelectOptionsScreenKt$OptionInt$1$2$1(Function1<? super Integer, Unit> function1, boolean z, int i, int i2) {
        super(0);
        this.$onValueChange = function1;
        this.$increaseEnabled = z;
        this.$value = i;
        this.$max = i2;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$onValueChange.invoke(Integer.valueOf(this.$increaseEnabled ? this.$value + 1 : this.$max));
    }
}