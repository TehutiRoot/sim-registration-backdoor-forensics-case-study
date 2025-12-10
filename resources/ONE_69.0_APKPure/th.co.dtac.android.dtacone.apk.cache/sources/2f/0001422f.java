package th.p047co.dtac.android.dtacone.view.appOne.tol.screen.discount;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.view.appOne.tol.viewmodel.state.DiscountListState;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.discount.DiscountSelectScreenKt$DiscountList$2 */
/* loaded from: classes10.dex */
public final class DiscountSelectScreenKt$DiscountList$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ DiscountListState $discountListState;
    final /* synthetic */ Function1<String, Unit> $onDiscountSelected;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DiscountSelectScreenKt$DiscountList$2(DiscountListState discountListState, Function1<? super String, Unit> function1, int i) {
        super(2);
        this.$discountListState = discountListState;
        this.$onDiscountSelected = function1;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable Composer composer, int i) {
        DiscountSelectScreenKt.m9571b(this.$discountListState, this.$onDiscountSelected, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}