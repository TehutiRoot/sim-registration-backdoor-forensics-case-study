package th.p047co.dtac.android.dtacone.view.appOne.tol.screen.discount;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.appOne.tol.discount.DiscountInfoItem;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.discount.DiscountContractScreenKt$ContractItem$1$1 */
/* loaded from: classes10.dex */
public final class DiscountContractScreenKt$ContractItem$1$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ DiscountInfoItem $contract;
    final /* synthetic */ Function1<Integer, Unit> $onContractSelected;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DiscountContractScreenKt$ContractItem$1$1(Function1<? super Integer, Unit> function1, DiscountInfoItem discountInfoItem) {
        super(0);
        this.$onContractSelected = function1;
        this.$contract = discountInfoItem;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$onContractSelected.invoke(Integer.valueOf(this.$contract.getDiscountPeriodValue()));
    }
}