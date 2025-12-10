package th.p047co.dtac.android.dtacone.view.appOne.tol.screen.discount;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.model.appOne.tol.discount.DiscountInfoItem;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.discount.DiscountContractScreenKt$DiscountContractScreen$2 */
/* loaded from: classes10.dex */
public final class DiscountContractScreenKt$DiscountContractScreen$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ List<DiscountInfoItem> $discountContractList;
    final /* synthetic */ Function1<Integer, Unit> $onContractSelected;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DiscountContractScreenKt$DiscountContractScreen$2(List<DiscountInfoItem> list, Function1<? super Integer, Unit> function1, int i) {
        super(2);
        this.$discountContractList = list;
        this.$onContractSelected = function1;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable Composer composer, int i) {
        DiscountContractScreenKt.DiscountContractScreen(this.$discountContractList, this.$onContractSelected, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}